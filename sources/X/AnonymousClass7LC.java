package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.7LC  reason: invalid class name */
public final class AnonymousClass7LC implements AnonymousClass89J {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass73V A01;
    public final /* synthetic */ C136936ue A02;
    public final /* synthetic */ AnonymousClass70I A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ WeakReference A05;
    public final /* synthetic */ boolean A06;

    public void onFailure(Exception exc) {
        C18070vi.A0d(exc, 0);
        Log.e("Failed to create an avatar user:", exc);
        AnonymousClass70I r2 = this.A03;
        int i = this.A00;
        r2.A03(i, "user_creation_failed");
        r2.A02(i, AnonymousClass00R.A01);
        AnonymousClass73V r5 = this.A01;
        r5.A03.set(false);
        C136936ue r4 = this.A02;
        C18070vi.A0b(r4);
        r4.A04(C17880vN.A0h(), exc.getMessage(), 7, this.A06);
        AnonymousClass1FU A002 = AnonymousClass73V.A00(this.A05);
        if (A002 == null) {
            Log.e("Unable to obtain Activity reference.");
            return;
        }
        A002.CEx();
        AnonymousClass73V.A02(A002, r5, new AnonymousClass6N6(exc));
    }

    public AnonymousClass7LC(AnonymousClass73V r1, C136936ue r2, AnonymousClass70I r3, String str, WeakReference weakReference, int i, boolean z) {
        this.A03 = r3;
        this.A00 = i;
        this.A01 = r1;
        this.A05 = weakReference;
        this.A02 = r2;
        this.A04 = str;
        this.A06 = z;
    }

    public void onSuccess() {
        AnonymousClass70I r2 = this.A03;
        int i = this.A00;
        r2.A03(i, "user_created");
        AnonymousClass73V r0 = this.A01;
        WeakReference weakReference = this.A05;
        C136936ue r1 = this.A02;
        C18070vi.A0b(r1);
        AnonymousClass73V.A03(r0, r1, r2, this.A04, weakReference, i, this.A06);
    }
}
