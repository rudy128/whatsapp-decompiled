package X;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.whatsapp.gallery.GalleryRecentsFragment;
import com.whatsapp.gallery.GalleryTabHostFragment;
import java.util.Collection;

/* renamed from: X.5np  reason: invalid class name and case insensitive filesystem */
public final class C113825np extends BLs implements C1606389i {
    public final int A00;
    public final Resources A01;
    public final AnonymousClass7DY A02;
    public final GalleryTabHostFragment A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Long A0H;
    public final Long A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final C18100vl A0O = AnonymousClass1DF.A01(new C151087lj(this));
    public final C18100vl A0P = AnonymousClass1DF.A01(new C151097lk(this));
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;

    public int A0Q() {
        return 2;
    }

    public static GalleryRecentsFragment A00(C113825np r0) {
        return (GalleryRecentsFragment) r0.A0P.getValue();
    }

    public Fragment A0U(int i) {
        C18100vl r0;
        if (i == 0) {
            r0 = this.A0P;
        } else if (i == 1) {
            r0 = this.A0O;
        } else {
            throw AnonymousClass001.A13("Invalid item position: ", AnonymousClass000.A10(), i);
        }
        return (Fragment) r0.getValue();
    }

    public void BYp(AnonymousClass73D r2, Collection collection) {
        C18070vi.A0h(collection, r2);
        A00(this).BYp(r2, collection);
    }

    public void CDn() {
        A00(this).CDn();
    }

    public void CKe(AnonymousClass73D r2, Collection collection, Collection collection2) {
        C18070vi.A0n(collection, collection2, r2);
        A00(this).CKe(r2, collection, collection2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113825np(Resources resources, Fragment fragment, AnonymousClass7DY r5, GalleryTabHostFragment galleryTabHostFragment, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Integer num, Integer num2, Integer num3, Long l, Long l2, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, boolean z3) {
        super(fragment.A1E(), fragment.A0L);
        C18070vi.A0d(resources, 2);
        this.A03 = galleryTabHostFragment;
        this.A01 = resources;
        this.A00 = i;
        this.A0M = str;
        this.A0R = z;
        this.A02 = r5;
        this.A0J = str2;
        this.A0Q = z2;
        this.A0H = l;
        this.A0L = str3;
        this.A0E = num;
        this.A06 = bool;
        this.A0K = str4;
        this.A07 = bool2;
        this.A08 = bool3;
        this.A0I = l2;
        this.A0B = bool4;
        this.A0A = bool5;
        this.A0D = bool6;
        this.A09 = bool7;
        this.A0F = num2;
        this.A0S = z3;
        this.A0C = bool8;
        this.A0N = str5;
        this.A04 = bool9;
        this.A0G = num3;
        this.A05 = bool10;
    }
}
