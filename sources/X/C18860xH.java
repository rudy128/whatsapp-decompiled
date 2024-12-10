package X;

import android.content.Context;

/* renamed from: X.0xH  reason: invalid class name and case insensitive filesystem */
public class C18860xH implements C18850xG {
    public static volatile C18870xI A04;
    public final C19380y7 A00;
    public final C19400y9 A01;
    public final C19130xi A02;
    public final C19130xi A03;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.0xI, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.0xL, X.0vp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.0xL, X.0vp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.0xL, X.0vp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v0, types: [X.0xL, X.0vp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.0xL, X.0vp, java.lang.Object] */
    public static void A00(Context context) {
        if (A04 == null) {
            synchronized (C18860xH.class) {
                if (A04 == null) {
                    Context context2 = context;
                    if (context != null) {
                        ? obj = new Object();
                        C18890xK r1 = C18880xJ.A00;
                        ? obj2 = new Object();
                        Object obj3 = C18900xL.A02;
                        obj2.A00 = obj3;
                        obj2.A01 = r1;
                        obj.A03 = obj2;
                        C18910xM r2 = new C18910xM(context2);
                        obj.A08 = r2;
                        C18930xO r14 = C18920xN.A00;
                        C18950xQ r15 = C18940xP.A00;
                        C18960xR r0 = new C18960xR(r2, r14, r15);
                        obj.A01 = r0;
                        C18970xS r12 = new C18970xS(r2, r0);
                        ? obj4 = new Object();
                        obj4.A00 = obj3;
                        obj4.A01 = r12;
                        obj.A04 = obj4;
                        C18140vp r5 = obj.A08;
                        obj.A07 = new C19020xX(r5, C18980xT.A00, C19000xV.A00);
                        C19030xY r02 = new C19030xY(r5);
                        ? obj5 = new Object();
                        obj5.A00 = obj3;
                        obj5.A01 = r02;
                        obj.A05 = obj5;
                        C19060xb r13 = new C19060xb(r14, r15, C19040xZ.A00, obj.A07, obj5);
                        ? obj6 = new Object();
                        obj6.A00 = obj3;
                        obj6.A01 = r13;
                        obj.A06 = obj6;
                        C19070xc r03 = new C19070xc(r14);
                        obj.A00 = r03;
                        C18140vp r8 = obj.A08;
                        C19080xd r11 = new C19080xd(r8, obj6, r03, r15);
                        obj.A0C = r11;
                        C18140vp r122 = obj.A03;
                        C18140vp r9 = obj.A04;
                        C19090xe r16 = new C19090xe(r122, r9, r11, obj6, obj6);
                        obj.A02 = r16;
                        C19100xf r7 = new C19100xf(r8, r9, obj6, r11, r122, obj6, r14, r15, obj6);
                        obj.A0A = r7;
                        C19110xg r17 = new C19110xg(r122, obj6, r11, obj6);
                        obj.A0B = r17;
                        C19120xh r82 = new C19120xh(r14, r15, r16, r7, r17);
                        ? obj7 = new Object();
                        obj7.A00 = obj3;
                        obj7.A01 = r82;
                        obj.A09 = obj7;
                        A04 = obj;
                    } else {
                        throw new NullPointerException();
                    }
                }
            }
        }
    }

    public C18860xH(C19380y7 r4, C19400y9 r5, C19410yA r6, C19130xi r7, C19130xi r8) {
        this.A02 = r7;
        this.A03 = r8;
        this.A00 = r4;
        this.A01 = r5;
        r6.A03.execute(new C449025f((Object) r6, 11));
    }
}
