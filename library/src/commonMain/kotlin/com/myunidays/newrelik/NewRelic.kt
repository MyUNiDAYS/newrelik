package com.myunidays.newrelik

expect class NewRelic {

    fun start(context: Context) // going to need to pass in a context here for android
//ios Context = UIApplication in UIKit
    //android use application
    fun disableFeature(featureFlag: FeatureFlag)

    fun enableFeature(featureFlag: FeatureFlag)

    fun setInteractionName(name: String?)

    fun startInteraction(actionName: String)

    fun startInteraction(activityContext: Context, actionName: String)

    fun endInteraction(id: String)

    fun currentSessionId()

    fun recordBreadcrumb(breadcrumbName: String?, attributes: Map<String?, Any?>?)

    fun recordBreadcrumb(breadcrumbName: String?, attributes: MutableMap<String?, Any?>?): Boolean

    fun recordHandledException(throwable: Throwable?)

    fun recordHandledException(exception: Exception?, exceptionAttributes: Map<String?, Any?>?)

    fun recordHandledException(throwable: Throwable?, attributes: Map<String?, Any?>?)

    fun recordError(error: Any, map: Map<Any?, Any>?)

    fun recordCustomEvent(eventType: String?, eventName: String?, eventAttributes: MutableMap<String?, Any?>?)

    fun recordCustomEvent(eventType: String?, eventAttributes: Map<String?, Any?>?): Boolean

    fun recordMetric(name: String, category: String, count: Int, totalValue: Double, exclusiveValue: Double, countUnit: MetricUnit, valueUnit: MetricUnit)

    fun recordMetric(name: String?, category: String?, value: Double)

    fun recordMetric(name: String?, category: String?)

    fun setAttribute(name: String?, value: String?)

    fun setAttribute(name: String?, value: Double)

    fun setAttribute(name: String?, value: Boolean)

    fun removeAttribute(name: String?)

    fun removeAllAttributes()

    fun incrementAttribute(name: String)

    fun incrementAttribute(name: String, value : Double)

    fun setUserId(userId: String?)

    fun setMaxEventBufferTime(maxBufferTimeInSec: Int)

    fun setMaxEventPoolSize(maxSize: Int)

    fun withApplicationBuild(buildId: String?)

    fun withApplicationVersion(appVersion: String?)

    fun shutdown()

    fun crashNow()

    fun crashNow(message: String)

    fun noticeHttpTransaction(url: String?, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long)

    fun noticeHttpTransaction(url: String?, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long, responseBody: String?)

    fun noticeHttpTransaction(url: String?, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long, responseBody: String?, params: Map<String?, String?>?)

    fun noticeHttpTransaction(url: String?, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long, responseBody: String?, params: Map<String?, String?>?, appData: String?)

    fun noticeHttpTransaction(url: String?, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long, responseBody: String?, params: Map<String?, String?>?, urlConnection: URLConnection?)

    fun noticeHttpTransaction(url: String, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long, responseBody: String?, params: Map<String?, String?>?, appData: String?, traceAttributes: Map<String?, Any?>?)

    fun noticeNetworkFailure(url: String?, httpMethod: String?, startTime: Long, endTime: Long, failure: NetworkFailure, message: String?)

    fun noticeNetworkFailure(url: String?, httpMethod: String?, startTime: Long, endTime: Long, failure: NetworkFailure)

    fun noticeNetworkFailure(url: String?, httpMethod: String?, startTime: Long, endTime: Long, e: Exception)


    @Deprecated("")
    fun noticeNetworkFailure(url: String?, startTime: Long, endTime: Long, failure: NetworkFailure?)


    @Deprecated("")
    fun noticeNetworkFailure(url: String?, startTime: Long, endTime: Long, e: Exception?)

    fun noticeNetworkFailure(url: String?, httpMethod: String?, startTimeMs: Long, endTimeMs: Long, failure: NetworkFailure, message: String?, traceAttributes: Map<String?, Any?>?)

    fun noticeDistributedTrace(requestAttributes: Map<String?, String?>?): TraceContext

    fun addHTTPHeadersTrackingFor(headers: List<String>)

    fun withLaunchActivityName(className: String?)

    fun usingCollectorAddress(address: String)

    fun usingCrashCollectorAddress(address: String)

    fun withLoggingEnabled(enabled: Boolean)

    fun withLogLevel(level: Int)

    fun withApplicationFramework(applicationFramework: ApplicationFramework, frameworkVersion: String)

    fun withCrashReportingEnabled(enabled: Boolean)

    fun withDistributedTraceListener(listener: TraceListener)

    fun withDeviceID(deviceId: String)

    fun isStarted()

    fun startMethodTrace(actionName: String)

    fun endMethodTrace()

    companion object {
        fun withApplicationToken(token: String): NewRelic
    }
}