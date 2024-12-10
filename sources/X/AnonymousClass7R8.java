package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: X.7R8  reason: invalid class name */
public class AnonymousClass7R8 implements Runnable {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final String A0A;
    public final boolean A0B;

    public AnonymousClass7R8(Context context, Uri uri, AnonymousClass1FR r4, C72433Ly r5, C34531kd r6, C692236j r7, File file, String str, List list, int i, boolean z) {
        this.A02 = r6;
        this.A01 = i;
        this.A04 = uri;
        this.A0B = z;
        this.A05 = context;
        this.A0A = str;
        this.A06 = file;
        this.A07 = list;
        this.A08 = r5;
        this.A09 = r4;
        this.A03 = r7;
    }

    public final void run() {
        int i;
        AnonymousClass1KB r2;
        Object obj;
        Object obj2;
        int i2 = this.A00;
        C34531kd r7 = (C34531kd) this.A02;
        int i3 = this.A01;
        if (i2 != 0) {
            Object obj3 = this.A04;
            boolean z = this.A0B;
            File file = (File) this.A05;
            obj = this.A06;
            String str = this.A0A;
            List list = (List) this.A07;
            Object obj4 = this.A08;
            obj2 = this.A09;
            try {
                if (!r7.A0B((AnonymousClass206) null, C26551So.A05, (C692236j) this.A03, file, str, list, i3, z, true, false)) {
                    AnonymousClass1KB r6 = r7.A02;
                    obj4.getClass();
                    r6.A0J(new C70603Bt(obj4, 36));
                }
                r7.A02.A0J(new AnonymousClass3C0(obj4, obj3, 3));
            } catch (IOException e) {
                e = e;
                r2 = r7.A02;
                i = 20;
                r2.A0J(new C21368Aix(r7, obj2, e, obj, i));
            }
        } else {
            Object obj5 = this.A04;
            boolean z2 = this.A0B;
            obj = this.A05;
            String str2 = this.A0A;
            File file2 = (File) this.A06;
            List list2 = (List) this.A07;
            Object obj6 = this.A08;
            obj2 = this.A09;
            try {
                r7.A0B((AnonymousClass206) null, C26551So.A04, (C692236j) this.A03, file2, str2, list2, i3, z2, true, false);
                r7.A02.A0J(new AnonymousClass3C0(obj6, obj5, 0));
            } catch (IOException e2) {
                e = e2;
                r2 = r7.A02;
                i = 19;
                r2.A0J(new C21368Aix(r7, obj2, e, obj, i));
            }
        }
    }

    public AnonymousClass7R8(Context context, Uri uri, AnonymousClass1FR r4, C72433Ly r5, C34531kd r6, C692236j r7, File file, Long l, String str, List list, int i, int i2, boolean z) {
        this.A02 = r6;
        this.A01 = i;
        this.A04 = uri;
        this.A0B = z;
        this.A05 = file;
        this.A06 = context;
        this.A0A = str;
        this.A07 = list;
        this.A08 = r5;
        this.A09 = r4;
        this.A03 = r7;
    }
}
