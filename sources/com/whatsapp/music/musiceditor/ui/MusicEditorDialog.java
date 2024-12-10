package com.whatsapp.music.musiceditor.ui;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass029;
import X.AnonymousClass02V;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1HF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass6EY;
import X.AnonymousClass73N;
import X.AnonymousClass7AH;
import X.AnonymousClass7K5;
import X.AnonymousClass7K6;
import X.AnonymousClass7R6;
import X.AnonymousClass7RM;
import X.AnonymousClass7SB;
import X.AnonymousClass8AE;
import X.C009805p;
import X.C010105w;
import X.C108945cZ;
import X.C108975cc;
import X.C111125iM;
import X.C119976Aw;
import X.C119986Ax;
import X.C119996Ay;
import X.C121626Kw;
import X.C123166Tj;
import X.C124066Wx;
import X.C128586gM;
import X.C139826zV;
import X.C1411974r;
import X.C1418277c;
import X.C152377no;
import X.C152387np;
import X.C156307u9;
import X.C1601887m;
import X.C1607589u;
import X.C1607689v;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C24141Ja;
import X.C37801q9;
import X.C41731wy;
import X.C72453Mb;
import X.C73193Ri;
import X.C90054dS;
import X.C99274sY;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.music.ui.MusicBrowseFragment;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;
import java.util.List;

public final class MusicEditorDialog extends Hilt_MusicEditorDialog implements C1607689v, AnonymousClass8AE, C1601887m {
    public int A00;
    public int A01;
    public FrameLayout A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public AnonymousClass7K5 A0A;
    public AnonymousClass7K6 A0B;
    public C1418277c A0C;
    public WDSButton A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public Long A0J;
    public boolean A0K = true;
    public boolean A0L;
    public boolean A0M;
    public final C128586gM A0N;
    public final C18100vl A0O;
    public volatile boolean A0P = true;

