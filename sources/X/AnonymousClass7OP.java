package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.7OP  reason: invalid class name */
public final class AnonymousClass7OP implements C1603488c {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass73V A01;
    public final /* synthetic */ C136936ue A02;
    public final /* synthetic */ AnonymousClass70I A03;
    public final /* synthetic */ WeakReference A04;
    public final /* synthetic */ boolean A05;

    public void BpJ(AnonymousClass6U4 r11) {
        Exception exc;
        Integer num;
        AnonymousClass73V r5 = this.A01;
        AnonymousClass1FU A002 = AnonymousClass73V.A00(this.A04);
        if (A002 == null) {
            Log.e("Unable to obtain Activity reference.");
            r5.A03.set(false);
            return;
        }
        AnonymousClass70I r4 = this.A03;
        int i = this.A00;
        r4.A06(AnonymousClass6EA.A00, A00(r11), i);
        r4.A03(i, "editor_callback");
        boolean z = r11 instanceof AnonymousClass6N8;
        if (z) {
            ((AnonymousClass16T) r5.A02.get()).A00 = "com.bloks.www.avatar.editor.cds.launcher.async";
            r5.A04.set(AnonymousClass11P.A01(r5.A00));
            A002.CEx();
            C136936ue r8 = this.A02;
            boolean z2 = this.A05;
            r8.A05((Integer) null, (String) null, 2, z2);
            r8.A04((Integer) null, (String) null, 4, z2);
        } else {
            C136936ue r7 = this.A02;
            boolean z3 = this.A05;
            A002.CEx();
            AnonymousClass73V.A02(A002, r5, r11);
            int i2 = 1;
            if (!r11.equals(AnonymousClass6N7.A00)) {
                if (r11 instanceof AnonymousClass6N5) {
                    exc = ((AnonymousClass6N5) r11).A00.A02;
                } else if (r11.equals(AnonymousClass6N8.A00)) {
                    throw AnonymousClass000.A0n("Success type should not be converted to error type.");
                } else if (r11 instanceof AnonymousClass6N6) {
                    exc = ((AnonymousClass6N6) r11).A00;
                } else {
                    throw AnonymousClass3MW.A14();
                }
                if (exc instanceof IOException) {
                    i2 = 0;
                }
            }
            r7.A05(Integer.valueOf(i2), A00(r11), 3, z3);
        }
        r5.A03.set(false);
        if (z) {
            num = AnonymousClass00R.A00;
        } else {
            num = AnonymousClass00R.A01;
        }
        r4.A02(i, num);
    }

    public AnonymousClass7OP(AnonymousClass73V r1, C136936ue r2, AnonymousClass70I r3, WeakReference weakReference, int i, boolean z) {
        this.A01 = r1;
        this.A04 = weakReference;
        this.A03 = r3;
        this.A00 = i;
        this.A02 = r2;
        this.A05 = z;
    }

    public static final String A00(AnonymousClass6U4 r2) {
        String str;
        if (r2.equals(AnonymousClass6N7.A00)) {
            return "activity_no_longer_active";
        }
        if (r2.equals(AnonymousClass6N8.A00)) {
            return "success";
        }
        if (r2 instanceof AnonymousClass6N5) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("bk_layout_data_error (");
            Exception exc = ((AnonymousClass6N5) r2).A00.A02;
            if (exc == null || (str = exc.getMessage()) == null) {
                str = "no exception attached";
            }
            return C17900vP.A0B(str, A10);
        } else if (r2 instanceof AnonymousClass6N6) {
            return "unknown_error";
        } else {
            throw AnonymousClass3MW.A14();
        }
    }
}
