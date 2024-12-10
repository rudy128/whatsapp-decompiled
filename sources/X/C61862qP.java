package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: X.2qP  reason: invalid class name and case insensitive filesystem */
public class C61862qP {
    public final /* synthetic */ AnonymousClass1K2 A00;

    public C61862qP(AnonymousClass1K2 r1) {
        this.A00 = r1;
    }

    public static C122086Ms A00(Context context, Bitmap bitmap, AnonymousClass1L9 r3, AnonymousClass1KB r4, C18030ve r5, C32011gU r6, C56912iE r7, C63172sd r8, AnonymousClass206 r9, C24149BwF bwF, String str, int i) {
        return new C122086Ms(context, bitmap, r3, r4, r5, r6, r7, r8, r9, bwF, str, i);
    }

    public C122086Ms A01(Bitmap bitmap, AnonymousClass206 r16, C24149BwF bwF, String str, int i) {
        AnonymousClass1K2 r1 = this.A00;
        Activity A002 = r1.A00.AAO;
        AnonymousClass10E A04 = r1.A01;
        return A00(A002, bitmap, (AnonymousClass1L9) A04.A0E.get(), AnonymousClass10E.A13(A04), AnonymousClass10E.A8q(A04), (C32011gU) A04.A5k.get(), (C56912iE) A04.A2z.get(), (C63172sd) A04.A00.A1A.get(), r16, bwF, str, i);
    }
}
