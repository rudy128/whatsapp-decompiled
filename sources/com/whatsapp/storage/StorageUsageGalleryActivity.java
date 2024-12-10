package com.whatsapp.storage;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass02B;
import X.AnonymousClass02H;
import X.AnonymousClass039;
import X.AnonymousClass11C;
import X.AnonymousClass18K;
import X.AnonymousClass1BI;
import X.AnonymousClass1DS;
import X.AnonymousClass1E7;
import X.AnonymousClass1F9;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1M9;
import X.AnonymousClass1ST;
import X.AnonymousClass1W2;
import X.AnonymousClass1WR;
import X.AnonymousClass1Y5;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass49C;
import X.AnonymousClass4S9;
import X.AnonymousClass4SX;
import X.AnonymousClass4aU;
import X.AnonymousClass5ZZ;
import X.AnonymousClass78P;
import X.AnonymousClass7FQ;
import X.AnonymousClass7RI;
import X.C003401n;
import X.C106765Xc;
import X.C107265Za;
import X.C108675c7;
import X.C108875cR;
import X.C1406372h;
import X.C1606589k;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18030ve;
import X.C222219b;
import X.C24681Lg;
import X.C24921Me;
import X.C27201Vd;
import X.C31141f5;
import X.C34001jj;
import X.C37451pZ;
import X.C42621yT;
import X.C441822l;
import X.C56472hW;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import X.C75283eI;
import X.C79473vU;
import X.C79573vg;
import X.C79633vm;
import X.C84494Js;
import X.C87564Wb;
import X.C88584aA;
import X.C95134lk;
import X.C95144ll;
import X.C95154lm;
import X.C95504mL;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class StorageUsageGalleryActivity extends C75283eI implements C108875cR {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public ViewGroup A04;
    public AnonymousClass02B A05;
    public C42621yT A06;
    public C84494Js A07;
    public AnonymousClass1M9 A08;
    public C24921Me A09;
    public C37451pZ A0A;
    public C27201Vd A0B;
    public AnonymousClass4SX A0C;
    public AnonymousClass4S9 A0D;
    public AnonymousClass49C A0E;
    public AnonymousClass1ST A0F;
    public C24681Lg A0G;
    public C1406372h A0H;
    public AnonymousClass1E7 A0I;
    public ProgressDialogFragment A0J;
    public AnonymousClass18K A0K;
    public AnonymousClass1BI A0L;
    public StorageUsageMediaGalleryFragment A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public Runnable A0P;
    public Runnable A0Q;
    public String A0R;
    public AnonymousClass02H A0S;
    public final Handler A0T = C17890vO.A0D();
    public final Runnable A0U = new AnonymousClass7RI(this, 41);
    public final Runnable A0V = new AnonymousClass7RI(this, 42);
    public final C106765Xc A0W = new C95154lm(this, 4);
    public final AnonymousClass1WR A0X = new C95504mL(this, 17);
    public final C1606589k A0Y = new AnonymousClass7FQ(this, 1);

    public int A31() {
        return 78318969;
    }

    public void BC4(Drawable drawable, View view) {
    }

    public /* synthetic */ void BCy(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BCz(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BId() {
    }

    public /* synthetic */ void BLe(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C2C(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C2F(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C3D(AnonymousClass206 r1, boolean z) {
    }

    public /* synthetic */ void CH6(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CJr(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void CMe(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CNC(C441822l r1) {
    }

    public void CND(View view, AnonymousClass206 r2, int i, int i2, boolean z) {
    }

    public /* synthetic */ void CNE(View view, AnonymousClass206 r2, Runnable runnable, int i, int i2, boolean z) {
    }

    public /* synthetic */ void CNF(int i) {
    }

    public /* synthetic */ void CRK(AnonymousClass206 r1) {
    }

    public AnonymousClass1F9 getLifecycleOwner() {
        return this;
    }

    public /* synthetic */ void setAnimationNye(AnonymousClass205 r1) {
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass206 r1) {
    }

    public static void A03(StorageUsageGalleryActivity storageUsageGalleryActivity) {
        Handler handler = storageUsageGalleryActivity.A0T;
        handler.removeCallbacks(storageUsageGalleryActivity.A0V);
        Runnable runnable = storageUsageGalleryActivity.A0Q;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
            storageUsageGalleryActivity.A0Q = null;
        }
        ProgressDialogFragment progressDialogFragment = storageUsageGalleryActivity.A0J;
        if (progressDialogFragment != null) {
            progressDialogFragment.A29();
            storageUsageGalleryActivity.A0J = null;
        }
        AnonymousClass49C r1 = storageUsageGalleryActivity.A0E;
        if (r1 != null) {
            r1.A0B(true);
            storageUsageGalleryActivity.A0E = null;
        }
        C42621yT r0 = storageUsageGalleryActivity.A06;
        if (r0 != null) {
            r0.A01();
            storageUsageGalleryActivity.A06 = null;
        }
    }

    public static void A0Q(StorageUsageGalleryActivity storageUsageGalleryActivity) {
        int i;
        ViewGroup viewGroup = storageUsageGalleryActivity.A04;
        if (viewGroup != null) {
            TextView A0J2 = AnonymousClass3MW.A0J(viewGroup, 2131435821);
            long j = storageUsageGalleryActivity.A03;
            if (j >= 0) {
                A0J2.setText(C88584aA.A04(storageUsageGalleryActivity.A00, Math.max(j - storageUsageGalleryActivity.A02, 0)));
                i = 0;
            } else {
                i = 8;
            }
            A0J2.setVisibility(i);
        }
    }

    public static void A0V(StorageUsageGalleryActivity storageUsageGalleryActivity) {
        AnonymousClass4S9 r0;
        AnonymousClass02B r1 = storageUsageGalleryActivity.A05;
        if (r1 != null && (r0 = storageUsageGalleryActivity.A0D) != null) {
            if (r0.A03.isEmpty()) {
                r1.A05();
                return;
            }
            AnonymousClass11C r6 = storageUsageGalleryActivity.A08;
            Resources resources = storageUsageGalleryActivity.getResources();
            AnonymousClass4S9 r3 = storageUsageGalleryActivity.A0D;
            int size = r3.A03.size();
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, r3.A03.size());
            AnonymousClass1Y5.A00(storageUsageGalleryActivity, r6, resources.getQuantityString(2131755256, size, A1a));
            storageUsageGalleryActivity.A05.A06();
        }
    }

    public void BLL() {
        AnonymousClass02B r0 = this.A05;
        if (r0 != null) {
            r0.A05();
        }
    }

    public Object BPO(Class cls) {
        if (cls == C106765Xc.class) {
            return this.A0W;
        }
        return null;
    }

    public boolean Bcq() {
        return AnonymousClass000.A1W(this.A0D);
    }

    public /* synthetic */ boolean BfZ() {
        return false;
    }

    public boolean Bfa(AnonymousClass206 r3) {
        AnonymousClass4S9 r0 = this.A0D;
        if (r0 != null) {
            if (!r0.A03.containsKey(r3.A0v)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean Bfy() {
        return false;
    }

    public /* synthetic */ boolean Bgu() {
        return false;
    }

    public /* synthetic */ boolean Bjq() {
        return true;
    }

    public void CKg(List list, boolean z) {
        if (this.A0D == null) {
            this.A0D = new AnonymousClass4S9(this.A05, new C95144ll(this, 2), (AnonymousClass4S9) null, this.A0G);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y2 = C17880vN.A0Y(it);
            AnonymousClass4S9 r0 = this.A0D;
            AnonymousClass205 r1 = A0Y2.A0v;
            HashMap hashMap = r0.A03;
            if (z) {
                hashMap.put(r1, A0Y2);
            } else {
                hashMap.remove(r1);
            }
        }
        A0V(this);
    }

    public /* synthetic */ boolean CMM() {
        return false;
    }

    public /* synthetic */ boolean CMu() {
        return false;
    }

    public void COH(AnonymousClass206 r8) {
        AnonymousClass1KB r4 = this.A05;
        C24681Lg r3 = this.A0G;
        AnonymousClass4S9 r0 = new AnonymousClass4S9(r4, new C95144ll(this, 2), this.A0D, r3);
        this.A0D = r0;
        r0.A03.put(r8.A0v, r8);
        this.A05 = COJ(this.A0S);
        AnonymousClass11C r6 = this.A08;
        Resources resources = getResources();
        AnonymousClass4S9 r32 = this.A0D;
        int size = r32.A03.size();
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, r32.A03.size());
        AnonymousClass1Y5.A00(this, r6, resources.getQuantityString(2131755256, size, A1a));
    }

    public boolean CPY(AnonymousClass206 r6) {
        AnonymousClass4S9 r4 = this.A0D;
        if (r4 == null) {
            r4 = new AnonymousClass4S9(this.A05, new C95144ll(this, 2), (AnonymousClass4S9) null, this.A0G);
            this.A0D = r4;
        }
        AnonymousClass205 r2 = r6.A0v;
        boolean containsKey = r4.A03.containsKey(r2);
        HashMap hashMap = this.A0D.A03;
        if (containsKey) {
            hashMap.remove(r2);
        } else {
            hashMap.put(r2, r6);
        }
        A0V(this);
        return !containsKey;
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public C108675c7 getConversationRowCustomizer() {
        return this.A0C.A08;
    }

    public /* synthetic */ AnonymousClass206 getFirstEverKnownLastMessage() {
        return null;
    }

    public /* synthetic */ AnonymousClass1DS getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ AnonymousClass1DS getLastMessageLiveData() {
        return null;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public void onBackPressed() {
        long j = this.A02;
        if (j >= 0) {
            if (j > this.A03) {
                Log.e("StorageUsageGalleryActivity/Deleted media size is greater than the total media size");
            }
            Intent A0A2 = C17880vN.A0A();
            AnonymousClass1BI r1 = this.A0L;
            if (r1 != null) {
                AnonymousClass3MY.A12(A0A2, r1, "jid");
            }
            A0A2.putExtra("gallery_type", this.A01);
            A0A2.putExtra("memory_size", Math.max(this.A03 - this.A02, 0));
            A0A2.putExtra("deleted_size", this.A02);
            setResult(1, A0A2);
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        A3f();
        setContentView(2131624114);
        C18030ve r15 = this.A0E;
        AnonymousClass1KW r14 = this.A0D;
        C18000vb r13 = this.A00;
        AnonymousClass1K1 r3 = this.A07.A00.A00;
        this.A0S = new C79573vg((AnonymousClass1FY) this, (AnonymousClass5ZZ) new C79473vU((C56472hW) r3.A2M.get(), this, (C79633vm) r3.A5v.get()), (C107265Za) new C95134lk(), (C87564Wb) this.A0O.get(), r13, r14, r15, (Object) this, 7);
        this.A0A = this.A0B.A06(this, "storage-usage-gallery-activity");
        int intExtra = getIntent().getIntExtra("gallery_type", 0);
        this.A01 = intExtra;
        if (intExtra == 0) {
            AnonymousClass1BI A0l = AnonymousClass3MX.A0l(C72453Mb.A0u(this));
            C17960vV.A07(A0l);
            this.A0L = A0l;
            this.A0I = this.A08.A0E(A0l);
        }
        this.A03 = getIntent().getLongExtra("memory_size", 0);
        this.A0R = C72453Mb.A0v(this);
        this.A00 = getIntent().getIntExtra("entry_point", 0);
        String str = null;
        if (bundle == null) {
            int i = this.A01;
            AnonymousClass1BI r0 = this.A0L;
            if (r0 != null) {
                str = r0.getRawString();
            }
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putInt("sort_type", 2);
            A0D2.putString("storage_media_gallery_fragment_jid", str);
            A0D2.putInt("storage_media_gallery_fragment_gallery_type", i);
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = new StorageUsageMediaGalleryFragment();
            storageUsageMediaGalleryFragment.A1R(A0D2);
            this.A0M = storageUsageMediaGalleryFragment;
            C34001jj A0H2 = AnonymousClass3Ma.A0H(this);
            A0H2.A0C(this.A0M, "storage_usage_gallery_fragment_tag", 2131435825);
            A0H2.A01();
            this.A02 = 0;
        } else {
            this.A0M = (StorageUsageMediaGalleryFragment) getSupportFragmentManager().A0Q("storage_usage_gallery_fragment_tag");
            ArrayList A042 = AnonymousClass4aU.A04(bundle2);
            if (A042 != null) {
                Iterator it = A042.iterator();
                while (it.hasNext()) {
                    AnonymousClass205 r6 = (AnonymousClass205) it.next();
                    AnonymousClass206 A012 = AnonymousClass1W2.A01(r6, this.A0N);
                    if (A012 != null) {
                        AnonymousClass4S9 r2 = this.A0D;
                        if (r2 == null) {
                            r2 = new AnonymousClass4S9(this.A05, new C95144ll(this, 2), (AnonymousClass4S9) null, this.A0G);
                            this.A0D = r2;
                        }
                        r2.A03.put(r6, A012);
                    }
                }
                if (this.A0D != null) {
                    this.A05 = COJ(this.A0S);
                }
            }
            this.A02 = bundle2.getLong("deleted_size");
        }
        C1406372h r02 = this.A0H;
        r02.A07.add(this.A0Y);
        this.A0G.registerObserver(this.A0X);
        C003401n A0J2 = AnonymousClass3MY.A0J(this);
        A0J2.A0W(false);
        A0J2.A0Y(false);
        AnonymousClass3Ma.A0F(this).A0L();
        View inflate = LayoutInflater.from(this).inflate(2131627134, (ViewGroup) null, false);
        C17960vV.A05(inflate);
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.A04 = viewGroup;
        ImageView A0G2 = AnonymousClass3MW.A0G(viewGroup, 2131435810);
        A0G2.setOnClickListener(new AnonymousClass78P((Object) this, 39));
        int i2 = 2131231900;
        if (AnonymousClass3MY.A1b(this.A00)) {
            i2 = 2131231675;
        }
        A0G2.setImageResource(i2);
        View A062 = AnonymousClass1HF.A06(this.A04, 2131435828);
        A062.setVisibility(0);
        A062.setOnClickListener(new AnonymousClass78P((Object) this, 40));
        A0J2.A0G();
        A0J2.A0Q(this.A04, new AnonymousClass039(-1, -1));
        TextEmojiLabel A0V2 = AnonymousClass3MX.A0V(this.A04, 2131435822);
        View A063 = AnonymousClass1HF.A06(this.A04, 2131435820);
        ImageView A0G3 = AnonymousClass3MW.A0G(this.A04, 2131435819);
        int i3 = this.A01;
        if (i3 == 2) {
            A0V2.setText(C31141f5.A04(this, this.A00));
        } else if (i3 == 1) {
            A0V2.setText(2131896556);
        } else {
            if (i3 == 0) {
                C24921Me r1 = this.A09;
                AnonymousClass1E7 r03 = this.A0I;
                C17960vV.A07(r03);
                A0V2.A0R(r1.A0I(r03));
                A063.setVisibility(0);
                this.A0A.A07(A0G3, this.A0I);
            }
            A0Q(this);
            A39(this.A00, this.A05);
        }
        A063.setVisibility(8);
        A0Q(this);
        A39(this.A00, this.A05);
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        C72483Me.A10(A33, this);
        return A33;
    }

    public /* synthetic */ int BW6(AnonymousClass206 r2) {
        return 1;
    }

    public /* synthetic */ boolean Bgo(AnonymousClass206 r2) {
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass4S9 r1 = this.A0D;
        if (r1 != null) {
            r1.A01();
            this.A0D = null;
        }
        this.A0M = null;
        C1406372h r0 = this.A0H;
        r0.A07.remove(this.A0Y);
        A03(this);
        this.A0G.unregisterObserver(this.A0X);
        C37451pZ r02 = this.A0A;
        if (r02 != null) {
            r02.A02();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass4S9 r0 = this.A0D;
        if (r0 != null) {
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = r0.A03.values().iterator();
            while (it.hasNext()) {
                C72463Mc.A1L(A13, it);
            }
            AnonymousClass4aU.A0C(bundle, A13);
        }
        bundle.putLong("deleted_size", this.A02);
    }
}
