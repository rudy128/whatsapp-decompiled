package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7Kf  reason: invalid class name and case insensitive filesystem */
public class C145167Kf implements AnonymousClass8AD {
    public final AnonymousClass118 A00;
    public final C25671Pd A01;
    public final AnonymousClass1LU A02;
    public final AnonymousClass00H A03;
    public final AtomicBoolean A04 = C108965cb.A0w();
    public final C18100vl A05 = AnonymousClass1DF.A01(new C152737oO(this));
    public final C18100vl A06 = AnonymousClass1DF.A01(new C152747oP(this));
    public final C18600wl A07;
    public final AnonymousClass1OD A08 = new AnonymousClass1OD((AnonymousClass1OB) null);

    public void BG1() {
        try {
            ((ClipboardManager) this.A03.get()).setPrimaryClip(ClipData.newPlainText(C18070vi.A0F(this.A00.A00, 2131899321), (CharSequence) BWJ().getValue()));
        } catch (Throwable th) {
            C30691eM.A00(th);
        }
    }

    public AnonymousClass1G1 BWJ() {
        return (AnonymousClass1G1) this.A06.getValue();
    }

    public void Bwb() {
        Context context = this.A00.A00;
        Intent addFlags = AnonymousClass1LU.A1K(context, "help-pomegranate-pancake").addFlags(268435456);
        C18070vi.A0X(addFlags);
        context.startActivity(addFlags);
    }

    public void C5R() {
        Context context = this.A00.A00;
        String A10 = AnonymousClass3Ma.A10(context, BWJ().getValue(), AnonymousClass3MW.A1a(), 0, 2131899322);
        Intent A0A = C17880vN.A0A();
        A0A.setAction("android.intent.action.SEND");
        A0A.setType("text/plain");
        A0A.putExtra("android.intent.extra.TEXT", A10);
        Intent addFlags = AnonymousClass4aU.A01((IntentSender) null, (CharSequence) null, C18070vi.A0M(A0A)).addFlags(268435456);
        C18070vi.A0X(addFlags);
        context.startActivity(addFlags);
    }

    public C145167Kf(AnonymousClass11C r4, AnonymousClass118 r5, C25671Pd r6, AnonymousClass1LU r7, C18600wl r8) {
        C18070vi.A0p(r4, r5, r7);
        C18070vi.A0d(r8, 5);
        C18150vq r0 = new C18150vq((Object) null, new C147087Rt(r4, 9));
        C18070vi.A0b(r0);
        this.A03 = r0;
        this.A01 = r6;
        this.A00 = r5;
        this.A02 = r7;
        this.A07 = r8;
    }
}
