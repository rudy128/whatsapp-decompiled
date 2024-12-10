package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.Map;

public class APT implements C22494BAb {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BusinessDirectoryContextualSearchViewModel A01;
    public final /* synthetic */ AF0 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public APT(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, AF0 af0, String str, String str2, String str3, String str4, int i, boolean z) {
        this.A01 = businessDirectoryContextualSearchViewModel;
        this.A07 = z;
        this.A02 = af0;
        this.A00 = i;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A03 = str4;
    }

    public void ByL() {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A01;
        AM7 A032 = BusinessDirectoryContextualSearchViewModel.A03(businessDirectoryContextualSearchViewModel);
        int i = 20;
        if (this.A07) {
            i = 19;
        }
        A032.A08(A5L.A00(businessDirectoryContextualSearchViewModel), C17880vN.A0l(), (Map) null, 1, i, 1);
        AF0 af0 = this.A02;
        int i2 = this.A00 + 1;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A04;
        String str4 = this.A03;
        BusinessDirectoryContextualSearchViewModel.A0F(businessDirectoryContextualSearchViewModel, af0);
        businessDirectoryContextualSearchViewModel.A0W.A01(af0.A02, 1, str, str2, businessDirectoryContextualSearchViewModel.A0P.A0K, af0.A0H, str3, str4, i2, 1);
        BusinessDirectoryContextualSearchViewModel.A0G(businessDirectoryContextualSearchViewModel, af0, str, str2, str3, str4, i2);
    }

    public void C1v(Integer num, Integer num2, Integer num3, Integer num4) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A01;
        AM7 A032 = BusinessDirectoryContextualSearchViewModel.A03(businessDirectoryContextualSearchViewModel);
        int i = 18;
        if (this.A07) {
            i = 17;
        }
        A032.A08(A5L.A00(businessDirectoryContextualSearchViewModel), C17880vN.A0k(), (Map) null, 1, i, 1);
        AF0 af0 = this.A02;
        int i2 = this.A00 + 1;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A04;
        String str4 = this.A03;
        BusinessDirectoryContextualSearchViewModel.A0F(businessDirectoryContextualSearchViewModel, af0);
        businessDirectoryContextualSearchViewModel.A0W.A01(af0.A02, AnonymousClass3MY.A0f(), str, str2, businessDirectoryContextualSearchViewModel.A0P.A0K, af0.A0H, str3, str4, i2, 1);
        BusinessDirectoryContextualSearchViewModel.A0G(businessDirectoryContextualSearchViewModel, af0, str, str2, str3, str4, i2);
    }
}
