package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.chatinfo.MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1;
import com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.info.views.StarredMessageInfoView;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.ui.media.MediaCard;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3o2  reason: invalid class name and case insensitive filesystem */
public abstract class C76733o2 extends AnonymousClass3gc {
    public long A00;
    public View A01;
    public C23721Hj A02;
    public C84154Ih A03;
    public C33251iW A04;
    public C195529tU A05;
    public C107235Yx A06;
    public C107245Yy A07;
    public AnonymousClass4SU A08;
    public C107255Yz A09;
    public AnonymousClass4SE A0A;
    public AnonymousClass3Ua A0B;
    public C31191fA A0C;
    public AnonymousClass17T A0D;
    public AnonymousClass1M9 A0E;
    public C219217x A0F;
    public AnonymousClass1LW A0G;
    public AnonymousClass1CJ A0H;
    public AnonymousClass1NN A0I;
    public AnonymousClass1MZ A0J;
    public AnonymousClass1QJ A0K;
    public AnonymousClass1R2 A0L;
    public AnonymousClass1Nb A0M;
    public AnonymousClass1PU A0N;
    public C28931bI A0O;
    public C28931bI A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;
    public boolean A0Y;
    public AnonymousClass02n A0Z = null;
    public AnonymousClass21V A0a;
    public C28931bI A0b = null;
    public boolean A0c = false;
    public final CompoundButton.OnCheckedChangeListener A0d = new C90874em(this, 2);
    public final C25231Nk A0e = new C95444mF(this, 1);
    public final HashSet A0f = C17880vN.A12();

    public static void A1O(C76733o2 r8) {
        C76733o2 r4 = r8;
        if (r8.A4c() != null) {
            if (C18020vd.A05(C18040vf.A02, r8.A0E, 9141)) {
                C28931bI r0 = r8.A0b;
                if (r0 == null) {
                    View findViewById = r8.A00.findViewById(2131432687);
                    if (findViewById != null) {
                        r0 = AnonymousClass3MW.A0p(findViewById);
                        r8.A0b = r0;
                    } else {
                        return;
                    }
                }
                ListItemWithLeftIcon listItemWithLeftIcon = (ListItemWithLeftIcon) r0.A02();
                AnonymousClass4OR r3 = new AnonymousClass4OR(r4, r8.A0d, listItemWithLeftIcon, r8.A4c(), AnonymousClass3MZ.A11(r8.A03.A00.A01));
                AnonymousClass3MX.A1Q(new MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1(r3, (C30391dr) null), AnonymousClass3MZ.A0H(r4));
                listItemWithLeftIcon.setVisibility(0);
            }
        }
    }

    public static void A1N(Bitmap bitmap, C76733o2 r7) {
        CYk cYk = new CYk(bitmap);
        new AnonymousClass3NN(cYk, new C91794gG(r7)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{cYk.A01});
    }

