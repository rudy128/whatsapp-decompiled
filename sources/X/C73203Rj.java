package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertDialog$Builder;

@Deprecated
/* renamed from: X.3Rj  reason: invalid class name and case insensitive filesystem */
public class C73203Rj extends AlertDialog$Builder {
    public final AlertDialog$Builder A00;
    public final C88844av A01 = new C88844av();
    public final C88804ao A02 = new C88804ao();

    public static void A05(AnonymousClass1F9 r1, C73203Rj r2, int i, int i2) {
        r2.A0e(r1, new C91474fk(i), i2);
    }

    public static void A07(C73203Rj r1, int i, int i2) {
        r1.A0X(new C1411874q(i), i2);
    }

    public static void A08(C73203Rj r1, Object obj, int i, int i2) {
        r1.A0Z(new AnonymousClass4bA(obj, i), i2);
    }

    public static void A09(C73203Rj r1, Object obj, int i, int i2) {
        r1.A0Z(new AnonymousClass4aq(obj, i), i2);
    }

    public static void A0A(C73203Rj r1, Object obj, int i, int i2) {
        r1.A0Z(new AnonymousClass4bB(obj, i), i2);
    }

    public static void A0B(C73203Rj r1, Object obj, int i, int i2) {
        r1.A0Z(new C88814ar(obj, i), i2);
    }

    public C010105w A0C() {
        return this.A00.A0C();
    }

    public /* bridge */ /* synthetic */ void A0F(int i) {
        this.A00.A0F(i);
    }

    public /* bridge */ /* synthetic */ void A0H(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter) {
        this.A00.A0H(onClickListener, listAdapter);
    }

    public /* bridge */ /* synthetic */ void A0I(DialogInterface.OnClickListener onClickListener, ListAdapter listAdapter, int i) {
        this.A00.A0I(onClickListener, listAdapter, i);
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void A0J(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.A0J(onClickListener, charSequence);
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void A0K(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.A0K(onClickListener, charSequence);
    }

    public /* bridge */ /* synthetic */ void A0M(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr) {
        this.A00.A0M(onClickListener, charSequenceArr);
    }

    public /* bridge */ /* synthetic */ void A0N(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr, int i) {
        this.A00.A0N(onClickListener, charSequenceArr, i);
    }

    public /* bridge */ /* synthetic */ void A0O(DialogInterface.OnDismissListener onDismissListener) {
        this.A00.A0O(onDismissListener);
    }

    public /* bridge */ /* synthetic */ void A0P(DialogInterface.OnKeyListener onKeyListener) {
        this.A00.A0P(onKeyListener);
    }

    public /* bridge */ /* synthetic */ void A0Q(DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener, CharSequence[] charSequenceArr, boolean[] zArr) {
        this.A00.A0Q(onMultiChoiceClickListener, charSequenceArr, zArr);
    }

    /* renamed from: A0U */
    public void A0D(int i) {
        this.A00.A0D(i);
    }

    /* renamed from: A0V */
    public void A0E(int i) {
        this.A00.A0E(i);
    }

    /* renamed from: A0W */
    public void A0G(DialogInterface.OnCancelListener onCancelListener) {
        this.A00.A0G(onCancelListener);
    }

    @Deprecated
    public void A0X(DialogInterface.OnClickListener onClickListener, int i) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        alertDialog$Builder.A0J(onClickListener, alertDialog$Builder.getContext().getString(i));
    }

    @Deprecated
    public void A0Y(DialogInterface.OnClickListener onClickListener, int i) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        alertDialog$Builder.A0K(onClickListener, alertDialog$Builder.getContext().getString(i));
    }

