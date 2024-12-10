package com.whatsapp.gifsearch;

import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass18K;
import X.AnonymousClass1HF;
import X.AnonymousClass1L4;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass4UI;
import X.AnonymousClass622;
import X.AnonymousClass66P;
import X.AnonymousClass66S;
import X.AnonymousClass66T;
import X.AnonymousClass66W;
import X.AnonymousClass736;
import X.AnonymousClass79Y;
import X.AnonymousClass85A;
import X.AnonymousClass87C;
import X.C108945cZ;
import X.C108955ca;
import X.C110435fd;
import X.C112375lN;
import X.C112665lq;
import X.C112735lx;
import X.C121196Ih;
import X.C129036h9;
import X.C133816pX;
import X.C140126zz;
import X.C146747Ql;
import X.C17890vO;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C19830z4;
import X.C21355Aik;
import X.C38471rL;
import X.C39711tW;
import X.C40611uz;
import X.C72453Mb;
import X.C80753xv;
import X.C825148g;
import X.C89564cf;
import X.C89944dH;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaEditText;

public final class GifSearchContainer extends C110435fd {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public WaEditText A06;
    public AnonymousClass11C A07;
    public C19830z4 A08;
    public C18000vb A09;
    public AnonymousClass4UI A0A;
    public C18030ve A0B;
    public AnonymousClass18K A0C;
    public AnonymousClass736 A0D;
    public C112375lN A0E;
    public AnonymousClass85A A0F;
    public C140126zz A0G;
    public AnonymousClass87C A0H;
    public C129036h9 A0I;
    public C18010vc A0J;
    public AnonymousClass1L4 A0K;
    public AnonymousClass10I A0L;
    public CharSequence A0M;
    public String A0N;
    public RecyclerView A0O;
    public boolean A0P;
    public final Runnable A0Q = C146747Ql.A00(this, 49);
    public final C40611uz A0R = new C112665lq(this);
    public final C39711tW A0S = new C112735lx(this, 4);
    public final C89564cf A0T = new C121196Ih(this, 3);
    public final C38471rL A0U = new C825148g(this, 11);
    public final C38471rL A0V = new C825148g(this, 12);
    public final C38471rL A0W = new C825148g(this, 13);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifSearchContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A01();
    }

    public static final void setupSearchContainer$lambda$4$lambda$2(GifSearchContainer gifSearchContainer, View view) {
        C18070vi.A0d(gifSearchContainer, 0);
        RecyclerView recyclerView = gifSearchContainer.A0O;
        if (recyclerView != null) {
            recyclerView.A0c();
        }
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setGifCache(AnonymousClass736 r2) {
        C18070vi.A0d(r2, 0);
        this.A0D = r2;
    }

    public final void setGifTooltipUtils(C129036h9 r2) {
        C18070vi.A0d(r2, 0);
        this.A0I = r2;
    }

    public final void setImeUtils(AnonymousClass1L4 r2) {
        C18070vi.A0d(r2, 0);
        this.A0K = r2;
    }

    public final void setSharedPreferencesFactory(C18010vc r2) {
        C18070vi.A0d(r2, 0);
        this.A0J = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setWaSharedPreferences(C19830z4 r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A0L = r2;
    }

    public final void setWamRuntime(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 0);
        this.A0C = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public static final void A00(GifSearchContainer gifSearchContainer, CharSequence charSequence) {
        String str;
        if (gifSearchContainer.A0G != null) {
            int A0D2 = C72453Mb.A0D(gifSearchContainer.A03);
            View view = gifSearchContainer.A04;
            if (view != null) {
                view.setVisibility(A0D2);
            }
            C72453Mb.A1C(gifSearchContainer.A02);
            C133816pX r2 = null;
            if (charSequence == null || charSequence.length() == 0) {
                C140126zz r0 = gifSearchContainer.A0G;
                if (r0 != null) {
                    r2 = r0.A05();
                }
            } else {
                C140126zz r1 = gifSearchContainer.A0G;
                if (r1 != null) {
                    r2 = r1 instanceof AnonymousClass66T ? new AnonymousClass66W((AnonymousClass66T) r1, charSequence) : new AnonymousClass66W((AnonymousClass66S) r1, charSequence);
                }
            }
            C112375lN r02 = gifSearchContainer.A0E;
            if (r02 != null) {
                r02.A0U(r2);
            }
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            gifSearchContainer.A0N = str;
        }
    }

    public final void A02(Activity activity, C80753xv r6, C140126zz r7, AnonymousClass87C r8) {
        this.A0G = r7;
        this.A0H = r8;
        this.A0A = r6;
        setupViews(activity);
        setVisibility(0);
        int A0D2 = C72453Mb.A0D(this.A02);
        View view = this.A03;
        if (view != null) {
            view.setVisibility(A0D2);
        }
        View view2 = this.A04;
        if (view2 != null) {
            view2.setVisibility(A0D2);
        }
        View view3 = this.A02;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        C140126zz r3 = this.A0G;
        if (r3 != null) {
            C112375lN r1 = this.A0E;
            if (r1 != null) {
                r1.A0U(r3.A05());
            }
            AnonymousClass18K wamRuntime = getWamRuntime();
            AnonymousClass622 r12 = new AnonymousClass622();
            r12.A00 = Integer.valueOf(r3.A03());
            wamRuntime.CC7(r12);
        }
        this.A0N = "";
        WaEditText waEditText = this.A06;
        if (waEditText != null) {
            waEditText.setText("");
            waEditText.requestFocus();
            waEditText.A0I(false);
        }
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass736 getGifCache() {
        AnonymousClass736 r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("gifCache");
        throw null;
    }

    public final C129036h9 getGifTooltipUtils() {
        C129036h9 r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("gifTooltipUtils");
        throw null;
    }

    public final AnonymousClass1L4 getImeUtils() {
        AnonymousClass1L4 r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("imeUtils");
        throw null;
    }

    public final C18010vc getSharedPreferencesFactory() {
        C18010vc r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sharedPreferencesFactory");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final C19830z4 getWaSharedPreferences() {
        C19830z4 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A0L;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public final AnonymousClass18K getWamRuntime() {
        AnonymousClass18K r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("wamRuntime");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    private final void setupRecyclerView(ViewGroup viewGroup) {
        RecyclerView A0U2 = C108945cZ.A0U(viewGroup, 2131434954);
        this.A0O = A0U2;
        if (A0U2 != null) {
            A0U2.A0t(this.A0S);
            A0U2.A0r(this.A0R);
            AnonymousClass10I waWorkers = getWaWorkers();
            C18030ve abProps = getAbProps();
            AnonymousClass736 gifCache = getGifCache();
            AnonymousClass66P r2 = new AnonymousClass66P(getSystemServices(), abProps, getWamRuntime(), gifCache, this, this.A0H, getGifTooltipUtils(), getSharedPreferencesFactory(), waWorkers);
            this.A0E = r2;
            A0U2.setAdapter(r2);
        }
    }

    private final void setupSearchContainer(ViewGroup viewGroup) {
        String str;
        this.A03 = AnonymousClass1HF.A06(viewGroup, 2131433163);
        this.A04 = AnonymousClass1HF.A06(viewGroup, 2131434679);
        this.A05 = AnonymousClass1HF.A06(viewGroup, 2131434873);
        WaEditText waEditText = (WaEditText) AnonymousClass1HF.A06(viewGroup, 2131434853);
        this.A06 = waEditText;
        if (waEditText != null) {
            waEditText.addTextChangedListener(this.A0T);
            C89944dH.A00(waEditText, this, 35);
            Resources resources = waEditText.getResources();
            Object[] A1a = AnonymousClass3MW.A1a();
            C140126zz r0 = this.A0G;
            if (r0 == null) {
                str = null;
            } else if (r0 instanceof AnonymousClass66T) {
                str = "Tenor";
            } else {
                str = "Giphy";
            }
            waEditText.setHint(AnonymousClass3MW.A0x(resources, str, A1a, 0, 2131890774));
            waEditText.setOnEditorActionListener(new AnonymousClass79Y(this, 1));
        }
        View A062 = AnonymousClass1HF.A06(viewGroup, 2131429122);
        this.A01 = A062;
        if (A062 != null) {
            A062.setOnClickListener(this.A0V);
        }
        this.A02 = AnonymousClass1HF.A06(viewGroup, 2131434187);
        ImageView A0C2 = AnonymousClass3Ma.A0C(viewGroup, 2131428012);
        A0C2.setOnClickListener(this.A0U);
        AnonymousClass3NL.A01(getContext(), A0C2, getWhatsAppLocale(), 2131231675);
        AnonymousClass1HF.A06(viewGroup, 2131434675).setOnClickListener(this.A0W);
    }

    private final void setupViews(Activity activity) {
        if (getChildCount() <= 0) {
            ViewGroup A0H2 = C108955ca.A0H(activity.getLayoutInflater().inflate(2131625450, this, false));
            setupRecyclerView(A0H2);
            setupSearchContainer(A0H2);
            View view = this.A05;
            if (view != null) {
                A0H2.removeView(view);
                if (this.A00 == 48) {
                    A0H2.addView(this.A05, 0);
                } else {
                    A0H2.addView(this.A05, A0H2.getChildCount());
                }
            }
            addView(A0H2);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getMeasuredHeight() != i4 - i2) {
            if (!this.A0P) {
                post(new C21355Aik(this, 0));
            }
            this.A0P = !this.A0P;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        SharedPreferences A0B2;
        String str;
        if (!isInEditMode()) {
            int size = View.MeasureSpec.getSize(i2);
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                getImeUtils();
                if (!AnonymousClass1L4.A00(this)) {
                    C19830z4 waSharedPreferences = getWaSharedPreferences();
                    int i3 = getResources().getConfiguration().orientation;
                    if (i3 == 1) {
                        A0B2 = C17890vO.A0B(waSharedPreferences);
                        str = "keyboard_height_portrait";
                    } else if (i3 == 2) {
                        A0B2 = C17890vO.A0B(waSharedPreferences);
                        str = "keyboard_height_landscape";
                    }
                    int A002 = C17890vO.A00(A0B2, str);
                    if (A002 > 0) {
                        if (size > A002) {
                            size = A002;
                        }
                        i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setOnActionListener(AnonymousClass85A r1) {
        this.A0F = r1;
    }

    public final void setSearchContainerGravity(int i) {
        this.A00 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifSearchContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifSearchContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifSearchContainer(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A01();
    }
}