    public void A3K() {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 3858)) {
            AnonymousClass3MX.A0u(this.A0V).A02(A4c(), 5);
        }
    }

    public AnonymousClass1BI A4c() {
        if (this instanceof NewsletterInfoActivity) {
            return ((NewsletterInfoActivity) this).A4m();
        }
        if (this instanceof GroupChatInfoActivity) {
            return ((GroupChatInfoActivity) this).A4l();
        }
        if (this instanceof ListChatInfoActivity) {
            return ((ListChatInfoActivity) this).A4l();
        }
        return ((ContactInfoActivity) this).A4l();
    }

    public void A4d() {
        this.A0A.A01(this.A0M.A0a(A4c()).A01);
    }

    public void A4e() {
        this.A0B.A0U();
    }

    public void A4i(AnonymousClass3Ua r3) {
        this.A0B = r3;
        C91574fu.A00(this, r3.A02, 15);
        C91574fu.A00(this, r3.A05, 16);
        C91574fu.A00(this, r3.A07, 17);
        C91574fu.A00(this, r3.A03, 18);
        C91574fu.A00(this, r3.A06, 19);
        C91574fu.A00(this, r3.A04, 20);
        C91574fu.A00(this, r3.A01, 21);
    }

    public void A4k(List list) {
        this.A08.A01(list);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.02h] */
    public void onCreate(Bundle bundle) {
        AnonymousClass205 A032;
        if (AnonymousClass745.A00) {
            Window window = getWindow();
            window.requestFeature(13);
            if (getIntent().getBooleanExtra("circular_transition", false)) {
                window.requestFeature(12);
                C22633BGt bGt = new C22633BGt(true, false);
                bGt.addTarget(AnonymousClass4ZR.A01(this));
                window.setSharedElementEnterTransition(bGt);
                bGt.addListener(new C75453hW(this, 0));
            }
            Fade fade = new Fade();
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            window.setReturnTransition(fade);
            window.setEnterTransition(fade);
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
        }
        A2r(5);
        super.onCreate(bundle);
        C31191fA r3 = this.A0C;
        this.A0Z = CDw(new C91054f4(this, r3, 4), new Object());
        if (!(bundle == null || (A032 = AnonymousClass4aU.A03(bundle, "requested_message")) == null)) {
            this.A0a = (AnonymousClass21V) AnonymousClass1W2.A01(A032, this.A0U);
        }
        this.A0I.registerObserver(this.A0e);
    }

    public void onDestroy() {
        if (this.A0c) {
            C31191fA r1 = this.A0C;
            if (!r1.A01) {
                r1.A03 = false;
                this.A0c = false;
            }
        }
        super.onDestroy();
        A4e();
        this.A0b = null;
        this.A0I.unregisterObserver(this.A0e);
    }

    public void A4f() {
        this.A0O = C72453Mb.A0r(this, 2131432376);
        AnonymousClass1BI A4c = A4c();
        if (A4c != null) {
            this.A08 = this.A07.BGv(this, A4c, (MediaCard) this.A0O.A02());
        }
    }

    public void A4g(long j) {
        ((StarredMessageInfoView) findViewById(2131435576)).A0A(j, AnonymousClass3MX.A0i(this.A0W).A03(A4c()));
    }

    public void A4h(Bitmap bitmap) {
        ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) C72453Mb.A0h(this);
        C72463Mc.A13(chatInfoLayoutV2, 2131433807);
        chatInfoLayoutV2.A03.setImageBitmap(bitmap);
        chatInfoLayoutV2.A03.setOnClickListener(chatInfoLayoutV2.A0A);
        A1N(bitmap, this);
    }

    public void A4j(Integer num) {
        C76783oH A0h = C72453Mb.A0h(this);
        this.A0S.get();
        AnonymousClass1VX A012 = AnonymousClass1VW.A01(A4c());
        ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) A0h;
        C72463Mc.A13(chatInfoLayoutV2, 2131433807);
        if (num != null) {
            chatInfoLayoutV2.A05.A0A(chatInfoLayoutV2.A03, A012, chatInfoLayoutV2.A00, num.intValue(), AnonymousClass3MW.A01(chatInfoLayoutV2.getResources(), 2131165849));
        }
        chatInfoLayoutV2.A03.setOnClickListener(chatInfoLayoutV2.A0A);
        A0h.setColor(AnonymousClass3MZ.A00(this));
        findViewById(2131428343).setBackgroundColor(0);
        findViewById(2131436304).setBackgroundColor(0);
    }

    public void finishAfterTransition() {
        A4e();
        super.finishAfterTransition();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 34 && i2 == -1) {
            this.A08.A00((View) null);
        }
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            A4e();
        }
    }

    public void onResume() {
        AnonymousClass1BI A4c = A4c();
        if (A4c != null && this.A0C.A0M(A4c())) {
            AnonymousClass02n r2 = this.A0Z;
            if (r2 != null) {
                C31191fA r1 = this.A0C;
                if (!r1.A02) {
                    this.A0c = true;
                    r1.A09(r2, A4c, 4);
                }
            }
            finish();
            C31191fA r12 = this.A0C;
            if (!r12.A01) {
                r12.A02 = false;
            }
        }
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass21V r0 = this.A0a;
        if (r0 != null) {
            AnonymousClass4aU.A0B(bundle, r0.A0v, "requested_message");
        }
    }

    public void onStart() {
        super.onStart();
        A1O(this);
    }

    public void onWindowFocusChanged(boolean z) {
        AnonymousClass1BI A4c = A4c();
        if (A4c != null && this.A0C.A05.A0S(A4c)) {
            Window window = getWindow();
            if (z) {
                window.clearFlags(DefaultCrypto.BUFFER_SIZE);
            } else {
                window.setFlags(DefaultCrypto.BUFFER_SIZE, DefaultCrypto.BUFFER_SIZE);
            }
        }
    }
}
