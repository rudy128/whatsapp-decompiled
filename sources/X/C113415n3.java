package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import com.whatsapp.wds.components.list.listitem.WDSListItem;

/* renamed from: X.5n3  reason: invalid class name and case insensitive filesystem */
public class C113415n3 extends C42011xT {
    public WDSListItem A00;
    public View A01;
    public ViewStub A02;
    public final WaTextView A03;
    public final WDSListItem A04;
    public final WDSListItem A05;
    public final String A06;
    public final AnonymousClass1LU A07;

    public C113415n3(View view, C18030ve r5, AnonymousClass1LU r6, String str) {
        super(view);
        this.A07 = r6;
        View A062 = AnonymousClass1HF.A06(view, 2131435827);
        this.A01 = A062;
        if (A062 instanceof ViewStub) {
            ((ViewStub) A062).setLayoutResource(AnonymousClass1J8.A05(r5) ? 2131627597 : 2131627142);
            A062 = ((ViewStub) this.A01).inflate();
            this.A01 = A062;
        }
        if (A062 instanceof WDSSectionHeader) {
            ((WDSSectionHeader) A062).setHeaderText(2131896565);
        }
        WDSListItem wDSListItem = (WDSListItem) AnonymousClass1HF.A06(view, 2131435826);
        this.A05 = wDSListItem;
        wDSListItem.setText(2131896566);
        wDSListItem.setSubText(2131896564);
        if (C18020vd.A05(C18040vf.A02, r5, 9075)) {
            ViewStub A0E = AnonymousClass3MW.A0E(view, 2131432767);
            this.A02 = A0E;
            A0E.inflate();
            WDSListItem wDSListItem2 = (WDSListItem) AnonymousClass1HF.A06(view, 2131432766);
            this.A00 = wDSListItem2;
            wDSListItem2.setText(2131892259);
            this.A00.setSubText(2131892258);
        }
        this.A03 = AnonymousClass3MW.A0T(view, 2131434760);
        WDSListItem wDSListItem3 = (WDSListItem) AnonymousClass1HF.A06(view, 2131427928);
        this.A04 = wDSListItem3;
        wDSListItem3.setText(2131886806);
        this.A06 = str;
    }
}
