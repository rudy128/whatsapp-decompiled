package X;

import androidx.fragment.app.Fragment;
import com.whatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment;

public class APC implements C107905ao {
    public final AnonymousClass02n A00;
    public final Fragment A01;
    public final AM5 A02;
    public final C173738ve A03;
    public final C169238ka A04;
    public final AAC A05;
    public final C189999kC A06;
    public final C22552BCj A07;
    public final C219217x A08;
    public final AnonymousClass1XN A09;
    public final AnonymousClass1LU A0A;

    public void A00() {
        LocationOptionPickerFragment locationOptionPickerFragment = (LocationOptionPickerFragment) this.A01.A1E().A0Q("location-options-bottom-sheet");
        if (locationOptionPickerFragment != null) {
            locationOptionPickerFragment.A02 = this;
        }
    }

    public void BxH() {
        if (this.A08.A06()) {
            this.A07.BxF();
        } else {
            Fragment fragment = this.A01;
            C134126q5 A0J = AnonymousClass8BY.A0J(fragment);
            A0J.A02 = 2131894352;
            fragment.startActivityForResult(A0J.A00(), 34);
        }
        this.A02.A03(3, 0);
    }

    public void BxI() {
        this.A02.A03(4, 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.02h] */
    public APC(Fragment fragment, AM5 am5, C173738ve r5, C169238ka r6, AAC aac, C189999kC r8, C22552BCj bCj, C219217x r10, AnonymousClass1LU r11, AnonymousClass1XN r12) {
        this.A01 = fragment;
        this.A0A = r11;
        this.A08 = r10;
        this.A05 = aac;
        this.A04 = r6;
        this.A09 = r12;
        this.A06 = r8;
        this.A03 = r5;
        this.A07 = bCj;
        this.A02 = am5;
        this.A00 = fragment.CDw(new AGF(this, r12), new Object());
    }
}
