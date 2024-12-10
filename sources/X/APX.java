package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;

public class APX implements BD3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BusinessDirectoryContextualSearchViewModel A01;
    public final /* synthetic */ AF0 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public int BKI() {
        return 1;
    }

    public APX(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, AF0 af0, String str, String str2, String str3, String str4, int i) {
        this.A01 = businessDirectoryContextualSearchViewModel;
        this.A00 = i;
        this.A02 = af0;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A03 = str4;
    }

    public Double CC2() {
        return this.A02.A02;
    }

    public double CCv() {
        return this.A02.A00;
    }

    public int CDG() {
        return this.A00 + 1;
    }

    public String CDH() {
        return this.A02.A0H;
    }

    public String CH7() {
        return this.A01.A0P.A0K;
    }

    public String BkK() {
        return this.A03;
    }

    public String CCV() {
        return this.A04;
    }

    public String CD9() {
        return this.A05;
    }

    public String CH5() {
        return this.A06;
    }
}
