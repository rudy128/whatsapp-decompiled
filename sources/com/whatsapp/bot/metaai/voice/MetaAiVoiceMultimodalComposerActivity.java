package com.whatsapp.bot.metaai.voice;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass782;
import X.AnonymousClass78V;
import X.AnonymousClass79Z;
import X.AnonymousClass7AT;
import X.AnonymousClass7yL;
import X.AnonymousClass7yM;
import X.AnonymousClass7yN;
import X.AnonymousClass7yO;
import X.AnonymousClass7yP;
import X.AnonymousClass7yQ;
import X.AnonymousClass7yR;
import X.AnonymousClass7yS;
import X.BIE;
import X.C000200d;
import X.C108945cZ;
import X.C108955ca;
import X.C109005cf;
import X.C122426Qf;
import X.C136786uO;
import X.C1418877i;
import X.C1423479c;
import X.C148747hw;
import X.C148757hx;
import X.C148767hy;
import X.C155257sS;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C23520Bik;
import X.C25181Nf;
import X.C25932Cow;
import X.C42141xh;
import X.C72043Kk;
import X.C72453Mb;
import X.C72463Mc;
import X.C99274sY;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.metaai.voice.ui.MetaAiSpeechIndicatorView;
import com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel;
import java.util.Map;

public final class MetaAiVoiceMultimodalComposerActivity extends AnonymousClass1FY {
    public LinearLayout A00;
    public LinearLayoutCompat A01;
    public C72043Kk A02;
    public C42141xh A03;
    public WaImageButton A04;
    public WaImageButton A05;
    public WaImageButton A06;
    public WaImageButton A07;
    public WaTextView A08;
    public C25181Nf A09;
    public MentionableEntry A0A;
    public MetaAiSpeechIndicatorView A0B;
    public C136786uO A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public boolean A0I;
    public final View.OnClickListener A0J;
    public final AnonymousClass02n A0K;
    public final Map A0L;
    public final C18100vl A0M;
    public final C18100vl A0N;

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820582, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public static final void A03(MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity) {
        InputMethodManager inputMethodManager = (InputMethodManager) metaAiVoiceMultimodalComposerActivity.getSystemService("input_method");
        if (inputMethodManager != null) {
            MentionableEntry mentionableEntry = metaAiVoiceMultimodalComposerActivity.A0A;
            if (mentionableEntry == null) {
                C18070vi.A11("chatBarEntry");
                throw null;
            } else {
                inputMethodManager.hideSoftInputFromWindow(mentionableEntry.getWindowToken(), 0);
            }
        }
    }

    public static final void A0Q(MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity) {
        Integer num;
        MentionableEntry mentionableEntry = metaAiVoiceMultimodalComposerActivity.A0A;
        if (mentionableEntry == null) {
            C18070vi.A11("chatBarEntry");
            throw null;
        }
        Editable text = mentionableEntry.getText();
        if (text == null || text.length() == 0) {
            num = AnonymousClass00R.A01;
        } else {
            num = AnonymousClass00R.A00;
        }
        A0d(metaAiVoiceMultimodalComposerActivity, num);
    }

    public static final void A0V(MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity, int i) {
        C23520Bik A012 = C23520Bik.A01(metaAiVoiceMultimodalComposerActivity.A00, i, 0);
        BIE bie = A012.A0J;
        ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(bie);
        int dimensionPixelSize = metaAiVoiceMultimodalComposerActivity.getResources().getDimensionPixelSize(2131168774);
        A0P.setMargins(dimensionPixelSize, A0P.topMargin, dimensionPixelSize, dimensionPixelSize);
        bie.setLayoutParams(A0P);
        A012.A08();
    }

