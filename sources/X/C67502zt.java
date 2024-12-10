package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2zt  reason: invalid class name and case insensitive filesystem */
public final class C67502zt implements AnonymousClass1L0, AnonymousClass1WS {
    public Handler A00 = new AnonymousClass3NU(Looper.getMainLooper(), this, 2);
    public final AnonymousClass1KB A01;
    public final C32541hM A02;
    public final AnonymousClass11P A03;
    public final C24681Lg A04;
    public final C18030ve A05;
    public final Map A06 = new ConcurrentHashMap();
    public final AnonymousClass1PW A07;
    public final AnonymousClass00H A08;

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqh() {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public void ByH(AnonymousClass206 r2, int i) {
        C18070vi.A0d(r2, 0);
        A00(this, r2);
    }

    public /* synthetic */ void ByK(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public void ByQ(AnonymousClass206 r2, AnonymousClass206 r3) {
        C18070vi.A0d(r3, 1);
        A00(this, r3);
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Bya(Collection collection, Map map) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.4rF] */
    public static final void A00(C67502zt r11, AnonymousClass206 r12) {
        if (!r12.A0v.A02 && C87494Vu.A00(r12)) {
            C692036h A002 = AnonymousClass2UW.A00(r12);
            if (A002 != null) {
                C49452Qn r6 = C49452Qn.TIMED_OUT;
                if (!C200410p.A0S(new C49452Qn[]{C49452Qn.LAST, C49452Qn.FULL, r6}).contains(A002.A01)) {
                    long j = r12.A0I;
                    C691536c A003 = C60492o7.A00(r12);
                    if (A003 != null) {
                        j = A003.A00;
                    }
                    long A004 = ((long) C18020vd.A00(C18040vf.A02, r11.A05, 4736)) - (AnonymousClass11P.A01(r11.A03) - j);
                    if (A004 > 0) {
                        Map map = r11.A06;
                        AnonymousClass205 A0A = AnonymousClass25A.A0A(r12);
                        C18070vi.A0X(A0A);
                        map.put(A0A, r12);
                        Handler handler = r11.A00;
                        handler.sendMessageDelayed(Message.obtain(handler, 0, r12), A004);
                        return;
                    }
                    ? obj = new Object();
                    Map map2 = r11.A06;
                    AnonymousClass205 A0A2 = AnonymousClass25A.A0A(r12);
                    C18070vi.A0X(A0A2);
                    Object remove = map2.remove(A0A2);
                    obj.element = remove;
                    if (remove == null) {
                        obj.element = r12;
                    }
                    C692036h A005 = AnonymousClass2UW.A00(r12);
                    if (A005 != null) {
                        A005.A01 = r6;
                        C32541hM r4 = r11.A02;
                        long j2 = r12.A0x;
                        r4.A02((C691736e) AnonymousClass206.A01(r12, C691736e.class), (C691836f) AnonymousClass206.A01(r12, C691836f.class), (C20944Aby) AnonymousClass206.A01(r12, C20944Aby.class), A005, j2);
                        r11.A01.A0J(new C21434Ak1(r11, obj, r12, 3));
                        return;
                    }
                    return;
                }
            }
            Map map3 = r11.A06;
            AnonymousClass205 A0A3 = AnonymousClass25A.A0A(r12);
            C18070vi.A0X(A0A3);
            map3.remove(A0A3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqi() {
        /*
            r6 = this;
            X.1hM r4 = r6.A02
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.1Cd r0 = r4.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0055 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "SELECT message_row_id FROM bot_message_info"
            java.lang.String r0 = "SQL_GET_ALL_ROW_IDS"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x0055 }
        L_0x0019:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0029
            r0 = 0
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x004e }
            long r0 = (long) r0     // Catch:{ all -> 0x004e }
            X.C17880vN.A1R(r5, r0)     // Catch:{ all -> 0x004e }
            goto L_0x0019
        L_0x0029:
            r2.close()     // Catch:{ all -> 0x0055 }
            r3.close()
            java.util.Iterator r3 = r5.iterator()
        L_0x0033:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004d
            long r1 = X.C17890vO.A07(r3)
            X.00H r0 = r6.A08
            X.206 r0 = X.AnonymousClass1W2.A02(r0, r1)
            if (r0 == 0) goto L_0x0049
            A00(r6, r0)
            goto L_0x0033
        L_0x0049:
            r4.A01(r1)
            goto L_0x0033
        L_0x004d:
            return
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0055 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67502zt.Bqi():void");
    }

    public C67502zt(AnonymousClass1KB r4, AnonymousClass1PW r5, C32541hM r6, AnonymousClass11P r7, C24681Lg r8, C18030ve r9, AnonymousClass00H r10) {
        C18070vi.A0w(r7, r9, r4, r5, r8);
        C18070vi.A0l(r10, r6);
        this.A03 = r7;
        this.A05 = r9;
        this.A01 = r4;
        this.A07 = r5;
        this.A04 = r8;
        this.A08 = r10;
        this.A02 = r6;
    }
}
