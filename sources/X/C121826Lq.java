package X;

import com.whatsapp.status.playback.MessageReplyActivity;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.6Lq  reason: invalid class name and case insensitive filesystem */
public class C121826Lq extends A34 {
    public final AnonymousClass1BI A00;
    public final AnonymousClass1W6 A01;
    public final AnonymousClass73X A02;
    public final AnonymousClass6UE A03;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.6UL] */
    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass206 r1;
        C128816gj A05 = this.A02.A05(this.A00);
        if (A05 != null) {
            AnonymousClass1W6 r0 = this.A01;
            r1 = r0.A01.A05(A05.A01);
        } else {
            r1 = null;
        }
        ? obj = new Object();
        obj.A01 = A05;
        obj.A00 = r1;
        return obj;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass205 r1;
        AnonymousClass74M r4;
        AnonymousClass205 r12;
        AnonymousClass6UL r10 = (AnonymousClass6UL) obj;
        WeakReference weakReference = this.A03.A00;
        C17960vV.A07(weakReference);
        AnonymousClass866 r13 = (AnonymousClass866) weakReference.get();
        if (r13 != null) {
            AnonymousClass7O7 r14 = (AnonymousClass7O7) r13;
            switch (r14.A00) {
                case 0:
                    AnonymousClass4aY r7 = (AnonymousClass4aY) r14.A01;
                    C128816gj r3 = r10.A01;
                    if (r3 != null) {
                        AnonymousClass4aY.A0g(r7);
                        AnonymousClass206 r15 = r10.A00;
                        if (r15 != null) {
                            if (!C22971Dz.A0a(r15.A0v.A00)) {
                                r7.A2b.A0b(r15);
                            } else {
                                return;
                            }
                        }
                        if (r7.A4h != null) {
                            r7.A39(r15, false);
                            AnonymousClass74M r16 = r7.A4h;
                            File file = r3.A02;
                            File file2 = r3.A00;
                            r16.A0W(file, file2, true, false);
                            AnonymousClass74M r5 = r7.A4h;
                            C130236j6 r42 = r5.A16;
                            if (C18020vd.A05(C18040vf.A02, r42.A02, 8630) && r42.A01 == null) {
                                r42.A01 = C17890vO.A0Q();
                            }
                            r42.A00 = 2;
                            AnonymousClass7OH r43 = r5.A15;
                            r43.A0B.setOnClickListener(new AnonymousClass78L(r5.A1D, 35));
                            r43.A02();
                            r43.A03(2131232100);
                            AnonymousClass74M.A02((AnonymousClass88W) null, r5, file, file2);
                            if (r7.A26.A00 == null) {
                                C18070vi.A11("listener");
                                throw null;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 1:
                    MessageReplyActivity messageReplyActivity = (MessageReplyActivity) r14.A01;
                    C128816gj r2 = r10.A01;
                    if (r2 != null && (r1 = r2.A01) != null && r1.equals(messageReplyActivity.A0p.A0v) && (r4 = messageReplyActivity.A14) != null) {
                        File file3 = r2.A02;
                        File file4 = r2.A00;
                        r4.A0Y(false, true);
                        r4.A0U(file3, file4);
                        AnonymousClass3MX.A1H(messageReplyActivity, 2131436064, 8);
                        AnonymousClass3MX.A1H(messageReplyActivity, 2131431647, 8);
                        MessageReplyActivity.A0u(AnonymousClass3MX.A0F(messageReplyActivity, 2131434298), messageReplyActivity);
                        return;
                    }
                    return;
                default:
                    C120896Gl r32 = (C120896Gl) r14.A01;
                    C18070vi.A0d(r10, 1);
                    C128816gj r0 = r10.A01;
                    if (r0 != null && (r12 = r0.A01) != null && r12.equals(r32.A07.A0v)) {
                        r32.A08.A08().A02().callOnClick();
                        return;
                    }
                    return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.6UE] */
    public C121826Lq(AnonymousClass1BI r3, AnonymousClass1W6 r4, AnonymousClass866 r5, AnonymousClass73X r6) {
        this.A01 = r4;
        this.A02 = r6;
        C17960vV.A07(r5);
        ? obj = new Object();
        obj.A00 = AnonymousClass3MW.A0z(r5);
        this.A03 = obj;
        this.A00 = r3;
    }
}
