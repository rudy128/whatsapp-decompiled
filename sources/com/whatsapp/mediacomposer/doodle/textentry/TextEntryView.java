package com.whatsapp.mediacomposer.doodle.textentry;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass1KW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass6Ii;
import X.AnonymousClass6VK;
import X.AnonymousClass6pZ;
import X.AnonymousClass78E;
import X.AnonymousClass79Y;
import X.AnonymousClass7JG;
import X.AnonymousClass7JH;
import X.AnonymousClass7JI;
import X.AnonymousClass7JJ;
import X.AnonymousClass7JL;
import X.AnonymousClass8BD;
import X.C000200d;
import X.C108955ca;
import X.C108965cb;
import X.C108995ce;
import X.C111995kl;
import X.C127496eS;
import X.C130396jM;
import X.C152047nH;
import X.C152057nI;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C29261bv;
import X.C39151sZ;
import X.C70643By;
import X.C72453Mb;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.doodle.textentry.strokepicker.StrokeWidthTool;
import com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;

public final class TextEntryView extends RelativeLayout implements AnonymousClass009 {
    public ViewGroup A00;
    public WaTextView A01;
    public C18000vb A02;
    public AnonymousClass1KW A03;
    public C18030ve A04;
    public DoodleEditText A05;
    public AnonymousClass8BD A06;
    public C130396jM A07;
    public TextToolColorPicker A08;
    public StrokeWidthTool A09;
    public UniversalToolPickerView A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass031 A0C;
    public boolean A0D;
    public boolean A0E;
    public View A0F;
    public View A0G;
    public RecyclerView A0H;
    public WaImageView A0I;
    public WaImageView A0J;
    public WDSButton A0K;
    public final C18100vl A0L;
    public final C18100vl A0M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A04 = AnonymousClass10E.A8r(A0O);
            this.A03 = AnonymousClass3Ma.A0f(A0O);
            this.A0B = C000200d.A00(A0O.AAB);
            this.A02 = AnonymousClass10E.A6Q(A0O);
        }
        this.A0M = AnonymousClass1DF.A01(new C152057nI(this));
        this.A0L = AnonymousClass1DF.A01(new C152047nH(this));
    }

    private final void A00(float f) {
        int A002;
        int min = Math.min((int) f, (int) C72453Mb.A00(this.A0L));
        WaTextView waTextView = this.A01;
        if (waTextView != null) {
            C18100vl r4 = this.A0M;
            int A003 = (int) C72453Mb.A00(r4);
            if (((float) min) > C72453Mb.A00(r4)) {
                A002 = min;
            } else {
                A002 = ((int) C72453Mb.A00(r4)) + 1;
            }
            C29261bv.A09(waTextView, A003, A002, 1, 2);
            WaTextView waTextView2 = this.A01;
            if (waTextView2 != null) {
                waTextView2.setTextSize((float) Math.max(min, (int) C72453Mb.A00(r4)));
                return;
            }
        }
        C18070vi.A11("textHolder");
        throw null;
    }

    private final void A02(int i) {
        int i2;
        int i3;
        if (i != 1) {
            i2 = 2131231923;
            i3 = 2131896807;
            if (i != 2) {
                i2 = 2131231921;
                i3 = 2131896804;
            }
        } else {
            i2 = 2131231922;
            i3 = 2131896806;
        }
        WaImageView waImageView = this.A0I;
        if (waImageView != null) {
            AnonymousClass3NL.A01(getContext(), waImageView, getWhatsAppLocale(), i2);
            WaImageView waImageView2 = this.A0I;
            if (waImageView2 != null) {
                AnonymousClass3MY.A0w(getContext(), waImageView2, 2131896805);
                WaImageView waImageView3 = this.A0I;
                if (waImageView3 != null) {
                    AnonymousClass1HF.A0o(waImageView3, AnonymousClass3Ma.A11(this, i3));
                    return;
                }
            }
        }
        C18070vi.A11("alignmentButton");
        throw null;
    }

    private final void A03(int i) {
        int i2;
        int i3;
        if (i == 1) {
            i2 = 2131233086;
            i3 = 2131896812;
        } else {
            i2 = 2131233085;
            if (i != 2) {
                i3 = 2131896810;
                if (i != 3) {
                    i3 = 2131896811;
                }
            } else {
                i3 = 2131896808;
            }
        }
        WaImageView waImageView = this.A0J;
        if (waImageView != null) {
            AnonymousClass3NL.A01(getContext(), waImageView, getWhatsAppLocale(), i2);
            WaImageView waImageView2 = this.A0J;
            if (waImageView2 != null) {
                AnonymousClass3MY.A0w(getContext(), waImageView2, 2131896809);
                WaImageView waImageView3 = this.A0J;
                if (waImageView3 != null) {
                    AnonymousClass1HF.A0o(waImageView3, AnonymousClass3Ma.A11(this, i3));
                    return;
                }
            }
        }
        C18070vi.A11("backgroundPickerButton");
        throw null;
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setStatusConfig(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    private final float getMaxTextSizeInSp() {
        return C72453Mb.A00(this.A0L);
    }

    private final float getMinTextSizeInSp() {
        return C72453Mb.A00(this.A0M);
    }

    private final void setUpFontPicker(int i) {
        String str;
        C130396jM r0 = this.A07;
        if (r0 == null) {
            str = "textEntryInfo";
        } else {
            if ((r0.A05 & 2) != 0) {
                RecyclerView recyclerView = this.A0H;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                    ArrayList A13 = AnonymousClass000.A13();
                    int[] iArr = {0, 3, 2, 4, 5, 6, 7, 1};
                    int i2 = 0;
                    int i3 = 0;
                    do {
                        int i4 = iArr[i2];
                        A13.add(new C127496eS(i4, AnonymousClass000.A1T(i4, i)));
                        if (i4 == i) {
                            i3 = A13.size() - 1;
                        }
                        i2++;
                    } while (i2 < 8);
                    RecyclerView recyclerView2 = this.A0H;
                    if (recyclerView2 != null) {
                        AnonymousClass8BD r1 = this.A06;
                        if (r1 == null) {
                            str = "listener";
                        } else {
                            recyclerView2.setAdapter(new C111995kl(r1, A13));
                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
                            RecyclerView recyclerView3 = this.A0H;
                            if (recyclerView3 != null) {
                                recyclerView3.setLayoutManager(linearLayoutManager);
                                linearLayoutManager.A13(i3);
                                return;
                            }
                        }
                    }
                }
            } else {
                RecyclerView recyclerView4 = this.A0H;
                if (recyclerView4 != null) {
                    recyclerView4.setVisibility(8);
                    return;
                }
            }
            C18070vi.A11("textRecyclerView");
            throw null;
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, android.view.View$OnTouchListener] */
    public final void A05(AnonymousClass8BD r22, C130396jM r23, int i, boolean z) {
        String str;
        View inflate;
        C39151sZ r7;
        C130396jM r5 = r23;
        this.A07 = r5;
        this.A0E = z;
        DoodleEditText doodleEditText = (DoodleEditText) C18070vi.A05(this, 2131436044);
        doodleEditText.setupBackgroundSpan(r5.A04);
        AnonymousClass6pZ r6 = r5.A06;
        doodleEditText.setBackgroundStyle(r6.A02);
        doodleEditText.A0L(r6.A03);
        doodleEditText.setFontStyle(r5.A01);
        doodleEditText.A0K(r5.A03);
        int length = r5.A04.length();
        doodleEditText.setSelection(length, length);
        AnonymousClass8BD r4 = r22;
        doodleEditText.setOnEditorActionListener(new AnonymousClass79Y(r4, 3));
        doodleEditText.A00 = new AnonymousClass7JG(r4, this);
        doodleEditText.addTextChangedListener(new AnonymousClass6Ii(doodleEditText, r4, this));
        this.A05 = doodleEditText;
        WDSButton wDSButton = (WDSButton) C18070vi.A05(this, 2131430123);
        AnonymousClass3MZ.A1O(wDSButton, r4, this, 13);
        this.A0K = wDSButton;
        C18030ve A0R = C108955ca.A0R(getStatusConfig());
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, A0R, 7952)) {
            WDSButton wDSButton2 = this.A0K;
            if (wDSButton2 == null) {
                str = "doneButton";
                C18070vi.A11(str);
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = wDSButton2.getLayoutParams();
            if ((layoutParams instanceof C39151sZ) && (r7 = (C39151sZ) layoutParams) != null) {
                r7.A0n = -1;
                r7.A0I = 0;
                wDSButton2.setLayoutParams(r7);
            }
        }
        ? obj = new Object();
        AnonymousClass3MZ.A1O(AnonymousClass1HF.A06(this, 2131432239), r4, this, 14);
        AnonymousClass1HF.A06(this, 2131432239).setOnTouchListener(obj);
        this.A06 = r4;
        this.A00 = (ViewGroup) C18070vi.A05(this, 2131436076);
        this.A0H = (RecyclerView) C18070vi.A05(this, 2131436075);
        this.A08 = (TextToolColorPicker) C18070vi.A05(this, 2131436088);
        this.A01 = AnonymousClass3Ma.A0N(this, 2131436065);
        if (C18020vd.A05(r1, C108955ca.A0R(getStatusConfig()), 7952)) {
            float A002 = AnonymousClass6VK.A00(AnonymousClass3Ma.A09(this), r5.A00);
            A00(A002);
            DoodleEditText doodleEditText2 = this.A05;
            if (doodleEditText2 != null) {
                doodleEditText2.setTextSize(A002);
                ViewStub A0F2 = AnonymousClass3MW.A0F(this, 2131436080);
                if (!(A0F2 == null || (inflate = A0F2.inflate()) == null)) {
                    View A062 = AnonymousClass1HF.A06(inflate, 2131428453);
                    C130396jM r14 = r5;
                    AnonymousClass8BD r16 = r4;
                    A062.setOnClickListener(new AnonymousClass78E(this, r14, A062, r16, 17));
                    this.A0G = A062;
                    View A063 = AnonymousClass1HF.A06(inflate, 2131428452);
                    A063.setOnClickListener(new AnonymousClass78E(this, r14, A063, r16, 18));
                    this.A0F = A063;
                    StrokeWidthTool strokeWidthTool = (StrokeWidthTool) AnonymousClass1HF.A06(inflate, 2131436079);
                    float A003 = C72453Mb.A00(this.A0M);
                    float A004 = C72453Mb.A00(this.A0L);
                    float f = strokeWidthTool.A03;
                    float f2 = strokeWidthTool.A02;
                    strokeWidthTool.A02 = A003;
                    strokeWidthTool.A01 = A004;
                    strokeWidthTool.A03 = A003 + (((f - f2) / (strokeWidthTool.A01 - f2)) * (A004 - A003));
                    StrokeWidthTool.A00(strokeWidthTool);
                    strokeWidthTool.setStrokeWidth(A002);
                    strokeWidthTool.A0A = new AnonymousClass7JJ(r4, r5, this, strokeWidthTool);
                    this.A09 = strokeWidthTool;
                    A01(A002);
                }
                TextToolColorPicker textToolColorPicker = this.A08;
                if (textToolColorPicker == null) {
                    str = "textToolColorPicker";
                } else {
                    textToolColorPicker.setVisibility(8);
                    RecyclerView recyclerView = this.A0H;
                    if (recyclerView == null) {
                        str = "textRecyclerView";
                    } else {
                        recyclerView.setVisibility(8);
                        this.A0A = new UniversalToolPickerView(AnonymousClass3MY.A04(this), (AttributeSet) null);
                        if (getResources().getConfiguration().orientation == 1) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.setMarginStart(getResources().getDimensionPixelSize(2131168775));
                            UniversalToolPickerView universalToolPickerView = this.A0A;
                            if (universalToolPickerView != null) {
                                universalToolPickerView.setLayoutParams(marginLayoutParams);
                            }
                        }
                        ViewGroup viewGroup = this.A00;
                        if (viewGroup == null) {
                            C18070vi.A11("textRecyclerViewParent");
                            throw null;
                        }
                        viewGroup.addView(this.A0A);
                        UniversalToolPickerView universalToolPickerView2 = this.A0A;
                        if (universalToolPickerView2 != null) {
                            int i2 = r5.A01;
                            int i3 = r6.A03;
                            int i4 = i3;
                            int i5 = i2;
                            universalToolPickerView2.A05(new AnonymousClass7JL(r4, r5, this), i, 0, i5, i4, 0, this.A0E, false);
                        }
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
            C18070vi.A11("doodleEditText");
            throw null;
        }
        setUpFontPicker(r5.A01);
        C130396jM r0 = this.A07;
        if (r0 == null) {
            str = "textEntryInfo";
            C18070vi.A11(str);
            throw null;
        }
        int i6 = r0.A05 & 1;
        TextToolColorPicker textToolColorPicker2 = this.A08;
        if (i6 != 0) {
            if (textToolColorPicker2 != null) {
                textToolColorPicker2.setVisibility(0);
                TextToolColorPicker textToolColorPicker3 = this.A08;
                if (textToolColorPicker3 != null) {
                    textToolColorPicker3.A04 = new AnonymousClass7JI(this);
                }
            }
        } else if (textToolColorPicker2 != null) {
            textToolColorPicker2.setVisibility(8);
        }
        C18070vi.A11("textToolColorPicker");
        throw null;
        DoodleEditText doodleEditText3 = this.A05;
        if (doodleEditText3 != null) {
            doodleEditText3.postDelayed(new C70643By(r4, this, 7), 500);
            DoodleEditText doodleEditText4 = this.A05;
            if (doodleEditText4 != null) {
                doodleEditText4.A0I(false);
                setUpAlignmentButton(r4);
                setUpBackgroundPickerButton(r4);
                return;
            }
        }
        C18070vi.A11("doodleEditText");
        throw null;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0C;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final AnonymousClass00H getStatusConfig() {
        AnonymousClass00H r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("statusConfig");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setEntryTextSize(float f) {
        DoodleEditText doodleEditText = this.A05;
        if (doodleEditText == null) {
            C18070vi.A11("doodleEditText");
            throw null;
        } else {
            doodleEditText.setTextSize(f);
        }
    }

    private final void A01(float f) {
        Resources resources = getResources();
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, (int) f);
        String string = resources.getString(2131896817, A1a);
        C18070vi.A0X(string);
        StrokeWidthTool strokeWidthTool = this.A09;
        if (strokeWidthTool != null) {
            AnonymousClass1HF.A0o(strokeWidthTool, string);
        }
        View view = this.A0G;
        if (view != null) {
            AnonymousClass1HF.A0o(view, string);
        }
        View view2 = this.A0F;
        if (view2 != null) {
            AnonymousClass1HF.A0o(view2, string);
        }
        StrokeWidthTool strokeWidthTool2 = this.A09;
        if (strokeWidthTool2 != null) {
            AnonymousClass3MX.A1D(getResources(), strokeWidthTool2, 2131896816);
        }
        View view3 = this.A0G;
        if (view3 != null) {
            AnonymousClass3MX.A1D(getResources(), view3, 2131896815);
        }
        View view4 = this.A0F;
        if (view4 != null) {
            AnonymousClass3MX.A1D(getResources(), view4, 2131896814);
        }
    }

    public static final void A04(AnonymousClass8BD r4, TextEntryView textEntryView, float f) {
        textEntryView.A00(f);
        WaTextView waTextView = textEntryView.A01;
        if (waTextView != null) {
            CharSequence text = waTextView.getText();
            if (text == null || text.length() == 0) {
                DoodleEditText doodleEditText = textEntryView.A05;
                if (doodleEditText != null) {
                    doodleEditText.setTextSize(f);
                }
                C18070vi.A11("doodleEditText");
                throw null;
            }
            textEntryView.A01(f);
            WaTextView waTextView2 = textEntryView.A01;
            if (waTextView2 != null) {
                CharSequence text2 = waTextView2.getText();
                C18070vi.A0X(text2);
                DoodleEditText doodleEditText2 = textEntryView.A05;
                if (doodleEditText2 != null) {
                    int A032 = C108995ce.A03(doodleEditText2);
                    WaTextView waTextView3 = textEntryView.A01;
                    if (waTextView3 != null) {
                        C18070vi.A0X(waTextView3.getPaint());
                        r4.BLM(text2, A032);
                        return;
                    }
                }
                C18070vi.A11("doodleEditText");
                throw null;
            }
        }
        C18070vi.A11("textHolder");
        throw null;
    }

    private final void setUpAlignmentButton(AnonymousClass8BD r5) {
        WaImageView A0I2 = C108965cb.A0I(this, 2131427768);
        this.A0I = A0I2;
        C130396jM r0 = this.A07;
        if (r0 != null) {
            if ((r0.A05 & 4) != 0) {
                if (A0I2 != null) {
                    A0I2.setVisibility(0);
                    WaImageView waImageView = this.A0I;
                    if (waImageView != null) {
                        AnonymousClass3MZ.A1O(waImageView, this, r5, 11);
                    }
                }
                C18070vi.A11("alignmentButton");
                throw null;
            }
            if (A0I2 != null) {
                A0I2.setVisibility(8);
            }
            C18070vi.A11("alignmentButton");
            throw null;
            C130396jM r02 = this.A07;
            if (r02 != null) {
                A02(r02.A03);
                return;
            }
        }
        C18070vi.A11("textEntryInfo");
        throw null;
    }

    public static final void setUpAlignmentButton$lambda$15(TextEntryView textEntryView, AnonymousClass8BD r4, View view) {
        C18070vi.A0h(textEntryView, r4);
        AnonymousClass7JH r42 = (AnonymousClass7JH) r4;
        C130396jM r2 = r42.A04;
        int i = (r2.A03 + 1) % 3;
        r2.A03 = i;
        DoodleEditText doodleEditText = r42.A02.A05;
        if (doodleEditText == null) {
            C18070vi.A11("doodleEditText");
            throw null;
        }
        doodleEditText.A0K(i);
        r42.A03.A00 = i;
        textEntryView.A02(i);
    }

    private final void setUpBackgroundPickerButton(AnonymousClass8BD r6) {
        WaImageView A0I2 = C108965cb.A0I(this, 2131428958);
        this.A0J = A0I2;
        C130396jM r0 = this.A07;
        if (r0 != null) {
            if ((r0.A05 & 8) != 0) {
                if (A0I2 != null) {
                    A0I2.setVisibility(0);
                    WaImageView waImageView = this.A0J;
                    if (waImageView != null) {
                        AnonymousClass3MZ.A1O(waImageView, this, r6, 12);
                    }
                }
                C18070vi.A11("backgroundPickerButton");
                throw null;
            }
            if (A0I2 != null) {
                A0I2.setVisibility(8);
            }
            C18070vi.A11("backgroundPickerButton");
            throw null;
            C130396jM r02 = this.A07;
            if (r02 != null) {
                A03(r02.A06.A02);
                return;
            }
        }
        C18070vi.A11("textEntryInfo");
        throw null;
    }

    public static final void setUpBackgroundPickerButton$lambda$16(TextEntryView textEntryView, AnonymousClass8BD r4, View view) {
        C18070vi.A0h(textEntryView, r4);
        AnonymousClass7JH r42 = (AnonymousClass7JH) r4;
        AnonymousClass6pZ r2 = r42.A04.A06;
        int i = (r2.A02 + 1) % 4;
        r2.A02 = i;
        r2.A01(r2.A03, i);
        DoodleEditText doodleEditText = r42.A02.A05;
        if (doodleEditText == null) {
            C18070vi.A11("doodleEditText");
            throw null;
        }
        doodleEditText.setBackgroundStyle(i);
        r42.A03.A01 = i;
        textEntryView.A03(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextEntryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextEntryView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
