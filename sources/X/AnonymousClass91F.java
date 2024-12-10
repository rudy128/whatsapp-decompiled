package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import java.util.List;

/* renamed from: X.91F  reason: invalid class name */
public abstract class AnonymousClass91F extends C166818e4 implements View.OnClickListener, BBW, BBT, B99, B9A {
    public View A00;
    public SwitchCompat A01;
    public C33301ib A02;
    public AnonymousClass1QL A03;
    public C31051ew A04;
    public C33311ic A05;
    public AnonymousClass1QD A06;
    public C31061ex A07;
    public AnonymousClass1QS A08;
    public C33651jA A09;
    public AnonymousClass8DB A0A;
    public C188459hS A0B;
    public A0R A0C;
    public AnonymousClass00H A0D;
    public View A0E;
    public ListView A0F;
    public View A0G;
    public View A0H;
    public AXQ A0I;

    public Dialog onCreateDialog(int i, Bundle bundle) {
        return ((BrazilFbPayHubActivity) this).A08.A01(bundle, this, i);
    }

    public void CJw(boolean z) {
        this.A0E.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public void CR0(List list) {
        AnonymousClass8DB r0 = this.A0A;
        r0.A00 = list;
        r0.notifyDataSetChanged();
        AnonymousClass4HD.A00(this.A0F);
    }

    /* JADX WARNING: type inference failed for: r28v0, types: [java.lang.Object, X.BBY] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625315);
        int A002 = C19740yt.A00(this, 2131100602);
        C003401n A0K = AnonymousClass3MY.A0K(this, (Toolbar) findViewById(2131433485));
        if (A0K != null) {
            AnonymousClass8BU.A17(A0K, 2131893736);
            AnonymousClass8BY.A0d(this, A0K, A002);
        }
        this.A0G = findViewById(2131433596);
        this.A0H = findViewById(2131433379);
        findViewById(2131433378).setOnClickListener(this);
        BrazilFbPayHubActivity brazilFbPayHubActivity = (BrazilFbPayHubActivity) this;
        this.A0A = new AnonymousClass8DB(brazilFbPayHubActivity, AnonymousClass8BR.A0c(brazilFbPayHubActivity.A09), brazilFbPayHubActivity);
        ListView listView = (ListView) findViewById(2131432751);
        this.A0F = listView;
        listView.setAdapter(this.A0A);
        AnonymousClass10I r12 = this.A05;
        AnonymousClass1QS r11 = this.A08;
        C188079gq r25 = new C188079gq();
        AnonymousClass1QD r10 = this.A06;
        AnonymousClass1QL r7 = this.A03;
        C31061ex r6 = this.A07;
        C33651jA r5 = this.A09;
        C31051ew r4 = this.A04;
        C33301ib r15 = this.A02;
        C33311ic r19 = this.A05;
        AnonymousClass1QD r20 = r10;
        AnonymousClass2L2 r21 = (AnonymousClass2L2) this.A0D.get();
        C31061ex r22 = r6;
        AnonymousClass1QS r23 = r11;
        C33651jA r24 = r5;
        C31051ew r18 = r4;
        AnonymousClass1QL r17 = r7;
        AXQ axq = new AXQ(this, r15, (C48052Kz) null, r17, r18, r19, r20, r21, r22, r23, r24, r25, this, this, new Object(), r12, (String) null, false);
        this.A0I = axq;
        axq.A02(false, false);
        this.A0F.setOnItemClickListener(new C20310AFs(this, 1));
        findViewById(2131427619).setOnClickListener(this);
        AnonymousClass4aX.A0D(AnonymousClass3MX.A0I(this, 2131429005), A002);
        AnonymousClass4aX.A0D(AnonymousClass3MX.A0I(this, 2131427620), A002);
        AnonymousClass4aX.A0D(AnonymousClass3MX.A0I(this, 2131430874), A002);
        AnonymousClass4aX.A0D(AnonymousClass3MX.A0I(this, 2131429897), A002);
        AnonymousClass4aX.A0D(AnonymousClass3MX.A0I(this, 2131434598), A002);
        this.A0E = findViewById(2131433845);
        this.A00 = findViewById(2131430869);
        this.A01 = (SwitchCompat) findViewById(2131436263);
        AnonymousClass10I r102 = brazilFbPayHubActivity.A05;
        AnonymousClass1QS r9 = brazilFbPayHubActivity.A08;
        A4K a4k = brazilFbPayHubActivity.A04;
        AXR axr = brazilFbPayHubActivity.A00;
        C195929uA r42 = brazilFbPayHubActivity.A05;
        C188459hS r152 = new C188459hS(brazilFbPayHubActivity, axr, brazilFbPayHubActivity.A01, r9, brazilFbPayHubActivity.A03, a4k, r42, r102);
        this.A0B = r152;
        A5H a5h = r152.A04;
        boolean A072 = a5h.A00.A07();
        boolean z = false;
        AnonymousClass91F r3 = (AnonymousClass91F) r152.A07;
        if (A072) {
            r3.A00.setVisibility(0);
            if (a5h.A02() == 1) {
                z = true;
            }
            r3.A01.setChecked(z);
            r152.A00 = true;
        } else {
            r3.A00.setVisibility(8);
        }
        AFO.A00(findViewById(2131429004), this, 10);
        AFO.A00(this.A00, this, 11);
        this.A0C = brazilFbPayHubActivity.A08;
        AnonymousClass3Ma.A1D(findViewById(2131429895), this, 35);
        AnonymousClass3Ma.A1D(findViewById(2131434583), this, 36);
    }

    public /* synthetic */ String BUu(C20284AEs aEs) {
        return null;
    }

    public void onClick(View view) {
        if (view.getId() == 2131427619 || view.getId() == 2131433378) {
            Bl5(AnonymousClass000.A1P(this.A0A.getCount()));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0I.A00();
    }

    public void onResume() {
        super.onResume();
        this.A0I.A01(true);
        C188459hS r4 = this.A0B;
        boolean A032 = r4.A06.A03();
        boolean z = false;
        B99 b99 = r4.A07;
        if (A032) {
            b99.CJw(true);
            A5H a5h = r4.A04;
            if (a5h.A00.A07()) {
                r4.A00 = false;
                if (a5h.A02() == 1) {
                    z = true;
                }
                ((AnonymousClass91F) b99).A01.setChecked(z);
                r4.A00 = true;
                return;
            }
            return;
        }
        b99.CJw(false);
    }

    public Dialog onCreateDialog(int i) {
        return ((BrazilFbPayHubActivity) this).A08.A01((Bundle) null, this, i);
    }
}
