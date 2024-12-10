package com.whatsapp.textstatus;

import X.A8I;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass190;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1KW;
import X.AnonymousClass1L4;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass48A;
import X.AnonymousClass4MZ;
import X.AnonymousClass4UI;
import X.AnonymousClass78P;
import X.AnonymousClass7GE;
import X.AnonymousClass7RD;
import X.AnonymousClass7RI;
import X.AnonymousClass7RO;
import X.AnonymousClass7RS;
import X.C000200d;
import X.C107845ai;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C109005cf;
import X.C112015kn;
import X.C1193267r;
import X.C124486Yn;
import X.C126626d2;
import X.C126636d3;
import X.C135726sf;
import X.C136846uV;
import X.C1418877i;
import X.C1423379b;
import X.C142987Bo;
import X.C17880vN;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C19830z4;
import X.C23321Fo;
import X.C28931bI;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C74873d3;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class AddTextStatusActivity extends AnonymousClass1FY implements C23321Fo {
    public int A00;
    public WaEditText A01;
    public WaImageButton A02;
    public WaTextView A03;
    public C18000vb A04;
    public C74873d3 A05;
    public C1193267r A06;
    public C18010vc A07;
    public C112015kn A08;
    public WDSButton A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public String A0D;
    public boolean A0E;
    public String[] A0F;
    public WaTextView A0G;
    public boolean A0H;
    public final C107845ai A0I;
    public final C126626d2 A0J;
    public final C126636d3 A0K;
    public final List A0L;
    public final TextWatcher A0M;

    public void C5k(int i, int i2) {
        String str;
        if (i == 1) {
            WaTextView waTextView = this.A03;
            if (waTextView == null) {
                str = "timerValueView";
            } else {
                String[] strArr = this.A0F;
                if (strArr == null) {
                    str = "durationOptions";
                } else {
                    waTextView.setText(strArr[i2]);
                    this.A00 = i2;
                    return;
                }
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public static final void A03(Drawable drawable, AddTextStatusActivity addTextStatusActivity) {
        addTextStatusActivity.A05.A0J(new AnonymousClass7RD(addTextStatusActivity, drawable, 7));
    }

    public static final void A0Q(AddTextStatusActivity addTextStatusActivity) {
        WaTextView waTextView = addTextStatusActivity.A0G;
        if (waTextView != null) {
            AnonymousClass3MW.A1S(waTextView);
        }
        C72453Mb.A1B(addTextStatusActivity.A0G);
    }

    public void A2y() {
        if (!this.A0H) {
            this.A0H = true;
            AnonymousClass10E A0A2 = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0c(A0A2, r1, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A0A = C108965cb.A0i(r1);
            this.A0B = C108965cb.A0j(r1);
            this.A0C = C000200d.A00(A0A2.AaL);
            this.A06 = C108985cd.A0T(A0A2);
            this.A07 = AnonymousClass3Ma.A0r(A0A2);
            this.A04 = AnonymousClass10E.A6Q(A0A2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624013);
        this.A01 = (WaEditText) findViewById(2131427643);
        setTitle(2131896303);
        Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131430313);
        toolbar.setTitle(2131896303);
        setSupportActionBar(toolbar);
        C72473Md.A18(this);
        WaEditText waEditText = this.A01;
        String str = "textEntry";
        if (waEditText != null) {
            C18030ve r6 = this.A0E;
            AnonymousClass1KW r5 = this.A0D;
            AnonymousClass11C r4 = this.A08;
            C18000vb r3 = this.A00;
            C18010vc r2 = this.A07;
            if (r2 != null) {
                WaEditText waEditText2 = waEditText;
                waEditText.addTextChangedListener(new AnonymousClass48A(waEditText2, AnonymousClass3MX.A0L(this, 2131429681), r4, r3, this.A0C, r5, r6, r2, 60, 50, false, false, false));
                View findViewById = findViewById(2131435920);
                Object obj = new Object();
                findViewById.setVisibility(8);
                this.A05.CGN(new AnonymousClass7RO(this, obj, findViewById, 15));
                Resources resources = getResources();
                Object[] objArr = new Object[1];
                C17880vN.A1T(objArr, 3, 0);
                Resources resources2 = getResources();
                Object[] objArr2 = new Object[1];
                C17880vN.A1T(objArr2, 1, 0);
                this.A0F = new String[]{getResources().getQuantityString(2131755099, 24, new Object[]{24}), resources.getQuantityString(2131755098, 3, objArr), resources2.getQuantityString(2131755100, 1, objArr2), C72473Md.A0k(getResources(), 2, 2131755100)};
                findViewById(2131436200).setOnClickListener(new AnonymousClass78P((Object) this, 45));
                WaTextView waTextView = (WaTextView) findViewById(2131436204);
                this.A03 = waTextView;
                if (waTextView != null) {
                    String[] strArr = this.A0F;
                    if (strArr != null) {
                        waTextView.setText(strArr[0]);
                        this.A02 = (WaImageButton) findViewById(2131427642);
                        C18030ve r15 = this.A0E;
                        AnonymousClass1L4 r14 = this.A09;
                        AnonymousClass190 r13 = this.A03;
                        AnonymousClass1KW r12 = this.A0D;
                        C1193267r r11 = this.A06;
                        if (r11 != null) {
                            AnonymousClass11C r10 = this.A08;
                            C18000vb r7 = this.A00;
                            AnonymousClass00H r0 = this.A0A;
                            if (r0 != null) {
                                EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) r0.get();
                                C19830z4 r52 = this.A0A;
                                C18010vc r42 = this.A07;
                                if (r42 != null) {
                                    View view = this.A00;
                                    C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.KeyboardPopupLayout");
                                    KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) view;
                                    WaImageButton waImageButton = this.A02;
                                    if (waImageButton == null) {
                                        str = "emojiButton";
                                    } else {
                                        WaEditText waEditText3 = this.A01;
                                        if (waEditText3 != null) {
                                            Integer A0k = C17880vN.A0k();
                                            AnonymousClass00H r02 = this.A0B;
                                            if (r02 != null) {
                                                WaImageButton waImageButton2 = waImageButton;
                                                C74873d3 r17 = new C74873d3(this, waImageButton2, r13, keyboardPopupLayout, waEditText3, r10, r52, r7, C108945cZ.A0e(r02), r11, r12, emojiSearchProvider, r15, r42, r14, 24, A0k);
                                                this.A05 = r17;
                                                r17.A08 = new AnonymousClass4MZ(true, false);
                                                EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) findViewById(2131430335);
                                                C74873d3 r03 = this.A05;
                                                if (r03 != null) {
                                                    AnonymousClass4UI r32 = new AnonymousClass4UI(this, r03, emojiSearchContainer);
                                                    r32.A00 = new AnonymousClass7GE(r32, this, 2);
                                                    C74873d3 r22 = this.A05;
                                                    if (r22 != null) {
                                                        r22.A0J(this.A0I);
                                                        r22.A0E = new AnonymousClass7RD(r32, this, 6);
                                                        AnonymousClass78P.A00(findViewById(2131430124), this, 47);
                                                        AnonymousClass00H r04 = this.A0C;
                                                        if (r04 != null) {
                                                            C135726sf A002 = ((C136846uV) r04.get()).A00();
                                                            if (A002 != null) {
                                                                String str2 = A002.A03;
                                                                if (str2 != null) {
                                                                    WaEditText waEditText4 = this.A01;
                                                                    if (waEditText4 != null) {
                                                                        waEditText4.setText(str2);
                                                                        WaEditText waEditText5 = this.A01;
                                                                        if (waEditText5 != null) {
                                                                            waEditText5.setSelection(str2.length());
                                                                        }
                                                                    }
                                                                }
                                                                String str3 = A002.A02;
                                                                if (str3 != null) {
                                                                    this.A05.CGN(new AnonymousClass7RS(21, str3, this));
                                                                }
                                                                long j = A002.A00;
                                                                if (j != -1) {
                                                                    long millis = A002.A01 + TimeUnit.SECONDS.toMillis(j);
                                                                    C28931bI A0x = AnonymousClass3Ma.A0x(this, 2131430714);
                                                                    TextView textView = (TextView) AnonymousClass3MY.A0I(A0x, 0);
                                                                    Object[] objArr3 = new Object[2];
                                                                    C18000vb r132 = this.A04;
                                                                    if (r132 != null) {
                                                                        String A082 = r132.A08(170);
                                                                        C18070vi.A0X(A082);
                                                                        objArr3[0] = C72483Me.A0Y(A082, r132.A0N(), millis);
                                                                        C18000vb r23 = this.A04;
                                                                        if (r23 != null) {
                                                                            objArr3[1] = A8I.A00(r23, millis);
                                                                            AnonymousClass3MY.A0y(this, textView, objArr3, 2131890202);
                                                                            this.A0G = (WaTextView) A0x.A02();
                                                                            WaTextView waTextView2 = this.A03;
                                                                            if (waTextView2 != null) {
                                                                                String[] strArr2 = this.A0F;
                                                                                if (strArr2 != null) {
                                                                                    long[] jArr = C124486Yn.A00;
                                                                                    int i = 0;
                                                                                    while (true) {
                                                                                        if (j != jArr[i]) {
                                                                                            i++;
                                                                                            if (i >= 4) {
                                                                                                i = -1;
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    waTextView2.setText(strArr2[i]);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    str = "whatsappLocale";
                                                                }
                                                            }
                                                            WaEditText waEditText6 = this.A01;
                                                            if (waEditText6 != null) {
                                                                waEditText6.addTextChangedListener(this.A0M);
                                                                WDSButton wDSButton = (WDSButton) findViewById(2131427641);
                                                                this.A09 = wDSButton;
                                                                if (wDSButton != null) {
                                                                    AnonymousClass78P.A00(wDSButton, this, 46);
                                                                    WDSButton wDSButton2 = this.A09;
                                                                    if (wDSButton2 != null) {
                                                                        wDSButton2.setEnabled(AnonymousClass000.A1W(A002));
                                                                        return;
                                                                    }
                                                                }
                                                                C18070vi.A11("clearButton");
                                                                throw null;
                                                            }
                                                        } else {
                                                            str = "myEvolvedAbout";
                                                        }
                                                    }
                                                }
                                                C18070vi.A11("emojiPopup");
                                                throw null;
                                            }
                                            str = "expressionUserJourneyLogger";
                                        }
                                    }
                                }
                            } else {
                                str = "emojiSearchProvider";
                            }
                        } else {
                            str = "recentEmojis";
                        }
                    }
                    str = "durationOptions";
                }
                str = "timerValueView";
            }
            str = "sharedPreferencesFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public AddTextStatusActivity(int i) {
        this.A0H = false;
        C1423379b.A00(this, 5);
    }

    public void onStop() {
        super.onStop();
        C74873d3 r0 = this.A05;
        if (r0 != null) {
            if (r0.isShowing()) {
                C74873d3 r02 = this.A05;
                if (r02 != null) {
                    r02.dismiss();
                }
            }
            WaEditText waEditText = this.A01;
            if (waEditText == null) {
                C18070vi.A11("textEntry");
                throw null;
            }
            waEditText.removeTextChangedListener(this.A0M);
            AnonymousClass7RI.A01(this.A05, this, 46);
            return;
        }
        C18070vi.A11("emojiPopup");
        throw null;
    }

    public AddTextStatusActivity() {
        this(0);
        this.A0L = AnonymousClass000.A13();
        this.A0I = new C142987Bo(this, 8);
        this.A0K = new C126636d3(this);
        this.A0J = new C126626d2(this);
        this.A0M = new C1418877i(this, 1);
    }
}
