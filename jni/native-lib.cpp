#include <jni.h>
#include <string>
#include <android/log.h>
#include <opencv2/imgproc.hpp>
#include <opencv2/core.hpp>

#define LOG_TAG "native-lib"
#define ALOG(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)

extern "C" JNIEXPORT jlong JNICALL
Java_com_example_edgedetection_MainActivity_processFrame(JNIEnv *env, jobject /* this */, jlong bufPtr, jint width, jint height) {
    // This is a stub demonstrating where you'd convert the incoming frame to a cv::Mat,
    // run Canny or grayscale, and then return a pointer/reference (or update a texture).
    ALOG("processFrame called width=%d height=%d", width, height);
    // TODO: implement actual conversion and processing using OpenCV C++ APIs
    return 0;
}
