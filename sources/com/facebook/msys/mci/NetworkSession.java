package com.facebook.msys.mci;

import X.AnonymousClass1CH;
import X.AnonymousClass3KG;
import X.C23071Ek;
import X.C23081El;
import X.C23101Eo;
import X.C23111Ep;
import X.C70553Bn;
import android.os.Trace;
import android.util.Log;
import com.facebook.simplejni.NativeHolder;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class NetworkSession {
    public static final String TAG = "NetworkSession";
    public final HashMap mCallbackMap = new HashMap();
    public final DataTaskListener mDataTaskListener;
    public boolean mDisposed;
    public final C23101Eo mDisposer;
    public final NativeHolder mNativeHolder;
    public final NotificationCenter mNotificationCenter;

    private native NativeHolder initNativeHolder(String str, NotificationCenter notificationCenter);

    private native void markDataTaskAsCompleted(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, Throwable th);

    private native void markDataTaskStreamingCompleted(String str, String str2, UrlResponse urlResponse, Throwable th);

    private native void nativeDispose();

    private native void onDataTaskNewStreamingData(String str, String str2, UrlResponse urlResponse, byte[] bArr);

    private native void registerDownloadTaskProgressObserver(String str);

    private native void registerUploadTaskProgressObserver(String str);

    private native void setNetworkStateConnectedNative(NotificationCenter notificationCenter);

    private native void setNetworkStateDisconnectedNative(NotificationCenter notificationCenter);

    public native synchronized void canHandleStreamingUploadUpdate(String str);

    public synchronized void dispose() {
        if (!this.mDisposed) {
            nativeDispose();
            this.mDisposed = true;
        }
    }

    public void executeInNetworkContext(C70553Bn r3) {
        Execution.executeAsyncWithPriority(r3, 3, 0);
    }

    public native int getNetworkSessionTimeoutIntervalMs();

    public native DataTask[] getPendingDataTasks();

    public synchronized void markDataTaskAsCompletedCallback(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, IOException iOException) {
        markDataTaskAsCompleted(str, str2, i, urlResponse, bArr, str3, iOException);
        if (this.mCallbackMap.containsKey(str2)) {
            this.mCallbackMap.remove(str2);
        }
    }

    public synchronized void registerDownloadTaskProgressObserverCallback(String str, AnonymousClass3KG r3) {
        this.mCallbackMap.put(str, r3);
        registerDownloadTaskProgressObserver(str);
    }

    public synchronized void registerUploadTaskProgressObserverCallback(String str, AnonymousClass3KG r3) {
        this.mCallbackMap.put(str, r3);
        registerUploadTaskProgressObserver(str);
    }

    public native void updateDataTaskDownloadProgress(String str, long j, long j2, long j3);

    public native void updateDataTaskUploadProgress(String str, long j, long j2, long j3);

    private void dispatchProgressUpdateToObserver(String str, long j, long j2, long j3) {
        if (this.mCallbackMap.containsKey(str)) {
            this.mCallbackMap.get(str);
        }
    }

    private void onCancelDataTask(String str) {
        Log.d(TAG, "DataTask with taskIdentifier %s cancelled by Msys");
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onCancelDataTask(str, this);
        }
    }

    private void onNewDataTask(DataTask dataTask) {
        Log.d(TAG, "New data task received from Msys");
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onNewTask(dataTask, this);
        }
    }

    private void onUpdateStreamingDataTask(byte[] bArr, String str) {
        Log.d(TAG, "Msys just sent us a streaming DataTask update!");
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onUpdateStreamingDataTask(bArr, str, this);
        }
    }

    public void setNetworkStateConnected() {
        setNetworkStateConnectedNative(this.mNotificationCenter);
    }

    public void setNetworkStateDisconnected() {
        setNetworkStateDisconnectedNative(this.mNotificationCenter);
    }

    public NetworkSession(String str, NotificationCenter notificationCenter, C23071Ek r5) {
        Method method = AnonymousClass1CH.A03;
        Trace.beginSection("NetworkSession.new");
        try {
            this.mNotificationCenter = notificationCenter;
            C23081El r1 = (C23081El) r5;
            this.mDataTaskListener = r1.A01;
            this.mDisposer = new C23111Ep(this, r5);
            this.mNativeHolder = initNativeHolder(str, notificationCenter);
            int networkSessionTimeoutIntervalMs = getNetworkSessionTimeoutIntervalMs();
            if (networkSessionTimeoutIntervalMs > 0) {
                r1.A00 = networkSessionTimeoutIntervalMs;
            }
        } finally {
            Trace.endSection();
        }
    }

    public void markDataTaskStreamingCompletedCallback(String str, String str2, UrlResponse urlResponse, Throwable th) {
        markDataTaskStreamingCompleted(str, str2, urlResponse, th);
    }

    public void onDataTaskNewStreamingDataCallback(String str, String str2, UrlResponse urlResponse, byte[] bArr) {
        onDataTaskNewStreamingData(str, str2, urlResponse, bArr);
    }
}
