package X;

import com.whatsapp.areffects.viewmodel.session.ArEffectSession;

/* renamed from: X.4hE  reason: invalid class name and case insensitive filesystem */
public final class C92394hE implements BCO {
    public final /* synthetic */ ArEffectSession A00;
    public final /* synthetic */ C31761g5 A01;

    public C92394hE(ArEffectSession arEffectSession, C31761g5 r2) {
        this.A01 = r2;
        this.A00 = arEffectSession;
    }

    public void Btl(C99704tK r3) {
        this.A01.resumeWith(C30691eM.A00(r3));
    }

    public void Bx4(String str, String str2) {
        IllegalStateException illegalStateException;
        C106575Wj A012 = ArEffectSession.A01(this.A00);
        if (A012 instanceof C92594ha) {
            C88544a4 r4 = ((C92594ha) A012).A00;
            synchronized (r4) {
                if (!C72453Mb.A1a(r4.A07) && r4.A0i(AnonymousClass00R.A00)) {
                    long A013 = AnonymousClass11P.A01(r4.A05);
                    Long A09 = r4.A09();
                    if (A09 != null) {
                        long longValue = A013 - A09.longValue();
                        Long A0A = r4.A0A();
                        if (A0A != null) {
                            r4.A0V(longValue - A0A.longValue());
                            r4.A0e(str);
                            r4.A0c(str2);
                        } else {
                            illegalStateException = C17880vN.A0g();
                        }
                    } else {
                        illegalStateException = C17880vN.A0g();
                    }
                    throw illegalStateException;
                }
            }
        }
    }

    public void C38() {
        this.A01.resumeWith(C27621Wu.A00);
    }

    public void C5J() {
        IllegalStateException illegalStateException;
        C106575Wj A012 = ArEffectSession.A01(this.A00);
        if (A012 instanceof C92594ha) {
            C88544a4 r4 = ((C92594ha) A012).A00;
            synchronized (r4) {
                if (!C72453Mb.A1a(r4.A07) && r4.A0i(AnonymousClass00R.A01)) {
                    long A013 = AnonymousClass11P.A01(r4.A05);
                    Long A0A = r4.A0A();
                    if (A0A != null) {
                        r4.A0Y(A013 - A0A.longValue());
                        Long A0B = r4.A0B();
                        if (A0B != null) {
                            long longValue = A0B.longValue();
                            Long A08 = r4.A08();
                            if (A08 != null) {
                                long longValue2 = longValue - A08.longValue();
                                Long A09 = r4.A09();
                                if (A09 != null) {
                                    r4.A0W(longValue2 - A09.longValue());
                                } else {
                                    illegalStateException = C17880vN.A0g();
                                }
                            } else {
                                illegalStateException = C17880vN.A0g();
                            }
                        } else {
                            illegalStateException = C17880vN.A0g();
                        }
                    } else {
                        illegalStateException = C17880vN.A0g();
                    }
                    throw illegalStateException;
                }
            }
        }
    }
}
