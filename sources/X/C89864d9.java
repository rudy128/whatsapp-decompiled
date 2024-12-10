package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.4d9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C89864d9 implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Activity A03;
    public final /* synthetic */ AnonymousClass1KB A04;
    public final /* synthetic */ C30191dX A05;
    public final /* synthetic */ C37311pJ A06;
    public final /* synthetic */ C219217x A07;
    public final /* synthetic */ C19830z4 A08;
    public final /* synthetic */ C18030ve A09;
    public final /* synthetic */ C37721q1 A0A;
    public final /* synthetic */ C18090vk A0B;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.1LU, java.lang.Object] */
    public final void onClick(View view) {
        C18030ve r7 = this.A09;
        AnonymousClass1KB r2 = this.A04;
        Activity activity = this.A03;
        C37721q1 r9 = this.A0A;
        int i = this.A01;
        int i2 = this.A02;
        C37311pJ r4 = this.A06;
        C219217x r5 = this.A07;
        C30191dX r3 = this.A05;
        C19830z4 r6 = this.A08;
        int i3 = this.A00;
        C18090vk r0 = this.A0B;
        AnonymousClass4GD.A00(activity, r2, r3, r4, r5, r6, r7, new Object(), r9, i, i2, i3);
        if (r0 != null) {
            r0.invoke();
        }
    }

    public /* synthetic */ C89864d9(Activity activity, AnonymousClass1KB r2, C30191dX r3, C37311pJ r4, C219217x r5, C19830z4 r6, C18030ve r7, C37721q1 r8, C18090vk r9, int i, int i2, int i3) {
        this.A09 = r7;
        this.A04 = r2;
        this.A03 = activity;
        this.A0A = r8;
        this.A01 = i;
        this.A02 = i2;
        this.A06 = r4;
        this.A07 = r5;
        this.A05 = r3;
        this.A08 = r6;
        this.A00 = i3;
        this.A0B = r9;
    }
}
