package com.whatsapp.payments.ui.widget;

import X.A3P;
import X.A4I;
import X.A59;
import X.A6S;
import X.A9R;
import X.A9Y;
import X.AEX;
import X.AFR;
import X.AFT;
import X.AFW;
import X.AQ4;
import X.AW0;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass039;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass18K;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EG;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1KJ;
import X.AnonymousClass1KK;
import X.AnonymousClass1KL;
import X.AnonymousClass1KN;
import X.AnonymousClass1KW;
import X.AnonymousClass1L4;
import X.AnonymousClass1L9;
import X.AnonymousClass1QD;
import X.AnonymousClass1QO;
import X.AnonymousClass1QR;
import X.AnonymousClass1SB;
import X.AnonymousClass1VW;
import X.AnonymousClass1YQ;
import X.AnonymousClass2LK;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3RR;
import X.AnonymousClass3SU;
import X.AnonymousClass4UI;
import X.AnonymousClass4a6;
import X.AnonymousClass4aX;
import X.AnonymousClass5YC;
import X.AnonymousClass6pA;
import X.AnonymousClass722;
import X.AnonymousClass72F;
import X.AnonymousClass74J;
import X.AnonymousClass7AY;
import X.AnonymousClass7MX;
import X.AnonymousClass88B;
import X.AnonymousClass8B5;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BY;
import X.AnonymousClass91U;
import X.AnonymousClass96c;
import X.AnonymousClass9AL;
import X.AnonymousClass9Q1;
import X.B9B;
import X.BDw;
import X.C003401n;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C111185ii;
import X.C114665ra;
import X.C117015z4;
import X.C1193267r;
import X.C129276hX;
import X.C131196kh;
import X.C132646nG;
import X.C132676nN;
import X.C133686pK;
import X.C134206qD;
import X.C136686uD;
import X.C136836uU;
import X.C140126zz;
import X.C1418377d;
import X.C166568d7;
import X.C170658qS;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C184999br;
import X.C185009bs;
import X.C185019bt;
import X.C185829dD;
import X.C186969f3;
import X.C187419fm;
import X.C188639hk;
import X.C188709hr;
import X.C192889p9;
import X.C19830z4;
import X.C20067A5r;
import X.C20296AFe;
import X.C20448ALl;
import X.C20449ALm;
import X.C20860Aac;
import X.C20867Aaj;
import X.C21433Ak0;
import X.C21448AkF;
import X.C22539BBw;
import X.C22546BCd;
import X.C22577BDx;
import X.C22971Dz;
import X.C24071It;
import X.C24081Iu;
import X.C24111Ix;
import X.C27007DPd;
import X.C27201Vd;
import X.C27581Wq;
import X.C29111bd;
import X.C29261bv;
import X.C37451pZ;
import X.C72453Mb;
import X.C73203Rj;
import X.C74853d1;
import X.C80753xv;
import X.C85224Mo;
import X.C87544Vz;
import X.C89984dL;
import X.C95914n0;
import X.E8G;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PaymentView extends KeyboardPopupLayout implements View.OnClickListener, AnonymousClass88B, AnonymousClass8B5 {
    public int A00;
    public int A01;
    public AutoTransition A02;
    public View A03;
    public Animation A04;
    public FrameLayout A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public LinearLayout A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public LinearLayout A0C;
    public LinearLayout A0D;
    public TextSwitcher A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public Group A0J;
    public CoordinatorLayout A0K;
    public AnonymousClass1YQ A0L;
    public TabLayout A0M;
    public AnonymousClass190 A0N;
    public AnonymousClass1KB A0O;
    public KeyboardPopupLayout A0P;
    public ThumbnailButton A0Q;
    public AnonymousClass1VW A0R;
    public C37451pZ A0S;
    public C27201Vd A0T;
    public AnonymousClass11C A0U;
    public C19830z4 A0V;
    public C18000vb A0W;
    public AnonymousClass1CJ A0X;
    public AnonymousClass1QR A0Y;
    public AnonymousClass1KJ A0Z;
    public C1193267r A0a;
    public AnonymousClass1KW A0b;
    public C131196kh A0c;
    public AnonymousClass18K A0d;
    public C134206qD A0e;
    public C140126zz A0f;
    public AnonymousClass1BI A0g;
    public AnonymousClass1QD A0h;
    public AnonymousClass1QO A0i;
    public C132646nG A0j;
    public B9B A0k;
    public PaymentAmountInputField A0l;
    public AQ4 A0m;
    public BDw A0n;
    public C22546BCd A0o;
    public C185019bt A0p;
    public AnonymousClass5YC A0q;
    public C192889p9 A0r;
    public C18010vc A0s;
    public C1418377d A0t;
    public AnonymousClass1SB A0u;
    public C111185ii A0v;
    public C132676nN A0w;
    public C129276hX A0x;
    public AnonymousClass722 A0y;
    public AnonymousClass10I A0z;
    public AnonymousClass00H A10;
    public AnonymousClass00H A11;
    public AnonymousClass00H A12;
    public AnonymousClass00H A13;
    public AnonymousClass00H A14;
    public AnonymousClass00H A15;
    public AnonymousClass00H A16;
    public Integer A17;
    public String A18;
    public String A19;
    public String A1A;
    public String A1B;
    public String A1C;
    public String A1D;
    public List A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public LinearLayout A1I;
    public LinearLayout A1J;
    public TextSwitcher A1K;
    public TextView A1L;
    public ShimmerFrameLayout A1M;
    public ShimmerFrameLayout A1N;
    public ThumbnailButton A1O;
    public final Runnable A1P;

    public void C8J(C136836uU r1) {
    }

    public void C8N(C136836uU r1) {
    }

    private void A02() {
        this.A0E.setPadding(0, getResources().getDimensionPixelSize(2131168213), 0, 0);
    }

    private void A03() {
        this.A0E.setPadding(getResources().getDimensionPixelSize(2131168197), getResources().getDimensionPixelSize(2131168212), 0, 0);
        this.A0F.setPadding(AnonymousClass3Ma.A02(this, 2131168197), AnonymousClass3Ma.A02(this, 2131168212), 0, 0);
    }

    private void A05(C188639hk r10) {
        C29261bv.A08(this.A0l, r10.A00);
        Pair pair = r10.A01;
        C29261bv.A08(this.A0I, C108965cb.A01(pair));
        TextView textView = this.A0I;
        int[] iArr = (int[]) pair.second;
        textView.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        Pair pair2 = r10.A02;
        C29261bv.A08(this.A0H, C108965cb.A01(pair2));
        TextView textView2 = this.A0H;
        int[] iArr2 = (int[]) pair2.second;
        textView2.setPadding(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
    }

    public static boolean A06(PaymentView paymentView) {
        C18030ve r1 = paymentView.A05;
        C18040vf r2 = C18040vf.A02;
        if (!C18020vd.A05(r2, r1, 3792) || !C18020vd.A05(r2, paymentView.A05, 5372)) {
            return false;
        }
        return true;
    }

    private void setInitialTabConfiguration(C188709hr r3) {
        int i = 1;
        if (r3.A09.A01 == 0) {
            i = 0;
        }
        this.A00 = i;
        C136836uU A082 = this.A0M.A08(i);
        if (A082 != null) {
            A082.A00();
        }
    }

    public void A0B() {
        String str;
        C85224Mo r2;
        String str2;
        AnonymousClass1KJ r8;
        AnonymousClass1KN r7;
        Editable text = this.A0l.getText();
        C17960vV.A07(text);
        String obj = text.toString();
        int i = 1;
        if (this.A00 != 1) {
            this.A0i.A04.A02();
            i = 0;
        }
        AW0 A0J2 = AnonymousClass8BU.A0J(this.A0Y, this.A1B, this.A1D);
        if (A0J2 == null || A0J2.A02 != 18) {
            BigDecimal BLk = this.A0Z.BLk(this.A0W, obj);
            C20867Aaj aaj = (C20867Aaj) this.A0q;
            C187419fm r11 = aaj.A05;
            if (r11 != null) {
                String str3 = r11.A04;
                if (str3 == null || str3.length() == 0) {
                    r8 = r11.A02;
                    r7 = ((AnonymousClass1KL) r8).A05;
                    C18070vi.A0b(r7);
                } else {
                    BigDecimal bigDecimal = new BigDecimal(str3);
                    r8 = r11.A02;
                    r7 = AnonymousClass8BU.A0H(r8, bigDecimal);
                }
                if (BLk == null || r7.A00.compareTo(BLk) > 0) {
                    str = C17880vN.A0q(r11.A00, r8.BLc(r11.A01, r7), AnonymousClass3MW.A1a(), 0, 2131894024);
                    r2 = new C85224Mo(2, str);
                } else {
                    r2 = new C85224Mo(0, "");
                }
            } else if (BLk == null || aaj.A04.A00.compareTo(BLk) > 0) {
                str = C17880vN.A0q(aaj.A01, aaj.A03.BLc(aaj.A02, aaj.A04), AnonymousClass3MW.A1a(), 0, 2131894024);
                r2 = new C85224Mo(2, str);
            } else {
                r2 = new C85224Mo(0, "");
            }
            if (r2.A00 == 0) {
                BLk.getClass();
                r2 = C20867Aaj.A00(aaj, "", BLk, i, false);
            }
            int i2 = r2.A00;
            if ((i2 == 2 || i2 == 3) && (str2 = r2.A01) != null) {
                this.A0l.A0K();
                this.A0n.Bt0(str2);
                A0H(str2);
                AnonymousClass96c.A09(this);
                this.A0r.A01(1);
                return;
            }
            this.A19 = obj;
            AQ4 aq4 = this.A0m;
            if (aq4 != null) {
                this.A1A = aq4.A0B.getStringText();
                this.A1E = this.A0m.A0B.getMentions();
            }
            BDw bDw = this.A0n;
            AnonymousClass1KN A0H2 = AnonymousClass8BU.A0H(this.A0Z, BLk);
            if (i != 0) {
                bDw.C3O(A0H2);
            } else {
                bDw.C57(A0H2);
            }
        } else {
            this.A0n.C5B();
        }
    }

    public void A0C() {
        if (this.A0J.getVisibility() == 0) {
            this.A08.setTag(2131435108, (Object) null);
            this.A08.setImageResource(2131232784);
            B9B b9b = this.A0k;
            if (b9b != null) {
                A05(b9b.CCo().A04);
            }
        }
    }

    public void A0D() {
        AQ4 aq4 = this.A0m;
        if (aq4 != null) {
            aq4.A07.setVisibility(8);
            aq4.A0D = null;
            aq4.A0F = null;
            aq4.A0B.setVisibility(0);
            aq4.A06.setVisibility(0);
        }
    }

    public void A0E() {
        int i;
        if (this.A00 == 1) {
            this.A1K.setVisibility(0);
            this.A1K.setText(this.A0o.BMU().getString(2131894027));
            if (this.A1G) {
                this.A0E.setText(this.A18);
                A0I(this.A1H);
            }
            if (this.A0o.BgS()) {
                this.A0F.setText(this.A0o.BWf());
                this.A0F.setVisibility(0);
                A03();
            } else {
                A02();
            }
            AQ4 aq4 = this.A0m;
            if (aq4 != null) {
                aq4.A0C.A00(2);
            }
            this.A0l.A03 = 1;
            i = 6;
        } else {
            boolean z = this.A1G;
            TextSwitcher textSwitcher = this.A1K;
            if (z) {
                textSwitcher.setVisibility(8);
                this.A0E.setText(A00(this, this.A18, 2131894027));
                A02();
                this.A0F.setVisibility(8);
                A0I(this.A1H);
            } else {
                textSwitcher.setVisibility(0);
                this.A1K.setText(this.A0o.BMU().getString(2131894027));
                this.A0F.setVisibility(8);
                A0F();
            }
            AQ4 aq42 = this.A0m;
            if (aq42 != null) {
                aq42.A0C.A00(1);
            }
            this.A0l.A03 = 0;
            i = this.A01;
        }
        FrameLayout frameLayout = this.A05;
        if (i != 0) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            C17880vN.A1F(AnonymousClass8BU.A07(this.A0h), "payment_incentive_tooltip_viewed", true);
        }
        if (this.A0m != null) {
            boolean BgS = this.A0o.BgS();
            View view = this.A0m.A03;
            if (BgS) {
                view.setVisibility(8);
                return;
            }
            view.setVisibility(0);
            if (this.A0p.A01) {
                MentionableEntry mentionableEntry = this.A0m.A0B;
                AnonymousClass9AL.A00(mentionableEntry, this, 11);
                AnonymousClass722 r1 = this.A0y;
                r1.A0B.unregisterObserver(r1.A09);
                if (!A06(this)) {
                    C192889p9 r3 = this.A0r;
                    AQ4 aq43 = this.A0m;
                    ImageButton imageButton = aq43.A05;
                    GifSearchContainer gifSearchContainer = aq43.A0A;
                    EmojiSearchContainer emojiSearchContainer = aq43.A08;
                    C17960vV.A05(emojiSearchContainer);
                    C22577BDx bDx = this.A0p.A00;
                    C17960vV.A07(bDx);
                    AnonymousClass722 r2 = this.A0y;
                    Integer A002 = A3P.A00(this.A0g);
                    AnonymousClass7MX r12 = new AnonymousClass7MX(r2);
                    ((AnonymousClass91U) bDx).A0Y = r12;
                    C134206qD r13 = r3.A0D;
                    Activity activity = r3.A00;
                    r13.A00 = activity;
                    C136686uD r7 = r3.A06;
                    r13.A02 = r7.A00();
                    r13.A04 = r7.A02(r3.A0G, r2);
                    r13.A01(imageButton, r3.A02, mentionableEntry, A002, 12);
                    C117015z4 A003 = r13.A00();
                    C20449ALm aLm = new C20449ALm(mentionableEntry, r3, 1);
                    C80753xv r72 = new C80753xv(activity, emojiSearchContainer, r3.A0C, A003, gifSearchContainer, r3.A0E);
                    r12.A01(A003, (AnonymousClass1BI) null, bDx);
                    A003.A0J(aLm);
                    A003.A0E = new C21433Ak0(r3, r72, 15);
                    A003.A0N(this);
                    r72.A00 = new C95914n0(aLm, 8);
                    r12.A04 = this;
                    r2.A0B.registerObserver(r2.A09);
                    C108955ca.A1V(A003, r3.A0I, 3);
                    return;
                }
            } else if (!A06(this)) {
                C192889p9 r11 = this.A0r;
                AQ4 aq44 = this.A0m;
                MentionableEntry mentionableEntry2 = aq44.A0B;
                ImageButton imageButton2 = aq44.A05;
                EmojiSearchContainer emojiSearchContainer2 = aq44.A08;
                C17960vV.A05(emojiSearchContainer2);
                Integer A004 = A3P.A00(this.A0g);
                Activity activity2 = r11.A00;
                C18030ve r17 = r11.A0B;
                AnonymousClass190 r15 = r11.A01;
                AnonymousClass1KW r14 = r11.A09;
                C1193267r r8 = r11.A08;
                AnonymousClass11C r73 = r11.A03;
                C18000vb r6 = r11.A05;
                EmojiSearchProvider emojiSearchProvider = r11.A0A;
                C19830z4 r4 = r11.A04;
                C18010vc r32 = r11.A0F;
                KeyboardPopupLayout keyboardPopupLayout = r11.A02;
                AnonymousClass1L4 r31 = r11.A0H;
                MentionableEntry mentionableEntry3 = mentionableEntry2;
                AnonymousClass11C r20 = r73;
                C19830z4 r21 = r4;
                ImageButton imageButton3 = imageButton2;
                AnonymousClass190 r172 = r15;
                KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
                Activity activity3 = activity2;
                C170658qS r142 = new C170658qS(activity3, imageButton3, r172, keyboardPopupLayout2, mentionableEntry3, r20, r21, r6, r11.A07, r8, r14, emojiSearchContainer2, emojiSearchProvider, r17, r11, r32, r31, 12, A004);
                C20449ALm aLm2 = new C20449ALm(mentionableEntry2, r11, 0);
                AnonymousClass4UI r33 = new AnonymousClass4UI(activity2, r142, emojiSearchContainer2);
                r33.A00 = new C95914n0(aLm2, 7);
                r142.A0J(aLm2);
                r142.A0E = new C21433Ak0(r11, r33, 14);
                C108955ca.A1V(r142, r11.A0I, 0);
                return;
            }
            AnonymousClass74J A072 = AnonymousClass96c.A07(this);
            Context context = getContext();
            CoordinatorLayout coordinatorLayout = this.A0K;
            AnonymousClass01E BMU = this.A0o.BMU();
            AQ4 aq45 = this.A0m;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            A072.A0L(BMU, context, coordinatorLayout, aq45.A05, coordinatorLayout2, this.A0P, aq45.A0B, aq45.A09, (AnonymousClass3SU) null, false);
            AFT.A00(this.A0m.A05, this, new C20448ALl(this, 1), 44);
        }
    }

    public void A0F() {
        if (this.A1G) {
            this.A0E.setText(A00(this, this.A18, 2131894027));
            A0I(this.A1H);
            this.A1K.setVisibility(8);
            return;
        }
        this.A1K.setVisibility(0);
        this.A0C.setVisibility(8);
        this.A09.setVisibility(8);
        if (this.A0o.BgS()) {
            this.A0F.setVisibility(0);
            A03();
            return;
        }
        A02();
    }

    public void A0G(C22539BBw bBw, int i, int i2) {
        if (bBw != null) {
            ViewStub viewStub = (ViewStub) findViewById(i);
            if (viewStub != null) {
                AnonymousClass9Q1.A00(viewStub, bBw);
            } else {
                bBw.CA8(findViewById(i2));
            }
        }
    }

    public void A0H(CharSequence charSequence) {
        if (this.A0G != null) {
            boolean A1S = AnonymousClass8BR.A1S(charSequence);
            this.A0G.setVisibility(C72453Mb.A07(A1S ? 1 : 0));
            this.A0G.setText(charSequence);
            this.A04.cancel();
            this.A04.reset();
            Handler handler = getHandler();
            if (handler != null) {
                Runnable runnable = this.A1P;
                handler.removeCallbacks(runnable);
                if (A1S) {
                    this.A0G.announceForAccessibility(charSequence);
                    getHandler().postDelayed(runnable, 4000);
                }
            }
        }
    }

    public void A0I(boolean z) {
        this.A1H = z;
        LinearLayout linearLayout = this.A0C;
        if (z) {
            linearLayout.setVisibility(8);
            this.A09.setVisibility(0);
            return;
        }
        linearLayout.setVisibility(0);
        this.A09.setVisibility(8);
    }

    public boolean A0J() {
        HashMap hashMap = this.A0r.A0I;
        Iterator A0i2 = C17890vO.A0i(hashMap);
        while (A0i2.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A0i2);
            PopupWindow popupWindow = (PopupWindow) hashMap.get(A162.getKey());
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
                int A042 = AnonymousClass8BV.A04(A162);
                if (A042 != 0) {
                    if (A042 != 1) {
                        if (!(A042 == 2 || A042 == 3)) {
                            return false;
                        }
                    }
                    return true;
                }
                AnonymousClass96c.A09(this);
                this.A0r.A01(1);
                return true;
            }
        }
        return false;
    }

    public void C6w(AnonymousClass1BI r5, C1418377d r6, Integer num, int i) {
        AnonymousClass7MX r1 = ((AnonymousClass91U) this.A0p.A00).A0Y;
        if (r1 != null) {
            r1.A04(true);
        }
        AQ4 aq4 = this.A0m;
        if (aq4 == null) {
            return;
        }
        if (aq4.A0D != null || AnonymousClass1EG.A0H(aq4.A0B.getStringText())) {
            AQ4 aq42 = this.A0m;
            if (aq42 != null) {
                aq42.A00(r6, num);
                return;
            }
            return;
        }
        C73203Rj A002 = AnonymousClass4a6.A00(getContext());
        A002.A0E(2131893741);
        A002.A0D(2131893739);
        A002.A0Z(new A9Y(r6, num, this, 0), 2131893740);
        A002.A0X(new A9R(11), 2131893738);
        AnonymousClass3MY.A1G(A002);
    }

    public void C8K(C136836uU r4) {
        boolean z = true;
        if (this.A00 != r4.A00) {
            AnonymousClass96c.A09(this);
            this.A0r.A01(1);
        }
        TransitionManager.beginDelayedTransition(AnonymousClass3MW.A0D(this, 2131435189), this.A02);
        int i = r4.A00;
        this.A00 = i;
        BDw bDw = this.A0n;
        if (i != 1) {
            z = false;
        }
        bDw.C8L(z);
        A0E();
    }

    public List getMentionedJids() {
        AQ4 aq4 = this.A0m;
        if (aq4 != null) {
            return aq4.A0B.getMentions();
        }
        return AnonymousClass000.A13();
    }

    public String getPaymentAmountString() {
        Editable text = this.A0l.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public AEX getPaymentBackground() {
        if (this.A0J.getVisibility() != 0) {
            return null;
        }
        return (AEX) this.A08.getTag(2131435108);
    }

    public String getPaymentNote() {
        AQ4 aq4 = this.A0m;
        if (aq4 != null) {
            return aq4.A0B.getStringText();
        }
        return "";
    }

    public View.OnClickListener getSendPaymentClickListener() {
        return new AFR(this, 44);
    }

    public C1418377d getStickerIfSelected() {
        AQ4 aq4 = this.A0m;
        if (aq4 != null) {
            return aq4.A0D;
        }
        return null;
    }

    public Integer getStickerSendOrigin() {
        AQ4 aq4 = this.A0m;
        if (aq4 != null) {
            return aq4.A0F;
        }
        return null;
    }

    public void setAmountInputData(C184999br r11) {
        TextView textView;
        AnonymousClass1KJ r4 = r11.A01;
        this.A0Z = r4;
        int i = r11.A00;
        this.A0l.A0A = r4;
        AnonymousClass1KK r2 = (AnonymousClass1KK) r4;
        String str = "";
        if (r2.A00 == 0) {
            if (i == 0) {
                C18000vb r9 = this.A0W;
                C18070vi.A0d(r9, 0);
                String str2 = ((AnonymousClass1KL) r4).A06;
                HashSet hashSet = C20067A5r.A00;
                A6S A0G2 = AnonymousClass8BW.A0G(A6S.A02, str2);
                char c = 1;
                A4I A012 = A6S.A01(A0G2, r9, A6S.A00(A0G2.A00), true);
                String A013 = A012.A07.A01();
                C185829dD r1 = A012.A02;
                if (r1.A02) {
                    A013 = A4I.A00(r1.A01, A012, A013);
                }
                String A022 = A0G2.A02(r9);
                int length = A013.length();
                int length2 = A022.length();
                if (length < length2 || !A013.substring(0, length2).equals(A022)) {
                    c = 2;
                }
                TextView textView2 = this.A0H;
                if (c == 2) {
                    textView2.setText(str);
                    textView = this.A0I;
                } else {
                    textView2.setText(this.A0Z.BPp(this.A0W));
                    textView = this.A0I;
                }
            } else if (i == 1) {
                this.A0H.setText(r2.A02);
                textView = this.A0I;
                str = AnonymousClass8BS.A0j(this.A0Z);
            } else {
                textView = this.A0I;
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append(" ");
                str = AnonymousClass000.A0y(AnonymousClass8BS.A0j(r4), A102);
            }
            textView.setText(str);
        }
        this.A0H.setText(str);
        textView = this.A0I;
        getContext();
        str = this.A0Z.BPp(this.A0W);
        textView.setText(str);
    }

    public void setBankLogo(Bitmap bitmap) {
        if (bitmap != null) {
            this.A1O.setImageBitmap(bitmap);
        } else {
            this.A1O.setImageResource(2131231615);
        }
    }

    public void setPaymentContactContainerVisibility(int i) {
        this.A0A.setVisibility(i);
    }

    public void setPaymentMethodText(String str) {
        this.A1L.setText(A00(this, str, 2131894029));
    }

    public void setPaymentTabsVisibility(int i) {
        this.A0M.setVisibility(i);
    }

    public PaymentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0A();
        this.A1P = new C21448AkF(this, 9);
        A01();
    }

    public static SpannableStringBuilder A00(PaymentView paymentView, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String string = paymentView.A0o.BMU().getString(i);
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass8BS.A1B(string, str, A1b);
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(String.format("%s %s", A1b));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(AnonymousClass3Ma.A01(paymentView.getContext(), paymentView.A0o.BMU().getResources(), 2130970341, 2131101313));
        int length = string.length();
        int i2 = length + 1;
        A092.setSpan(foregroundColorSpan, 0, i2, 0);
        A092.setSpan(new ForegroundColorSpan(AnonymousClass3Ma.A01(paymentView.A0o.BMU(), paymentView.A0o.BMU().getResources(), 2130970343, 2131101314)), i2, length + str.length() + 1, 0);
        return A092;
    }

    private void A01() {
        int i;
        LayoutInflater A0D2 = AnonymousClass3MZ.A0D(this);
        if (A06(this)) {
            i = 2131626436;
        } else {
            i = 2131626433;
            if (C87544Vz.A00(this.A05)) {
                i = 2131626434;
            }
        }
        View A0A2 = AnonymousClass3MX.A0A(A0D2, this, i);
        this.A0H = AnonymousClass3MW.A0J(A0A2, 2131433517);
        this.A0I = AnonymousClass3MW.A0J(A0A2, 2131433518);
        this.A0E = (TextSwitcher) AnonymousClass1HF.A06(A0A2, 2131429428);
        ImageView A0G2 = AnonymousClass3MW.A0G(A0A2, 2131430705);
        this.A06 = A0G2;
        A0G2.setColorFilter(AnonymousClass3Ma.A01(getContext(), getResources(), 2130968808, 2131099885));
        this.A0F = AnonymousClass3MW.A0J(A0A2, 2131429387);
        this.A0Q = (ThumbnailButton) AnonymousClass1HF.A06(A0A2, 2131429433);
        this.A1O = (ThumbnailButton) AnonymousClass1HF.A06(A0A2, 2131428050);
        ImageView A0G3 = AnonymousClass3MW.A0G(A0A2, 2131430707);
        this.A07 = A0G3;
        A0G3.setColorFilter(AnonymousClass3Ma.A01(getContext(), getResources(), 2130968808, 2131099885));
        this.A1K = (TextSwitcher) AnonymousClass1HF.A06(A0A2, 2131433513);
        this.A0C = AnonymousClass3MX.A0K(A0A2, 2131433578);
        this.A1I = AnonymousClass3MX.A0K(A0A2, 2131433512);
        this.A1J = AnonymousClass3MX.A0K(A0A2, 2131433579);
        this.A1M = (ShimmerFrameLayout) AnonymousClass1HF.A06(this.A1I, 2131433585);
        this.A1N = (ShimmerFrameLayout) AnonymousClass1HF.A06(this.A1J, 2131433585);
        this.A09 = AnonymousClass3MX.A0K(A0A2, 2131427632);
        this.A05 = C108945cZ.A0P(A0A2, 2131431150);
        this.A0l = (PaymentAmountInputField) AnonymousClass1HF.A06(A0A2, 2131435180);
        this.A1L = AnonymousClass3MW.A0J(A0A2, 2131428045);
        this.A0G = AnonymousClass3MW.A0J(A0A2, 2131433696);
        this.A0P = (KeyboardPopupLayout) AnonymousClass1HF.A06(A0A2, 2131435191);
        AnonymousClass1HF.A06(A0A2, 2131435187).setOnClickListener(this);
        this.A0D = AnonymousClass3MX.A0K(A0A2, 2131435181);
        this.A0A = AnonymousClass3MX.A0K(A0A2, 2131433511);
        this.A0B = AnonymousClass3MX.A0K(A0A2, 2131435189);
        TabLayout tabLayout = (TabLayout) AnonymousClass1HF.A06(A0A2, 2131433679);
        this.A0M = tabLayout;
        tabLayout.setVisibility(8);
        if (A06(this)) {
            this.A0K = (CoordinatorLayout) AnonymousClass1HF.A06(this, 2131429666);
        }
        int A002 = AnonymousClass8BY.A00(this);
        AnonymousClass4aX.A0D(this.A07, A002);
        this.A0S = this.A0T.A06(getContext(), "payment-view");
        AnonymousClass4aX.A0D(AnonymousClass3MW.A0G(A0A2, 2131427633), A002);
        KeyboardPopupLayout keyboardPopupLayout = this.A0P;
        keyboardPopupLayout.getClass();
        keyboardPopupLayout.setKeyboardPopupBackgroundColor(AnonymousClass3MZ.A02(getContext(), getContext(), 2130969438, 2131100423));
        AutoTransition autoTransition = new AutoTransition();
        this.A02 = autoTransition;
        autoTransition.setDuration(100);
        this.A0J = (Group) AnonymousClass1HF.A06(A0A2, 2131430751);
        this.A08 = AnonymousClass3MW.A0G(A0A2, 2131430752);
        AnonymousClass1YQ r1 = (AnonymousClass1YQ) AnonymousClass1HF.A06(A0A2, 2131430733);
        this.A0L = r1;
        AnonymousClass3Ma.A1D(r1, this, 42);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.A04 = alphaAnimation;
        alphaAnimation.setDuration(500);
        this.A04.setAnimationListener(new C166568d7(this, 0));
        Interpolator A003 = C29111bd.A00(0.16f, 1.0f, 0.3f, 1.0f);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), 17432577);
        loadAnimation.setInterpolator(A003);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), 17432576);
        loadAnimation2.setInterpolator(A003);
        loadAnimation2.setDuration((long) getResources().getInteger(17694720));
        this.A0E.setOutAnimation(loadAnimation);
        this.A0E.setInAnimation(loadAnimation2);
    }

    public static void A04(C27581Wq r34, PaymentView paymentView) {
        int i;
        LinearLayout linearLayout;
        int ordinal = r34.ordinal();
        PaymentView paymentView2 = paymentView;
        if (ordinal == 0) {
            B9B b9b = paymentView2.A0k;
            if (b9b != null) {
                C188709hr CCo = b9b.CCo();
                paymentView2.A0o = CCo.A03;
                paymentView2.A0p = CCo.A08;
                BDw bDw = CCo.A02;
                paymentView2.A0n = bDw;
                paymentView2.A0g = CCo.A00;
                C188639hk r4 = CCo.A04;
                C184999br r3 = r4.A04;
                paymentView2.A0Z = r3.A01;
                C185009bs r2 = CCo.A06;
                paymentView2.A1E = r2.A01;
                paymentView2.A1A = CCo.A0C;
                paymentView2.A0t = CCo.A0A;
                paymentView2.A17 = CCo.A0B;
                String str = r4.A08;
                String str2 = str;
                paymentView2.A1B = str;
                paymentView2.A1D = CCo.A0D;
                paymentView2.A1G = CCo.A0E;
                paymentView2.A0m = CCo.A01;
                AnonymousClass5YC r1 = r4.A05;
                paymentView2.A0q = r1;
                paymentView2.A1H = CCo.A07.A00;
                if (Build.VERSION.SDK_INT != 26 || !C87544Vz.A00(paymentView2.A05)) {
                    paymentView2.A0o.BMU().setRequestedOrientation(1);
                }
                paymentView2.A0A.setOnClickListener(paymentView2);
                AnonymousClass1SB r15 = paymentView2.A0u;
                AnonymousClass10I r11 = paymentView2.A0z;
                AnonymousClass00H r10 = paymentView2.A14;
                paymentView2.A0y = new AnonymousClass722(paymentView2.A0V, (AnonymousClass2LK) paymentView2.A15.get(), r15, (AnonymousClass6pA) paymentView2.A16.get(), r11, r10);
                if (((AnonymousClass6pA) paymentView2.A16.get()).A01()) {
                    C24081Iu Bba = paymentView2.A0o.BMU().Bba();
                    AnonymousClass7AY r112 = new AnonymousClass7AY(paymentView2.A0V, paymentView2.A05, paymentView2.A0x);
                    C18070vi.A0d(Bba, 1);
                    C111185ii r113 = (C111185ii) new C24071It(r112, Bba, C24111Ix.A00).A00(C111185ii.class);
                    paymentView2.A0v = r113;
                    paymentView2.A0y.A01 = r113;
                    paymentView2.A0w = new C132676nN(paymentView2.A0O, r113);
                    ((C133686pK) paymentView2.A11.get()).A01((Integer) null);
                }
                C18030ve r27 = paymentView2.A05;
                AnonymousClass1L4 r33 = paymentView2.A06;
                AnonymousClass190 r342 = paymentView2.A0N;
                AnonymousClass18K r28 = paymentView2.A0d;
                AnonymousClass1KW r23 = paymentView2.A0b;
                C1193267r r22 = paymentView2.A0a;
                AnonymousClass11C r19 = paymentView2.A0U;
                C18000vb r21 = paymentView2.A0W;
                C140126zz r18 = paymentView2.A0f;
                C19830z4 r20 = paymentView2.A0V;
                C18010vc r17 = paymentView2.A0s;
                C134206qD r152 = paymentView2.A0e;
                C111185ii r12 = paymentView2.A0v;
                paymentView2.A0r = new C192889p9(paymentView2.A0o.BMU(), r342, paymentView2.A0P, r19, r20, r21, (C136686uD) paymentView2.A10.get(), (A59) paymentView2.A12.get(), r22, r23, (EmojiSearchProvider) paymentView2.A11.get(), r27, r28, r152, r18, r17, r12, r33);
                boolean z = paymentView2.A1G;
                boolean z2 = paymentView2.A1H;
                if (z) {
                    paymentView2.A07.setOnClickListener(paymentView2);
                    paymentView2.A0C.setOnClickListener(paymentView2);
                    paymentView2.A09.setOnClickListener(paymentView2);
                    i = 0;
                    if (!z2) {
                        linearLayout = paymentView2.A0C;
                    }
                    linearLayout = paymentView2.A09;
                } else {
                    i = 8;
                    paymentView2.A0C.setVisibility(8);
                    linearLayout = paymentView2.A09;
                }
                linearLayout.setVisibility(i);
                AQ4 aq4 = paymentView2.A0m;
                if (aq4 != null) {
                    paymentView2.A0G(aq4, 2131433604, 2131433603);
                    MentionableEntry mentionableEntry = aq4.A0B;
                    ViewGroup A0C2 = AnonymousClass3MW.A0C(paymentView2, 2131432483);
                    AnonymousClass1BI r102 = paymentView2.A0g;
                    if (C22971Dz.A0e(r102) && !paymentView2.A0X.A0R(r102)) {
                        mentionableEntry.A0M(A0C2, paymentView2.A0g, false, true, true, false);
                    }
                    String str3 = paymentView2.A1A;
                    if (str3 != null) {
                        mentionableEntry.setMentionableText(str3, paymentView2.A1E);
                    }
                    AFR.A00(mentionableEntry, paymentView2, 45);
                    C1418377d r103 = paymentView2.A0t;
                    if (r103 != null) {
                        aq4.A00(r103, paymentView2.A17);
                    }
                    aq4.A00 = new AFW(mentionableEntry, paymentView2, 1);
                    aq4.A0C.A00 = new AFR(paymentView2, 44);
                }
                View findViewById = paymentView2.findViewById(2131431151);
                if (findViewById != null) {
                    findViewById.setOnClickListener(paymentView2);
                }
                paymentView2.A01 = 6;
                paymentView2.A05.setVisibility(8);
                paymentView2.A0G(r4.A03, 2131435183, 2131435184);
                Context context = paymentView2.getContext();
                TabLayout tabLayout = paymentView2.A0M;
                int i2 = CCo.A09.A00;
                if (i2 != 0) {
                    tabLayout.A0A();
                    C136836uU A072 = tabLayout.A07();
                    A072.A01(2131894018);
                    tabLayout.A0F(A072);
                    C136836uU A073 = tabLayout.A07();
                    A073.A01(2131893981);
                    tabLayout.A0F(A073);
                    tabLayout.A0E(paymentView2);
                    C003401n supportActionBar = ((AnonymousClass01E) AnonymousClass1L9.A00(context)).getSupportActionBar();
                    if (i2 == 1) {
                        paymentView2.A0P.removeView(tabLayout);
                        tabLayout.setElevation(0.0f);
                        if (supportActionBar != null) {
                            supportActionBar.A0Y(false);
                            supportActionBar.A0G();
                            supportActionBar.A0W(true);
                            supportActionBar.A0Q(tabLayout, new AnonymousClass039(-1, -1));
                        }
                    } else if (supportActionBar != null) {
                        supportActionBar.A0J(0.0f);
                    }
                    tabLayout.setVisibility(0);
                    C136836uU A082 = tabLayout.A08(paymentView2.A00);
                    C17960vV.A07(A082);
                    A082.A00();
                }
                if (paymentView2.A0o.Bfn()) {
                    ArrayList A132 = AnonymousClass000.A13();
                    AQ4 aq42 = paymentView2.A0m;
                    if (aq42 != null) {
                        A132.add(aq42.A0B);
                    }
                    C192889p9 r104 = paymentView2.A0r;
                    E8G e8g = r2.A00;
                    PaymentAmountInputField paymentAmountInputField = paymentView2.A0l;
                    Activity activity = r104.A00;
                    AnonymousClass1L4 r153 = r104.A0H;
                    AnonymousClass190 r14 = r104.A01;
                    AnonymousClass11C r13 = r104.A03;
                    AnonymousClass1L4 r202 = r153;
                    Activity activity2 = activity;
                    KeyboardPopupLayout keyboardPopupLayout = r104.A02;
                    C108955ca.A1V(new C74853d1(activity2, r14, keyboardPopupLayout, r13, r104.A04, e8g, paymentAmountInputField, r202, A132), r104.A0I, 1);
                } else {
                    paymentView2.A0r.A00();
                    paymentView2.A0l.setFocusable(false);
                }
                paymentView2.A0l.setSelection(0);
                paymentView2.A0l.setLongClickable(false);
                PaymentAmountInputField paymentAmountInputField2 = paymentView2.A0l;
                paymentAmountInputField2.A0B = new C20860Aac(bDw, paymentView2);
                paymentAmountInputField2.setAutoScaleTextSize(r4.A0A);
                PaymentAmountInputField paymentAmountInputField3 = paymentView2.A0l;
                boolean z3 = r4.A0C;
                paymentAmountInputField3.A0E = z3;
                paymentAmountInputField3.setAllowDecimal(r4.A09);
                paymentView2.A0l.A0C = r1;
                paymentView2.A05(r4);
                paymentView2.A0l.A04 = paymentView2.A0D;
                paymentView2.setAmountInputData(r3);
                if (TextUtils.isEmpty(paymentView2.A19)) {
                    if (!TextUtils.isEmpty(paymentView2.A1C)) {
                        paymentView2.A19 = paymentView2.A1C;
                    } else {
                        String str4 = r4.A06;
                        if (TextUtils.isEmpty(str4)) {
                            str4 = r4.A07;
                            if (TextUtils.isEmpty(str4)) {
                                paymentView2.A19 = "0";
                            }
                        }
                        paymentView2.A19 = str4;
                    }
                }
                if (!TextUtils.isEmpty(paymentView2.A19)) {
                    String str5 = paymentView2.A19;
                    if (!"0".equals(str5)) {
                        if (r4.A0B) {
                            if (z3) {
                                str5 = str5.replaceAll(PaymentAmountInputField.A08(paymentView2.A0W), "");
                            }
                            AnonymousClass1KN A0H2 = AnonymousClass8BT.A0H(paymentView2.A0Z, str5);
                            if (A0H2 != null) {
                                paymentView2.A19 = paymentView2.A0Z.BLa(paymentView2.A0W, A0H2);
                            }
                        }
                        String A122 = AnonymousClass3Ma.A12(paymentView2.A0l);
                        String str6 = paymentView2.A19;
                        if (!A122.equals(str6)) {
                            paymentView2.A0l.setText(str6);
                        }
                    }
                }
                if (!paymentView2.A0o.Bfn()) {
                    paymentView2.A0r.A00();
                    paymentView2.A0l.setOnClickListener(new C89984dL(9, paymentView2, TextUtils.isEmpty(str2)));
                    paymentView2.A0l.setHintTextColor(AnonymousClass3MZ.A02(paymentView2.getContext(), paymentView2.getContext(), 2130970831, 2131102246));
                }
                paymentView2.A0l.setHint(paymentView2.A19);
                if (r4.A07 != null || r4.A06 == null || !paymentView2.A0o.BgS()) {
                    View view = paymentView2.A03;
                    if (view == null || view.getId() == -1 || paymentView2.findViewById(paymentView2.A03.getId()) == null) {
                        paymentView2.A0l.getViewTreeObserver().addOnGlobalLayoutListener(new C20296AFe(paymentView2, 5));
                    } else {
                        paymentView2.A0r.A00();
                        paymentView2.findViewById(paymentView2.A03.getId()).requestFocus();
                        View view2 = paymentView2.A03;
                        if (view2 instanceof WaEditText) {
                            ((WaEditText) view2).A0I(true);
                        } else if (view2.onCheckIsTextEditor()) {
                            InputMethodManager A0N2 = paymentView2.A0U.A0N();
                            C17960vV.A07(A0N2);
                            A0N2.showSoftInput(paymentView2.A03, 0);
                        }
                    }
                } else {
                    paymentView2.A0o.BMU().getWindow().setSoftInputMode(3);
                }
                if (!paymentView2.A0l.hasOnClickListeners()) {
                    AFR.A00(paymentView2.A0l, paymentView2, 43);
                }
                paymentView2.setInitialTabConfiguration(CCo);
                paymentView2.A0E();
                if (!paymentView2.A0o.BgS()) {
                    C186969f3 r16 = CCo.A05;
                    if (r16.A03) {
                        paymentView2.A0J.setVisibility(0);
                        C192889p9 r132 = paymentView2.A0r;
                        AnonymousClass72F r172 = r16.A02;
                        ImageView imageView = paymentView2.A08;
                        AnonymousClass1YQ r122 = paymentView2.A0L;
                        PaymentAmountInputField paymentAmountInputField4 = paymentView2.A0l;
                        TextView textView = paymentView2.A0H;
                        TextView textView2 = paymentView2.A0I;
                        TextView A0E2 = C17880vN.A0E(paymentView2, 2131433696);
                        AQ4 aq43 = paymentView2.A0m;
                        AEX aex = r16.A00;
                        Activity activity3 = r132.A00;
                        AnonymousClass1L4 r6 = r132.A0H;
                        AnonymousClass190 r5 = r132.A01;
                        AnonymousClass11C r32 = r132.A03;
                        C19830z4 r24 = r132.A04;
                        KeyboardPopupLayout keyboardPopupLayout2 = r132.A02;
                        AnonymousClass11C r242 = r32;
                        C19830z4 r25 = r24;
                        AnonymousClass1YQ r212 = r122;
                        AnonymousClass190 r222 = r5;
                        TextView textView3 = textView;
                        TextView textView4 = textView2;
                        Activity activity4 = activity3;
                        ImageView imageView2 = imageView;
                        C114665ra r154 = new C114665ra(activity4, imageView2, textView3, textView4, A0E2, r212, r222, keyboardPopupLayout2, r242, r25, r16.A01, r172, paymentAmountInputField4, aq43, r4, r6);
                        if (aex != null) {
                            r154.C8Z(aex);
                        }
                        C108955ca.A1V(r154, r132.A0I, 2);
                    }
                }
            }
        } else if (ordinal == 3) {
            AQ4 aq44 = paymentView2.A0m;
            if (aq44 != null && aq44.A0B.hasFocus()) {
                paymentView2.A0r.A00();
            }
        } else if (ordinal == 2) {
            C192889p9 r110 = paymentView2.A0r;
            C27007DPd A002 = NumberEntryKeyboard.A00(paymentView2.A0W);
            HashMap hashMap = r110.A0I;
            Integer A0h2 = C17880vN.A0h();
            if (hashMap.containsKey(A0h2)) {
                AnonymousClass3RR r111 = (AnonymousClass3RR) hashMap.get(A0h2);
                if (r111 instanceof C74853d1) {
                    ((C74853d1) r111).A01.setCustomKey(A002);
                }
            }
            if (paymentView2.A0l != null && !paymentView2.A0W.A0N().equals(paymentView2.A0l.A09.A0N())) {
                PaymentAmountInputField paymentAmountInputField5 = paymentView2.A0l;
                paymentAmountInputField5.A09 = paymentView2.A0W;
                paymentAmountInputField5.setText((CharSequence) null);
            }
        } else if (ordinal == 5) {
            HashMap hashMap2 = paymentView2.A0r.A0I;
            Iterator A0i2 = C17890vO.A0i(hashMap2);
            while (A0i2.hasNext()) {
                PopupWindow popupWindow = (PopupWindow) hashMap2.get(AnonymousClass000.A16(A0i2).getKey());
                if (popupWindow != null && popupWindow.isShowing()) {
                    popupWindow.dismiss();
                }
                A0i2.remove();
            }
            AnonymousClass722 r0 = paymentView2.A0y;
            r0.A0B.unregisterObserver(r0.A09);
            if (!paymentView2.A0o.BgS() && ((AnonymousClass91U) paymentView2.A0p.A00).A0Y != null) {
                if (C18020vd.A05(C18040vf.A02, paymentView2.A05, 811)) {
                    ((AnonymousClass91U) paymentView2.A0p.A00).A0Y.A00();
                }
            }
            if (A06(paymentView2)) {
                AnonymousClass96c.A07(paymentView2).A0G();
            }
        }
    }

    public void onClick(View view) {
        if (view.getId() == 2131430707 || view.getId() == 2131433578) {
            this.A0n.C0F();
        } else if (view.getId() == 2131433511) {
            if (this.A00 == 1 || this.A0C.getVisibility() == 0 || !this.A1G) {
                this.A0n.C0E();
                return;
            }
            TransitionManager.beginDelayedTransition(AnonymousClass3MW.A0D(this, 2131435189), this.A02);
            A0F();
        } else if (view.getId() == 2131435180 || view.getId() == 2131435192) {
            this.A0r.A00();
        } else if (view.getId() == 2131435187) {
            this.A0l.callOnClick();
        } else if (view.getId() == 2131427632) {
            this.A0n.Bl4();
        } else if (view.getId() == 2131431151) {
            this.A0n.BvH();
            View findViewById = findViewById(2131431152);
            this.A0h.A03().getBoolean("payment_incentive_tooltip_viewed", false);
            findViewById.setVisibility(8);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0S.A02();
    }

    public void setPaymentAmount(String str) {
        this.A19 = str;
    }

    public PaymentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A0A();
        this.A1P = new C21448AkF(this, 9);
        A01();
    }

    public PaymentView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A0A();
    }

    public PaymentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0A();
        this.A1P = new C21448AkF(this, 9);
        A01();
    }

    public PaymentView(Context context) {
        super(context);
        A0A();
        this.A1P = new C21448AkF(this, 9);
        A01();
    }
}