    public static final void A02(MusicEditorDialog musicEditorDialog, C111125iM r4) {
        musicEditorDialog.A0P = false;
        C119986Ax r0 = C119986Ax.A00;
        C41731wy r1 = r4.A09;
        r1.A0F(r0);
        r1.A0F(new C119976Aw(0));
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626128, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        Window window;
        String str;
        Long l;
        String str2;
        C18070vi.A0d(view, 0);
        Dialog dialog = this.A03;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            this.A0C = (C1418277c) C24141Ja.A00(A15(), C1418277c.class, "music_item");
            long j = A15().getLong("music_snippet_timer_duration");
            Long valueOf = Long.valueOf(j);
            if (j <= 0 || valueOf == null) {
                j = 15000;
            }
            this.A0J = Long.valueOf(j);
            this.A0D = AnonymousClass3MW.A0r(view, 2131432863);
            this.A03 = AnonymousClass3MW.A0H(view, 2131432862);
            this.A09 = C17880vN.A0E(view, 2131432872);
            this.A07 = C17880vN.A0E(view, 2131432861);
            this.A08 = C17880vN.A0E(view, 2131432869);
            this.A06 = C17880vN.A0E(view, 2131432857);
            ImageView A0H2 = AnonymousClass3MW.A0H(view, 2131432874);
            this.A05 = A0H2;
            if (A0H2 != null) {
                A0H2.setEnabled(false);
            }
            this.A04 = AnonymousClass3MW.A0H(view, 2131432853);
            this.A02 = (FrameLayout) view.findViewById(2131434193);
            window.setLayout(-1, -1);
            window.setFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            if (Build.VERSION.SDK_INT >= 28) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
            }
            Dialog dialog2 = this.A03;
            if (dialog2 != null) {
                AnonymousClass02V r3 = ((AnonymousClass029) dialog2).A01;
                C37801q9 A1G = A1G();
                AnonymousClass7SB A002 = AnonymousClass7SB.A00(this, 34);
                C18070vi.A0d(r3, 0);
                r3.A09(new C009805p(A002), A1G);
            }
            WDSButton wDSButton = this.A0D;
            if (wDSButton != null) {
                C90054dS.A00(wDSButton, this, 22);
            }
            ImageView imageView = this.A03;
            if (imageView != null) {
                C90054dS.A00(imageView, this, 23);
            }
            ImageView imageView2 = this.A05;
            if (imageView2 != null) {
                C90054dS.A00(imageView2, this, 24);
            }
            ImageView imageView3 = this.A04;
            if (imageView3 != null) {
                C90054dS.A00(imageView3, this, 25);
            }
            C128586gM r2 = this.A0N;
            this.A0A = new AnonymousClass7K5(view, r2);
            AnonymousClass00H r0 = this.A0I;
            if (r0 != null) {
                this.A0B = new AnonymousClass7K6(view, r2, AnonymousClass3MW.A1Z((C18000vb) r0.get()));
                C1418277c r8 = this.A0C;
                if (r8 != null) {
                    if (!r8.A0B && (str2 = r8.A04) != null) {
                        AnonymousClass00H r02 = this.A0E;
                        if (r02 != null) {
                            ((AnonymousClass6EY) r02.get()).A0C(str2, AnonymousClass7SB.A00(this, 35));
                        } else {
                            str = "artworkDownloader";
                        }
                    }
                    TextView textView = this.A09;
                    if (textView != null) {
                        textView.setText(r8.A06);
                    }
                    TextView textView2 = this.A06;
                    if (textView2 != null) {
                        textView2.setText(r8.A05);
                    }
                    TextView textView3 = this.A08;
                    if (textView3 != null) {
                        Resources A092 = AnonymousClass3MZ.A09(this);
                        Object[] objArr = new Object[1];
                        Long l2 = this.A0J;
                        if (l2 != null) {
                            l = Long.valueOf(C17880vN.A04(l2.longValue()));
                        } else {
                            l = null;
                        }
                        textView3.setText(AnonymousClass3MW.A0x(A092, l, objArr, 0, 2131892357));
                    }
                    ImageView imageView4 = this.A03;
                    if (imageView4 != null) {
                        Resources A093 = AnonymousClass3MZ.A09(this);
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = r8.A06;
                        imageView4.setContentDescription(AnonymousClass3MW.A0x(A093, r8.A05, objArr2, 1, 2131892351));
                    }
                    View A062 = AnonymousClass1HF.A06(A17(), 2131434844);
                    String str3 = r8.A06;
                    A062.setContentDescription(AnonymousClass3MW.A0x(A062.getResources(), str3, new Object[1], 0, 2131895617));
                    View A063 = AnonymousClass1HF.A06(A17(), 2131432854);
                    Resources resources = A063.getResources();
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = str3;
                    A063.setContentDescription(AnonymousClass3MW.A0x(resources, r8.A05, objArr3, 1, 2131888098));
                }
                Dialog dialog3 = this.A03;
                if (dialog3 != null) {
                    dialog3.setCancelable(false);
                }
                AnonymousClass73N A0M2 = C108975cc.A0M(this);
                A0M2.A05 = AnonymousClass3MW.A0z(this);
                A0M2.A08 = true;
                C18100vl r5 = this.A0O;
                AnonymousClass1DS r4 = C108945cZ.A0n(r5).A03;
                C37801q9 A1G2 = A1G();
                AnonymousClass7SB A003 = AnonymousClass7SB.A00(this, 36);
                C18070vi.A0d(r4, 0);
                r4.A0A(A1G2, new AnonymousClass7AH(r4, A003, 6));
                C111125iM A0n = C108945cZ.A0n(r5);
                AnonymousClass3MY.A1L(A0n.A05, true);
                A0n.A06.A0F(new C139826zV(AnonymousClass00R.A00, true));
                return;
            }
            str = "waLocale";
            C18070vi.A11(str);
            throw null;
        }
    }

    public void Byn(C123166Tj r6) {
        C18070vi.A0d(r6, 0);
        if (A1e() && !this.A0Z && !this.A0j) {
            C72453Mb.A1B(this.A02);
            String A0F2 = C18070vi.A0F(A14(), 2131892355);
            C73193Ri A002 = C73193Ri.A00(A14());
            A002.A0d(A0F2);
            A002.A0X(new C1411974r(25), 2131892350);
            A002.A0f(false);
            C010105w create = A002.create();
            create.show();
            AnonymousClass3MZ.A1O(create.A00.A0H, this, create, 30);
        }
    }

    public void Byo() {
        C72453Mb.A1B(this.A02);
        this.A0K = false;
    }

    public void C0t() {
        C0u(false);
        C128586gM r0 = this.A0N;
        int i = this.A01;
        for (C1607589u Byp : r0.A02) {
            Byp.Byp(i);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        A00();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        AnonymousClass7K6 r2 = this.A0B;
        if (r2 != null) {
            r2.A03();
            Context context = r2.A0G;
            C18070vi.A0d(context, 0);
            r2.A03 = C72453Mb.A09(context);
            RecyclerView A0U = C108945cZ.A0U(r2.A0H, 2131434847);
            A0U.setNestedScrollingEnabled(false);
            A0U.setLayoutManager(r2.A0I);
            A0U.setAdapter(r2.A08);
            r2.A07 = A0U;
            AnonymousClass7K6.A02(r2, r2.A02);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        A00();
    }

    private final void A00() {
        Object obj;
        C18100vl r3 = this.A0O;
        AnonymousClass1DT r4 = C108945cZ.A0n(r3).A06;
        C139826zV r0 = (C139826zV) r4.A06();
        C139826zV r2 = null;
        if (r0 != null) {
            r2 = new C139826zV(r0.A00, false);
        }
        r4.A0F(r2);
        List A042 = A1F().A0U.A04();
        C18070vi.A0X(A042);
        Iterator it = A042.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (!(obj instanceof MusicBrowseFragment));
        if (!(obj instanceof MusicBrowseFragment) || obj == null) {
            AnonymousClass3MY.A1L(C108945cZ.A0n(r3).A05, false);
            C111125iM A0n = C108945cZ.A0n(r3);
            Integer num = AnonymousClass00R.A00;
            AnonymousClass1DT r22 = A0n.A06;
            C139826zV r02 = (C139826zV) r22.A06();
            C139826zV r1 = null;
            if (r02 != null) {
                r1 = new C139826zV(num, r02.A01);
            }
            r22.A0F(r1);
        }
    }

    public static final void A01(MusicEditorDialog musicEditorDialog, int i) {
        musicEditorDialog.A01 = i;
        TextView textView = musicEditorDialog.A07;
        if (textView != null) {
            textView.setText(C124066Wx.A00(C17880vN.A0n(i)));
        }
        C108975cc.A0M(musicEditorDialog).A00 = i;
    }

    public static final void A03(MusicEditorDialog musicEditorDialog, Integer num) {
        String str;
        C1418277c r0 = musicEditorDialog.A0C;
        if (r0 != null && (str = r0.A0A) != null) {
            if (musicEditorDialog.A0K) {
                C108975cc.A0q(musicEditorDialog.A02);
            }
            AnonymousClass73N A0M2 = C108975cc.A0M(musicEditorDialog);
            Context A14 = musicEditorDialog.A14();
            int i = musicEditorDialog.A01;
            AnonymousClass73N.A03(A0M2, new AnonymousClass7R6(A0M2, musicEditorDialog.A0J, A14, AnonymousClass3MW.A0z(musicEditorDialog), num, str, i, 1));
        }
    }

    private final void A04(boolean z) {
        Object obj;
        String str;
        String str2;
        String str3;
        String str4;
        ImageView imageView = this.A05;
        if (imageView != null) {
            if (z) {
                this.A0M = false;
                imageView.setImageResource(2131233388);
                Resources resources = imageView.getResources();
                Object[] objArr = new Object[2];
                C1418277c r1 = this.A0C;
                if (r1 != null) {
                    str3 = r1.A06;
                } else {
                    str3 = null;
                }
                objArr[0] = str3;
                if (r1 != null) {
                    str4 = r1.A05;
                } else {
                    str4 = null;
                }
                imageView.setContentDescription(AnonymousClass3MW.A0x(resources, str4, objArr, 1, 2131892352));
            } else {
                this.A0M = true;
                imageView.setImageResource(2131233402);
                Resources resources2 = imageView.getResources();
                Object[] objArr2 = new Object[2];
                C1418277c r12 = this.A0C;
                if (r12 != null) {
                    str = r12.A06;
                } else {
                    str = null;
                }
                objArr2[0] = str;
                if (r12 != null) {
                    str2 = r12.A05;
                } else {
                    str2 = null;
                }
                imageView.setContentDescription(AnonymousClass3MW.A0x(resources2, str2, objArr2, 1, 2131892353));
            }
        }
        ImageView imageView2 = this.A05;
        if (imageView2 != null) {
            imageView2.setEnabled(true);
        }
        if (z) {
            obj = new C119996Ay((Integer) null);
        } else {
            obj = C119986Ax.A00;
        }
        if (this.A0P) {
            C108945cZ.A0n(this.A0O).A09.A0F(obj);
        }
    }

    public void Bqe(int i, boolean z) {
        this.A00 = i;
        if (z && this.A0P) {
            C111125iM A0n = C108945cZ.A0n(this.A0O);
            A0n.A09.A0F(new C119996Ay(Integer.valueOf(i - this.A01)));
        }
        for (C1607589u Byp : this.A0N.A02) {
            Byp.Byp(i);
        }
    }

    public void C4e(C1607589u r5) {
        try {
            int i = this.A01;
            AnonymousClass73N A0M2 = C108975cc.A0M(this);
            AnonymousClass73N.A03(A0M2, new AnonymousClass7RM((Object) A0M2, i, 30));
            if (this.A0P) {
                C111125iM A0n = C108945cZ.A0n(this.A0O);
                A0n.A09.A0F(new C119976Aw(i - this.A01));
            }
            if (!this.A0K) {
                AnonymousClass73N.A02(C108975cc.A0M(this), 19);
            } else {
                A03(this, (Integer) null);
            }
            A04(true);
        } catch (IllegalStateException e) {
            Log.e("MusicEditorDialog", e);
        }
    }

    public MusicEditorDialog() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(C111125iM.class);
        this.A0O = C99274sY.A00(new C152377no(this), new C152387np(this), new C156307u9(this), A15);
        this.A0N = new C128586gM(this);
    }

    public void A1j() {
        super.A1j();
        AnonymousClass73N.A02(C108975cc.A0M(this), 23);
        this.A0L = false;
        this.A0K = true;
    }

    public void A1s() {
        super.A1s();
        AnonymousClass00H r0 = this.A0E;
        if (r0 != null) {
            ((AnonymousClass6EY) r0.get()).A0B();
            AnonymousClass7K6 r02 = this.A0B;
            if (r02 != null) {
                r02.A03();
            }
            this.A0B = null;
            this.A0A = null;
            this.A0D = null;
            this.A03 = null;
            this.A09 = null;
            this.A06 = null;
            this.A07 = null;
            this.A05 = null;
            this.A04 = null;
            this.A08 = null;
            this.A02 = null;
            return;
        }
        C18070vi.A11("artworkDownloader");
        throw null;
    }

    public void A1t() {
        super.A1t();
        AnonymousClass73N.A02(C108975cc.A0M(this), 26);
        this.A0L = false;
        if (this.A0P) {
            C111125iM A0n = C108945cZ.A0n(this.A0O);
            A0n.A09.A0F(C119986Ax.A00);
        }
    }

    public void A1u() {
        super.A1u();
        if (!this.A0M && !this.A0L) {
            A03(this, Integer.valueOf(this.A00));
        }
    }

    public int A25() {
        return 2132083472;
    }

    public void C0u(boolean z) {
        A04(z);
        this.A0L = z;
    }

    public void C4f(C1607589u r3) {
        try {
            AnonymousClass73N A0M2 = C108975cc.A0M(this);
            C121626Kw r0 = A0M2.A02;
            if (r0 != null && r0.A01.isPlaying()) {
                AnonymousClass73N.A02(A0M2, 26);
            }
            A04(false);
        } catch (IllegalStateException e) {
            Log.e("MusicEditorDialog", e);
        }
        AnonymousClass73N.A02(C108975cc.A0M(this), 25);
        AnonymousClass7K6 r02 = this.A0B;
        if (r02 != null) {
            r02.A0J.A00(0.0f);
        }
    }

    public void C4g(C1607589u r1, int i) {
        A01(this, i);
    }
}