    @Deprecated
    public void A0Z(DialogInterface.OnClickListener onClickListener, int i) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        alertDialog$Builder.A0L(onClickListener, alertDialog$Builder.getContext().getString(i));
    }

    @Deprecated
    /* renamed from: A0a */
    public void A0L(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        this.A00.A0L(onClickListener, charSequence);
    }

    /* renamed from: A0b */
    public void A0R(View view) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        alertDialog$Builder.A0R(view);
        alertDialog$Builder.A0R(view);
    }

    public void A0c(View view) {
        this.A00.setView(view);
    }

    public void A0d(AnonymousClass1F9 r3, C22851Dl r4) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        C88804ao r0 = this.A02;
        alertDialog$Builder.A0O(r0);
        r0.A01.A0A(r3, r4);
    }

    public void A0e(AnonymousClass1F9 r4, C22851Dl r5, int i) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        String string = alertDialog$Builder.getContext().getString(i);
        C88844av r0 = this.A01;
        alertDialog$Builder.A0J(r0, string);
        if (r5 != null) {
            r0.A00.A0A(r4, r5);
        }
    }

    public void A0f(AnonymousClass1F9 r4, C22851Dl r5, int i) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        String string = alertDialog$Builder.getContext().getString(i);
        C88844av r0 = this.A01;
        alertDialog$Builder.A0K(r0, string);
        r0.A01.A0A(r4, r5);
    }

    public void A0g(AnonymousClass1F9 r4, C22851Dl r5, int i) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        String string = alertDialog$Builder.getContext().getString(i);
        C88844av r0 = this.A01;
        alertDialog$Builder.A0L(r0, string);
        if (r5 != null) {
            r0.A02.A0A(r4, r5);
        }
    }

    public void A0h(AnonymousClass1F9 r3, C22851Dl r4, CharSequence charSequence) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        C88844av r0 = this.A01;
        alertDialog$Builder.A0J(r0, charSequence);
        if (r4 != null) {
            r0.A00.A0A(r3, r4);
        }
    }

    public void A0i(AnonymousClass1F9 r3, C22851Dl r4, CharSequence charSequence) {
        AlertDialog$Builder alertDialog$Builder = this.A00;
        C88844av r0 = this.A01;
        alertDialog$Builder.A0L(r0, charSequence);
        r0.A02.A0A(r3, r4);
    }

    /* renamed from: A0j */
    public void A0S(CharSequence charSequence) {
        this.A00.A0S(charSequence);
    }

    public void A0k(CharSequence charSequence) {
        this.A00.setTitle(charSequence);
    }

    /* renamed from: A0l */
    public void A0T(boolean z) {
        this.A00.A0T(z);
    }

    public C010105w create() {
        if (this.A02.A01.A02.A00 <= 0) {
            this.A00.A0O((DialogInterface.OnDismissListener) null);
        }
        return this.A00.create();
    }

    public Context getContext() {
        return this.A00.getContext();
    }

    public C73203Rj(AlertDialog$Builder alertDialog$Builder) {
        super(alertDialog$Builder.getContext());
        this.A00 = alertDialog$Builder;
    }

    public static C010105w A00(DialogInterface.OnClickListener onClickListener, C73203Rj r2, int i) {
        r2.A0Z(onClickListener, i);
        r2.A0X((DialogInterface.OnClickListener) null, 2131898766);
        return r2.create();
    }

    public static C73203Rj A01(Context context) {
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0E(2131889686);
        A002.A0D(2131889685);
        return A002;
    }

    public static C73203Rj A02(Context context) {
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0D(2131889683);
        return A002;
    }

    public static void A03(AnonymousClass1F9 r2, C73203Rj r3) {
        r3.A0g(r2, (C22851Dl) null, 2131899286);
    }

    public static void A04(AnonymousClass1F9 r2, C73203Rj r3) {
        r3.A0g(r2, (C22851Dl) null, 2131899286);
        r3.A0C();
    }

    public static void A06(C73203Rj r2) {
        r2.A0Z((DialogInterface.OnClickListener) null, 2131899286);
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder setTitle(CharSequence charSequence) {
        A0k(charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ AlertDialog$Builder setView(View view) {
        A0c(view);
        return this;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ AlertDialog$Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        A0X(onClickListener, i);
        return this;
    }

    @Deprecated
    public /* bridge */ /* synthetic */ AlertDialog$Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        A0Z(onClickListener, i);
        return this;
    }
}
