package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.5jX  reason: invalid class name and case insensitive filesystem */
public final class C111325jX extends C22702BLf {
    public List A00;
    public final C18000vb A01;
    public final C18030ve A02;
    public final Set A03 = C17880vN.A14();
    public final File[] A04;

    public C111325jX(Context context, C218617r r9, C18000vb r10, C18030ve r11, String[] strArr) {
        super(context);
        this.A02 = r11;
        this.A01 = r10;
        if (strArr != null) {
            for (Object add : C200410p.A0P(strArr)) {
                this.A03.add(add);
            }
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        C18070vi.A0X(externalStorageDirectory);
        File file = r9.A08().A03;
        C218617r.A07(file, false);
        C18070vi.A0X(file);
        this.A04 = new File[]{C17880vN.A0e(Environment.getExternalStorageDirectory(), "Download"), externalStorageDirectory, file, C17880vN.A0e(Environment.getExternalStorageDirectory(), "Documents")};
    }

    public void A02() {
        List list = this.A00;
        if (list != null && !this.A05) {
            this.A00 = list;
            if (this.A06) {
                super.A04(list);
            }
        }
        boolean z = this.A03;
        this.A03 = false;
        this.A04 |= z;
        if (z || this.A00 == null) {
            A09();
        }
    }

    public /* bridge */ /* synthetic */ void A04(Object obj) {
        List list = (List) obj;
        if (!this.A05) {
            this.A00 = list;
            if (this.A06) {
                super.A04(list);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A06() {
        ArrayList A0z = C17880vN.A0z(128);
        File[] fileArr = this.A04;
        int i = 0;
        do {
            File[] listFiles = fileArr[i].listFiles(new AnonymousClass7PR(this, 1));
            if (listFiles != null) {
                long A08 = C108995ce.A08(this.A02, 542);
                for (File file : listFiles) {
                    C18070vi.A0b(file);
                    C133676pJ r3 = new C133676pJ(file);
                    if (r3.A01 <= A08) {
                        A0z.add(r3);
                    }
                }
            }
            i++;
        } while (i < 4);
        Collator A0r = C108965cb.A0r(this.A01);
        A0r.setDecomposition(1);
        Collections.sort(A0z, new C146997Rk((Object) new AnonymousClass840(A0r), 6));
        return A0z;
    }

    public void A01() {
        A00();
        this.A00 = null;
    }

    public void A03() {
        A00();
    }
}
