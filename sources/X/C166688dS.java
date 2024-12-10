package X;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.8dS  reason: invalid class name and case insensitive filesystem */
public abstract class C166688dS extends C166738dt {
    public AnonymousClass19D A00;
    public boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (android.os.Debug.isDebuggerConnected() != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r1 == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3H() {
        /*
            r4 = this;
            X.19D r2 = r4.A00
            r1 = 7946(0x1f0a, float:1.1135E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0045
            android.content.ContentResolver r3 = r4.getContentResolver()
            java.lang.Boolean r0 = X.C17970vW.A06
            r2 = 0
            if (r0 != 0) goto L_0x0023
            java.lang.Class<X.0vW> r1 = X.C17970vW.class
            monitor-enter(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0020 }
            X.C17970vW.A06 = r0     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            goto L_0x0023
        L_0x0020:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r0
        L_0x0023:
            java.lang.String r0 = "adb_enabled"
            int r1 = android.provider.Settings.Global.getInt(r3, r0, r2)
            r0 = 1
            if (r1 == r0) goto L_0x0039
            boolean r0 = X.C17970vW.A0C()
            if (r0 != 0) goto L_0x0039
            boolean r0 = android.os.Debug.isDebuggerConnected()
            r1 = 0
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            java.lang.Boolean r0 = X.C17970vW.A06
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0045
            r0 = 1
            if (r1 != 0) goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            r4.A01 = r0
            X.1KB r2 = r4.A05
            r1 = 8
            X.3Bu r0 = new X.3Bu
            r0.<init>(r4, r1)
            r2.A0J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166688dS.A3H():void");
    }

    public void A4b() {
        View currentFocus;
        if (this.A01 && (currentFocus = getCurrentFocus()) != null) {
            this.A09.A01(currentFocus);
            currentFocus.clearFocus();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!this.A01 || !C17970vW.A0F(motionEvent)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A01) {
            Boolean bool = C17970vW.A01;
            if (keyEvent.getFlags() == 0) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.A01 || !C17970vW.A0F(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public void onResume() {
        super.onResume();
        A4b();
    }
}
