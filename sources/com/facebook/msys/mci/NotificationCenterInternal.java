package com.facebook.msys.mci;

import X.AnonymousClass2A0;
import X.C61322pU;
import X.C72003Ke;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class NotificationCenterInternal {
    public static final String TAG = "NotificationCenter";
    public final Set mMainConfig;
    public NativeHolder mNativeHolder;
    public final Map mNativeScopeToJavaScope;
    public final Map mObserverConfigs;

    public interface NotificationCallbackInternal {
        void onNewNotification(String str, C72003Ke r2, Map map);
    }

    private boolean scopeExistInAnyConfig(C72003Ke r4) {
        if (r4 != null) {
            for (Map.Entry value : this.mObserverConfigs.entrySet()) {
                if (((C61322pU) value.getValue()).A00.containsKey(r4)) {
                    return true;
                }
            }
        }
        return false;
    }

    public synchronized void addObserver(NotificationCallbackInternal notificationCallbackInternal, String str, int i, C72003Ke r5) {
        NullPointerException nullPointerException;
        if (notificationCallbackInternal == null) {
            nullPointerException = new NullPointerException();
        } else if (str == null) {
            nullPointerException = new NullPointerException();
        } else if (!observerHasConfig(notificationCallbackInternal, str, r5)) {
            if (r5 != null) {
                addScopeToMappingOfNativeToJava(r5);
            }
            addObserverConfig(notificationCallbackInternal, str, r5);
            if (this.mMainConfig.add(str)) {
                addObserverNative(str, i);
            }
        }
        throw nullPointerException;
    }

    public abstract void addObserverNative(String str, int i);

    public void dispatchNotificationToCallbacks(String str, Long l, Object obj) {
        C72003Ke r4;
        String str2;
        int i;
        Set set;
        Object obj2 = obj;
        if (obj == null || (obj instanceof Map)) {
            Map map = (Map) obj2;
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                if (l != null) {
                    r4 = (C72003Ke) this.mNativeScopeToJavaScope.get(l);
                } else {
                    r4 = null;
                }
                Iterator it = this.mObserverConfigs.entrySet().iterator();
                while (true) {
                    str2 = str;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    C61322pU r1 = (C61322pU) entry.getValue();
                    if (r1.A01.contains(str) || ((set = (Set) r1.A00.get(r4)) != null && set.contains(str))) {
                        arrayList.add((NotificationCallbackInternal) entry.getKey());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AnonymousClass2A0 r3 = new AnonymousClass2A0(r4, this, str2, arrayList, map);
                if (str.equals("MCIDatabaseCommitNotificationV2")) {
                    i = Execution.getExecutionContext();
                } else {
                    i = 1;
                }
                Execution.executePossiblySync(r3, i);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Native layer of msys reported a notification whose payload could not be serialized into a Java Map. Instead, it's of type ");
        sb.append(obj.getClass().getName());
        throw new RuntimeException(sb.toString());
    }

    public abstract NativeHolder initNativeHolder();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2.mNativeScopeToJavaScope.isEmpty() == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isThereAnyPendingConfig() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Set r0 = r2.mMainConfig     // Catch:{ all -> 0x001d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001a
            java.util.Map r0 = r2.mObserverConfigs     // Catch:{ all -> 0x001d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001a
            java.util.Map r0 = r2.mNativeScopeToJavaScope     // Catch:{ all -> 0x001d }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x001d }
            r0 = 0
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            monitor-exit(r2)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.NotificationCenterInternal.isThereAnyPendingConfig():boolean");
    }

    public synchronized void postStrictNotification(String str, int i, C72003Ke r4) {
        if (str != null) {
            if (r4 != null) {
                addScopeToMappingOfNativeToJava(r4);
            }
            postStrictNotificationNative(str, i);
        } else {
            throw new NullPointerException();
        }
    }

    public abstract void postStrictNotificationNative(String str, int i);

    public synchronized void removeEveryObserver(NotificationCallbackInternal notificationCallbackInternal) {
        NullPointerException th;
        C61322pU r3;
        if (notificationCallbackInternal != null) {
            C61322pU r6 = (C61322pU) this.mObserverConfigs.get(notificationCallbackInternal);
            if (r6 != null) {
                synchronized (r6) {
                    try {
                        HashSet hashSet = new HashSet(r6.A01);
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : r6.A00.entrySet()) {
                            hashMap.put((C72003Ke) entry.getKey(), new HashSet((Collection) entry.getValue()));
                        }
                        r3 = new C61322pU(hashMap, hashSet);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                for (String removeObserver : r3.A01) {
                    removeObserver(notificationCallbackInternal, removeObserver, (C72003Ke) null);
                }
                for (Map.Entry entry2 : r3.A00.entrySet()) {
                    C72003Ke r2 = (C72003Ke) entry2.getKey();
                    for (String removeObserver2 : (Set) entry2.getValue()) {
                        removeObserver(notificationCallbackInternal, removeObserver2, r2);
                    }
                }
                this.mObserverConfigs.remove(notificationCallbackInternal);
            }
        } else {
            th = new NullPointerException();
            throw th;
        }
    }

    public synchronized void removeObserver(NotificationCallbackInternal notificationCallbackInternal, String str, C72003Ke r4) {
        NullPointerException nullPointerException;
        if (notificationCallbackInternal == null) {
            nullPointerException = new NullPointerException();
        } else if (str == null) {
            nullPointerException = new NullPointerException();
        } else if (observerHasConfig(notificationCallbackInternal, str, r4)) {
            removeObserverConfig(notificationCallbackInternal, str, r4);
            if (r4 != null && !scopeExistInAnyConfig(r4)) {
                removeScopeFromNativeToJavaMappings(r4);
            }
            if (!notificationNameExistsInSomeObserver(str)) {
                this.mMainConfig.remove(str);
                removeObserverNative(str);
            }
        }
        throw nullPointerException;
    }

    public abstract void removeObserverNative(String str);

    private boolean addObserverConfig(NotificationCallbackInternal notificationCallbackInternal, String str, C72003Ke r5) {
        Set set;
        C61322pU r1 = (C61322pU) this.mObserverConfigs.get(notificationCallbackInternal);
        if (r1 == null) {
            r1 = new C61322pU();
            this.mObserverConfigs.put(notificationCallbackInternal, r1);
        }
        if (r5 == null) {
            set = r1.A01;
        } else {
            Map map = r1.A00;
            set = (Set) map.get(r5);
            if (set == null) {
                set = new HashSet();
                map.put(r5, set);
            }
        }
        return set.add(str);
    }

    private void addScopeToMappingOfNativeToJava(C72003Ke r4) {
        this.mNativeScopeToJavaScope.put(Long.valueOf(r4.getNativeReference()), r4);
    }

    private boolean notificationNameExistsInSomeObserver(String str) {
        for (Map.Entry value : this.mObserverConfigs.entrySet()) {
            C61322pU r1 = (C61322pU) value.getValue();
            if (r1.A01.contains(str)) {
                return true;
            }
            Iterator it = r1.A00.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Set) ((Map.Entry) it.next()).getValue()).contains(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean observerHasConfig(NotificationCallbackInternal notificationCallbackInternal, String str, C72003Ke r4) {
        Set set;
        C61322pU r0 = (C61322pU) this.mObserverConfigs.get(notificationCallbackInternal);
        if (r0 == null) {
            return false;
        }
        if (r4 == null) {
            set = r0.A01;
        } else {
            set = (Set) r0.A00.get(r4);
            if (set == null) {
                return false;
            }
        }
        return set.contains(str);
    }

    private boolean removeObserverConfig(NotificationCallbackInternal notificationCallbackInternal, String str, C72003Ke r7) {
        boolean z;
        C61322pU r3 = (C61322pU) this.mObserverConfigs.get(notificationCallbackInternal);
        if (r3 == null) {
            return false;
        }
        if (r7 == null) {
            z = r3.A01.remove(str);
        } else {
            Map map = r3.A00;
            Set set = (Set) map.get(r7);
            if (set != null) {
                z = set.remove(str);
                if (set.isEmpty()) {
                    map.remove(r7);
                }
            } else {
                z = false;
            }
        }
        if (r3.A01.isEmpty() && r3.A00.isEmpty()) {
            this.mObserverConfigs.remove(notificationCallbackInternal);
        }
        return z;
    }

    private void removeScopeFromNativeToJavaMappings(C72003Ke r4) {
        this.mNativeScopeToJavaScope.remove(Long.valueOf(r4.getNativeReference()));
    }

    public NotificationCenterInternal(boolean z) {
        this.mNativeScopeToJavaScope = new HashMap();
        this.mObserverConfigs = new HashMap();
        this.mMainConfig = new HashSet();
        if (!z) {
            this.mNativeHolder = initNativeHolder();
        }
    }

    public void setNativeHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public NotificationCenterInternal() {
        this(false);
    }
}
