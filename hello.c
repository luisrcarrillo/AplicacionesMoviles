#include<stdio.h>
#include<jni.h>
#include "hello.h" 


JNIEXPORT jint JNICALL Java_hello_Sumar
  (JNIEnv *env, jobject object, jint operando1, jint operando2){
	return operando1 + operando2;
}


JNIEXPORT jint JNICALL Java_hello_Restar
  (JNIEnv *env, jobject object, jint operando1, jint operando2){
	return operando1 - operando2;
}

JNIEXPORT jint JNICALL Java_hello_Multiplicar
  (JNIEnv *env, jobject object, jint operando1, jint operando2){
	return operando1 * operando2;
}

JNIEXPORT jint JNICALL Java_hello_Dividir
  (JNIEnv *env, jobject object, jint operando1, jint operando2){
	return operando1 / operando2;
}
