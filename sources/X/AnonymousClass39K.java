package X;

import com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.39K  reason: invalid class name */
public final class AnonymousClass39K implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;
    public final AnonymousClass190 A01;
    public final C25001Mm A02;

    public static void A00(AnonymousClass39K r6, AnonymousClass206 r7) {
        C41851xA BD0;
        C18070vi.A0d(r7, 0);
        if (r7 instanceof C442222p) {
            AnonymousClass1QY r3 = (AnonymousClass1QY) r6.A00.get();
            if (r7.A0P() != null) {
                AnonymousClass1QY.A02(r3, r7.A0P(), r7.A0x);
                return;
            }
            return;
        } else if (r7 instanceof C442022n) {
            AnonymousClass1QY r62 = (AnonymousClass1QY) r6.A00.get();
            C442022n r72 = (C442022n) r7;
            if (!r72.A17().isEmpty()) {
                List<String> A17 = r72.A17();
                C28791au A05 = r62.A06.A05();
                try {
                    BD0 = A05.BD0();
                    for (String A022 : A17) {
                        AnonymousClass1QY.A02(r62, A022, r72.A0x);
                    }
                    BD0.A00();
                    BD0.close();
                    A05.close();
                    return;
                } catch (Throwable th) {
                    try {
                        A05.close();
                        throw th;
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                        throw th;
                    }
                }
            } else {
                return;
            }
        } else {
            r6.A01(r7);
            return;
        }
        throw th;
    }

    public void BL9(AnonymousClass206 r5) {
        C18070vi.A0d(r5, 0);
        if (r5 instanceof C442222p) {
            C442222p r52 = (C442222p) r5;
            ArrayList A002 = AnonymousClass1QY.A00((AnonymousClass1QY) this.A00.get(), r52.A0x, false);
            if (!A002.isEmpty()) {
                r52.A18((String) A002.get(0));
            }
        } else if (r5 instanceof C442022n) {
            C442022n r53 = (C442022n) r5;
            ArrayList A003 = AnonymousClass1QY.A00((AnonymousClass1QY) this.A00.get(), r53.A0x, false);
            if (!A003.isEmpty()) {
                r53.A18(A003);
            }
        } else {
            A01(r5);
        }
    }

    public AnonymousClass39K(AnonymousClass190 r1, C25001Mm r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A01 = r1;
        this.A00 = r3;
        this.A02 = r2;
    }

    private final void A01(AnonymousClass206 r5) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Incorrect message type associated with FMessageContactDatabase, key=");
        A10.append(r5.A0v);
        AnonymousClass206.A07(r5, ", message_type=", A10);
        String obj = A10.toString();
        C17960vV.A0F(false, obj);
        C17900vP.A0g("FMessageContactDatabase/fill; ", obj, AnonymousClass000.A10());
        this.A01.A0G("fmessage-database-mismatch", obj, false);
    }

    public void BdY(AnonymousClass206 r7) {
        A00(this, r7);
        this.A02.A01(new AsyncMessageJob(r7.A0x, r7.A0y));
    }

    public void CQL(AnonymousClass206 r1) {
        A00(this, r1);
    }
}
