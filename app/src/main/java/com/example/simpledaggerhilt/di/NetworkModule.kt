package com.example.simpledaggerhilt.di

import com.example.simpledaggerhilt.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Singleton
    @Provides
    fun provideInterceptor(): Interceptor {
        return Interceptor {
            val originalRequest = it.request()
            val request = originalRequest.newBuilder().url(originalRequest.url).build()
            Timber.d("{$request.toString()}")
            it.proceed(request)
        }
    }

    @Singleton
    @Provides
     fun provideOkHttpClient(interceptor: Interceptor): OkHttpClient {
        Timber.d("NetworkModule provideOkHttpClient()")
         return OkHttpClient.Builder()
             .addInterceptor(interceptor)
             .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        Timber.d("NetworkModule provideRetrofit()")
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}