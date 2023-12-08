package com.myunidays.newrelik

expect class NewRelic {

    fun crashNow()

    fun start() // going to need to pass in a context here for android

    fun disableFeature(featureFlag: FeatureFlag)

    fun enableFeature(featureFlag: FeatureFlag)

    fun setInteractionName(name: String?)

    fun startInteraction(actionName: String)

    fun endInteraction(id: String)

    fun currentSessionId()

    fun recordBreadcrumb(breadcrumbName: String, attributes: Map<String?, Any?>)

    fun recordHandledException(exception: Exception?, exceptionAttributes: Map<String?, Any?>?)

    fun recordHandledException(throwable: Throwable?)

    fun recordHandledException(throwable: Throwable?, attributes: Map<String?, Any?>?)

    fun recordError(error: $Error, map $eventAttributes)

    fun recordCustomEvent(eventType: String?, eventName: String?, eventAttributes: MutableMap<String?, Any?>?)

    fun recordMetric(name: String, category: String, count: Int, totalValue: Double, exclusiveValue: Double, countUnit: MetricUnit, valueUnit: MetricUnit)

    fun recordMetric(name: String?, category: String?, value: Double = 1.0)

    fun setAttribute(name: String?, value: String?)

    fun setAttribute(name: String, value: Double)

    fun setAttribute(name: String?, value: Boolean)

    fun removeAttribute(name: String)

    fun removeAllAttributes()

    fun incrementAttribute(name: String, value : Double)

    fun setUserId(userId: String)

    fun setMaxEventBufferTime(maxBufferTimeInSec: Int)

    fun setMaxEventPoolSize(maxSize: Int)

    fun withApplicationBuild(buildId: String)

    fun withApplicationVersion(appVersion: String?)

    fun shutdown()

    fun crashNow(message: String)

    fun noticeHttpTransaction(url: String?, httpMethod: String?, statusCode: Int, startTimeMs: Long, endTimeMs: Long, bytesSent: Long, bytesReceived: Long, responseBody: String?)

    fun noticeNetworkFailure(url: String?, httpMethod: String?, startTime: Long, endTime: Long, failure: NetworkFailure?)

    fun addHTTPHeadersTrackingFor(headers: List<String>)

    fun withLaunchActivityName(className: String?)

    companion object {
        fun withApplicationToken(token: String): NewRelic
    }
}