    public void A2y() {
        if (!this.A0I) {
            this.A0I = true;
            AnonymousClass1K1 A0K2 = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K2, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0d(A0A2, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A09 = AnonymousClass3MZ.A0m(A0A2);
            this.A0D = C000200d.A00(A0K2.A4o);
            this.A0E = C000200d.A00(A0K2.A4p);
            this.A0F = C000200d.A00(A0K2.A4q);
            this.A0G = C000200d.A00(A0K2.A4r);
            this.A02 = AnonymousClass3MZ.A0T(r1);
            this.A0H = AnonymousClass3MW.A0s(A0A2);
        }
    }

    public MetaAiVoiceMultimodalComposerActivity(int i) {
        this.A0I = false;
        AnonymousClass79Z.A00(this, 25);
    }

    public static final void A0c(MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity, C122426Qf r8) {
        MentionableEntry mentionableEntry;
        int i;
        int ordinal = r8.ordinal();
        if (ordinal == 0) {
            WaImageButton waImageButton = metaAiVoiceMultimodalComposerActivity.A06;
            if (waImageButton == null) {
                C18070vi.A11("multimodalButton");
                throw null;
            }
            waImageButton.setVisibility(0);
            LinearLayout linearLayout = metaAiVoiceMultimodalComposerActivity.A00;
            if (linearLayout == null) {
                C18070vi.A11("inputLayout");
                throw null;
            }
            linearLayout.setBackgroundResource(2131231611);
            i = 2131102246;
            mentionableEntry = metaAiVoiceMultimodalComposerActivity.A0A;
            if (mentionableEntry == null) {
                C18070vi.A11("chatBarEntry");
                throw null;
            }
        } else if (ordinal == 1) {
            WaImageButton waImageButton2 = metaAiVoiceMultimodalComposerActivity.A06;
            if (waImageButton2 == null) {
                C18070vi.A11("multimodalButton");
                throw null;
            }
            waImageButton2.setVisibility(8);
            LinearLayout linearLayout2 = metaAiVoiceMultimodalComposerActivity.A00;
            if (linearLayout2 == null) {
                C18070vi.A11("inputLayout");
                throw null;
            }
            linearLayout2.setBackground((Drawable) null);
            i = 2131103088;
            mentionableEntry = metaAiVoiceMultimodalComposerActivity.A0A;
            if (mentionableEntry == null) {
                C18070vi.A11("chatBarEntry");
                throw null;
            }
        } else {
            return;
        }
        mentionableEntry.setTextColor(C19740yt.A03(metaAiVoiceMultimodalComposerActivity, i));
    }

    public static final void A0d(MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity, Integer num) {
        MentionableEntry mentionableEntry;
        int i;
        int intValue = num.intValue();
        if (intValue != 0) {
            WaImageButton waImageButton = metaAiVoiceMultimodalComposerActivity.A07;
            if (intValue != 1) {
                if (waImageButton != null) {
                    waImageButton.setVisibility(8);
                    WaImageButton waImageButton2 = metaAiVoiceMultimodalComposerActivity.A04;
                    if (waImageButton2 != null) {
                        waImageButton2.setVisibility(8);
                        WaImageButton waImageButton3 = metaAiVoiceMultimodalComposerActivity.A05;
                        if (waImageButton3 != null) {
                            waImageButton3.setVisibility(0);
                            mentionableEntry = metaAiVoiceMultimodalComposerActivity.A0A;
                            if (mentionableEntry != null) {
                                i = 2131892221;
                            }
                            C18070vi.A11("chatBarEntry");
                            throw null;
                        }
                        C18070vi.A11("listeningWaveformAnimationBtn");
                        throw null;
                    }
                }
                C18070vi.A11("sendBtn");
                throw null;
            }
            if (waImageButton != null) {
                waImageButton.setVisibility(8);
                WaImageButton waImageButton4 = metaAiVoiceMultimodalComposerActivity.A04;
                if (waImageButton4 != null) {
                    waImageButton4.setVisibility(0);
                    WaImageButton waImageButton5 = metaAiVoiceMultimodalComposerActivity.A05;
                    if (waImageButton5 != null) {
                        waImageButton5.setVisibility(8);
                        mentionableEntry = metaAiVoiceMultimodalComposerActivity.A0A;
                        if (mentionableEntry != null) {
                            i = 2131892220;
                        }
                        C18070vi.A11("chatBarEntry");
                        throw null;
                    }
                    C18070vi.A11("listeningWaveformAnimationBtn");
                    throw null;
                }
            }
            C18070vi.A11("sendBtn");
            throw null;
            mentionableEntry.setHint(metaAiVoiceMultimodalComposerActivity.getString(i));
            return;
        }
        WaImageButton waImageButton6 = metaAiVoiceMultimodalComposerActivity.A07;
        if (waImageButton6 != null) {
            waImageButton6.setVisibility(0);
            WaImageButton waImageButton7 = metaAiVoiceMultimodalComposerActivity.A04;
            if (waImageButton7 != null) {
                waImageButton7.setVisibility(8);
                WaImageButton waImageButton8 = metaAiVoiceMultimodalComposerActivity.A05;
                if (waImageButton8 != null) {
                    waImageButton8.setVisibility(8);
                    return;
                }
                C18070vi.A11("listeningWaveformAnimationBtn");
                throw null;
            }
        }
        C18070vi.A11("sendBtn");
        throw null;
        C18070vi.A11("enableVoiceBtn");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            C108945cZ.A0m(this.A0N).A0T();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131624074);
        Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131432842);
        View A0C2 = AnonymousClass3MY.A0C(this, 2131432844);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MY.A0C(this, 2131432843);
        A0C2.setOnClickListener(this.A0J);
        C72043Kk r1 = this.A02;
        if (r1 != null) {
            this.A03 = r1.BGE(textEmojiLabel.getContext(), textEmojiLabel);
            AnonymousClass1BI A0m = AnonymousClass3MX.A0m(this.A0M);
            if (A0m != null) {
                C25181Nf r0 = this.A09;
                if (r0 != null) {
                    AnonymousClass1E7 A012 = r0.A01(A0m);
                    C42141xh r2 = this.A03;
                    str = "titleViewController";
                    if (r2 != null) {
                        r2.A08(A012, -1);
                        C42141xh r22 = this.A03;
                        if (r22 != null) {
                            int i = 0;
                            if (A012.A0O()) {
                                i = 3;
                            }
                            r22.A03(i);
                        }
                    }
                } else {
                    str = "conversationContactManager";
                }
            }
            toolbar.setNavigationOnClickListener(new AnonymousClass782(this, 43));
            toolbar.setTitle((CharSequence) "");
            toolbar.A0L();
            setSupportActionBar(toolbar);
            this.A0B = (MetaAiSpeechIndicatorView) AnonymousClass3MY.A0C(this, 2131431030);
            this.A08 = (WaTextView) AnonymousClass3MY.A0C(this, 2131435651);
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) AnonymousClass3MY.A0C(this, 2131429513);
            this.A01 = linearLayoutCompat;
            if (linearLayoutCompat == null) {
                str = "contentContainer";
            } else {
                linearLayoutCompat.setGravity(17);
                this.A04 = (WaImageButton) AnonymousClass3MY.A0C(this, 2131437023);
                this.A07 = (WaImageButton) AnonymousClass3MY.A0C(this, 2131435148);
                this.A05 = (WaImageButton) AnonymousClass3MY.A0C(this, 2131437024);
                this.A0A = (MentionableEntry) AnonymousClass3MY.A0C(this, 2131429025);
                this.A06 = (WaImageButton) AnonymousClass3MY.A0C(this, 2131432840);
                this.A00 = (LinearLayout) AnonymousClass3MY.A0C(this, 2131431653);
                WaImageButton waImageButton = this.A04;
                if (waImageButton == null) {
                    str = "enableVoiceBtn";
                } else {
                    AnonymousClass3MZ.A1H(waImageButton, this, 39);
                    WaImageButton waImageButton2 = this.A07;
                    if (waImageButton2 == null) {
                        str = "sendBtn";
                    } else {
                        AnonymousClass3MZ.A1H(waImageButton2, this, 40);
                        WaImageButton waImageButton3 = this.A05;
                        if (waImageButton3 == null) {
                            str = "listeningWaveformAnimationBtn";
                        } else {
                            AnonymousClass3MZ.A1H(waImageButton3, this, 41);
                            MentionableEntry mentionableEntry = this.A0A;
                            if (mentionableEntry != null) {
                                mentionableEntry.addTextChangedListener(new C1418877i(this, 0));
                                MentionableEntry mentionableEntry2 = this.A0A;
                                if (mentionableEntry2 != null) {
                                    AnonymousClass3MZ.A1H(mentionableEntry2, this, 42);
                                    MentionableEntry mentionableEntry3 = this.A0A;
                                    if (mentionableEntry3 != null) {
                                        mentionableEntry3.setOnFocusChangeListener(new AnonymousClass78V(this, 0));
                                        C18100vl r3 = this.A0N;
                                        MetaAiVoiceViewModel A0m2 = C108945cZ.A0m(r3);
                                        A0m2.A08 = false;
                                        A0m2.A0L.A01();
                                        A0m2.A0U();
                                        AnonymousClass7AT.A01(this, ((MetaAiVoiceMultimodalComposerViewModel) AnonymousClass7AT.A00(this, ((MetaAiVoiceMultimodalComposerViewModel) AnonymousClass7AT.A00(this, ((MetaAiVoiceMultimodalComposerViewModel) AnonymousClass7AT.A00(this, ((MetaAiVoiceViewModel) AnonymousClass7AT.A00(this, ((MetaAiVoiceViewModel) AnonymousClass7AT.A00(this, ((MetaAiVoiceMultimodalComposerViewModel) AnonymousClass7AT.A00(this, ((MetaAiVoiceMultimodalComposerViewModel) AnonymousClass7AT.A00(this, C108945cZ.A0m(r3).A0M, r3, new AnonymousClass7yL(this), 13)).A06, r3, new AnonymousClass7yM(this), 13)).A05, r3, new AnonymousClass7yN(this), 13)).A0E, r3, new AnonymousClass7yO(this), 13)).A0Q, r3, new AnonymousClass7yP(this), 13)).A04, r3, new AnonymousClass7yQ(this), 13)).A03, r3, new AnonymousClass7yR(this), 13)).A02, new AnonymousClass7yS(this), 13);
                                        MentionableEntry mentionableEntry4 = this.A0A;
                                        if (mentionableEntry4 != null) {
                                            mentionableEntry4.requestFocus();
                                            Window window = getWindow();
                                            MentionableEntry mentionableEntry5 = this.A0A;
                                            if (mentionableEntry5 != null) {
                                                new C25932Cow(mentionableEntry5, window).A00.A01();
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                            C18070vi.A11("chatBarEntry");
                            throw null;
                        }
                    }
                }
            }
        } else {
            str = "textEmojiLabelViewControllerFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C108945cZ.A0m(this.A0N).A0V();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AnonymousClass1BI A0m;
        if (C72453Mb.A0B(menuItem) == 2131431467 && (A0m = AnonymousClass3MX.A0m(this.A0M)) != null) {
            AnonymousClass00H r0 = this.A0H;
            if (r0 != null) {
                C108955ca.A1S(r0);
                startActivity(AnonymousClass1LU.A0h(this, A0m, (Integer) null, (String) null, 20, 6));
                finish();
            } else {
                AnonymousClass3MW.A1F();
                throw null;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.02h] */
    public MetaAiVoiceMultimodalComposerActivity() {
        this(0);
        this.A0N = C99274sY.A00(new C148767hy(this), new C148757hx(this), new C155257sS(this), AnonymousClass3MW.A15(MetaAiVoiceMultimodalComposerViewModel.class));
        this.A0L = C17880vN.A13();
        this.A0M = AnonymousClass1DF.A01(new C148747hw(this));
        this.A0J = new AnonymousClass782(this, 44);
        this.A0K = CDw(new C1423479c(this, 1), new Object());
    }
}
