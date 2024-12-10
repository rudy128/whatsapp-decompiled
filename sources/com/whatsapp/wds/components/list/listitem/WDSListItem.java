package com.whatsapp.wds.components.list.listitem;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1LT;
import X.AnonymousClass1Y0;
import X.AnonymousClass1Y5;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass4D7;
import X.AnonymousClass4D8;
import X.BE6;
import X.BJT;
import X.C108575bv;
import X.C146877Qy;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C24253ByB;
import X.C24267ByQ;
import X.C24291Byo;
import X.C24353Bzo;
import X.C24363Bzy;
import X.C25704CkZ;
import X.C28081Yu;
import X.C28911bG;
import X.C29261bv;
import X.C72463Mc;
import X.C72473Md;
import X.C74743cP;
import X.C83064Df;
import X.DPE;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.icon.WDSIcon;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import com.whatsapp.wds.components.toggle.WDSSwitch;

public class WDSListItem extends BJT implements C108575bv {
    public int A00;
    public View A01;
    public RadioButton A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public C18000vb A06;
    public C18030ve A07;
    public AnonymousClass1LT A08;
    public WDSIcon A09;
    public WDSIcon A0A;
    public C25704CkZ A0B;
    public WDSProfilePhoto A0C;
    public WDSSwitch A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public View A0J = this;
    public Boolean A0K;
    public final C28911bG A0L = new DPE(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A0C;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            this.A0B = new C25704CkZ(obtainStyledAttributes, this);
            A01(this);
            if (this.A0B == null) {
                Log.e("WDSListItem attributes missed");
            } else {
                WDSListItem wDSListItem = null;
                boolean z = this instanceof ViewGroup;
                View inflate = View.inflate(getContext(), 2131627562, z ? this : null);
                C28911bG r1 = this.A0L;
                C18070vi.A0b(inflate);
                r1.Bvv(inflate, z ? this : wDSListItem, "auto-sync-inflated", 2131627562);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void A07() {
        C24353Bzo bzo;
        C24353Bzo bzo2;
        C24353Bzo bzo3;
        C24291Byo byo;
        C24363Bzy bzy;
        C24363Bzy bzy2;
        Integer num;
        AnonymousClass4D8 r3;
        C83064Df r2;
        AnonymousClass4D7 r1;
        C24253ByB byB;
        if (this.A00 == 0) {
            this.A00 = getResources().getDimensionPixelSize(2131169544) + getResources().getDimensionPixelSize(2131169476);
        }
        C25704CkZ ckZ = this.A0B;
        C24267ByQ byQ = null;
        if (ckZ != null) {
            bzo = ckZ.A0V;
        } else {
            bzo = null;
        }
        setHorizontalMargins(bzo);
        C25704CkZ ckZ2 = this.A0B;
        if (ckZ2 != null) {
            bzo2 = ckZ2.A0W;
        } else {
            bzo2 = null;
        }
        setVerticalInBetweenMargin(bzo2);
        C25704CkZ ckZ3 = this.A0B;
        if (ckZ3 != null) {
            bzo3 = ckZ3.A0U;
        } else {
            bzo3 = null;
        }
        setHorizontalInBetweenMargin(bzo3);
        C25704CkZ ckZ4 = this.A0B;
        if (ckZ4 != null) {
            byo = ckZ4.A0h;
        } else {
            byo = null;
        }
        setRowDensity(byo);
        if ((isClickable() || isFocusable()) && this.A0E == 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(2130971933, typedValue, true);
            this.A0J.setBackgroundResource(typedValue.resourceId);
            this.A0E = typedValue.resourceId;
        }
        C25704CkZ ckZ5 = this.A0B;
        if (ckZ5 != null) {
            bzy = ckZ5.A0j;
        } else {
            bzy = null;
        }
        setRowContentTextStyle(bzy);
        C25704CkZ ckZ6 = this.A0B;
        if (ckZ6 != null) {
            bzy2 = ckZ6.A0i;
        } else {
            bzy2 = null;
        }
        setRowSubContentTextStyle(bzy2);
        C25704CkZ ckZ7 = this.A0B;
        if (ckZ7 != null) {
            int intValue = ckZ7.A0q.intValue();
            if (intValue == 2) {
                setStartAddonIconStyle(ckZ7.A0f, ckZ7.A0d, ckZ7.A0Z, ckZ7.A0b);
            } else if (intValue == 3) {
                setStartAddonProfilePhotoStyle(Boolean.valueOf(ckZ7.A0w), ckZ7.A0k, ckZ7.A0l, ckZ7.A0m, ckZ7.A0n);
            }
        }
        C25704CkZ ckZ8 = this.A0B;
        if (ckZ8 != null) {
            num = ckZ8.A0p;
        } else {
            num = null;
        }
        if (num == AnonymousClass00R.A0C) {
            if (ckZ8 != null) {
                r3 = ckZ8.A0e;
                r2 = ckZ8.A0c;
                r1 = ckZ8.A0Y;
                byB = ckZ8.A0a;
            } else {
                r3 = null;
                r2 = null;
                r1 = null;
                byB = null;
            }
            setEndAddonIconStyle(r3, r2, r1, byB);
        }
        if (this.A01 != null) {
            C25704CkZ ckZ9 = this.A0B;
            if (ckZ9 != null) {
                byQ = ckZ9.A0g;
            }
            setRowDividerStyle(byQ);
        }
    }

    public static final void A00(View view, int i, int i2) {
        View view2;
        if (view != null) {
            view2 = view.findViewById(i);
        } else {
            view2 = null;
        }
        if (view2 instanceof ViewStub) {
            ((ViewStub) view2).setLayoutResource(i2);
        }
    }

    public static final void A01(WDSListItem wDSListItem) {
        C25704CkZ ckZ = wDSListItem.A0B;
        if (ckZ != null && ckZ.A0v && wDSListItem.A0K == null) {
            C18030ve r2 = wDSListItem.A07;
            boolean z = false;
            if (r2 != null) {
                z = C18020vd.A05(C18040vf.A02, r2, 7852);
            }
            Boolean valueOf = Boolean.valueOf(z);
            wDSListItem.A0K = valueOf;
            C18070vi.A18(valueOf, true);
        }
    }

    private final void setEndAddonIconStyle(AnonymousClass4D8 r2, C83064Df r3, AnonymousClass4D7 r4, C24253ByB byB) {
        WDSIcon wDSIcon = this.A09;
        if (wDSIcon != null) {
            if (r2 != null) {
                wDSIcon.setVariant(r2);
            }
            if (r3 != null) {
                wDSIcon.setSize(r3);
            }
            if (r4 != null) {
                wDSIcon.setAction(r4);
            }
            if (byB != null) {
                wDSIcon.setShape(byB);
            }
        }
    }

    private final void setHorizontalInBetweenMargin(C24353Bzo bzo) {
        int intValue;
        if (bzo != null && (intValue = Integer.valueOf(bzo.dimen).intValue()) != this.A0G) {
            int A022 = AnonymousClass3Ma.A02(this, intValue);
            C25704CkZ ckZ = this.A0B;
            Integer num = null;
            if (ckZ != null) {
                num = ckZ.A0q;
            }
            Integer num2 = AnonymousClass00R.A00;
            int i = A022;
            if (num == num2) {
                i = 0;
            }
            if (ckZ != null && ckZ.A0p == num2) {
                A022 = 0;
            }
            View findViewById = findViewById(2131434755);
            if (findViewById != null) {
                findViewById.setPaddingRelative(i, findViewById.getPaddingTop(), A022, findViewById.getPaddingBottom());
            }
            this.A0G = intValue;
        }
    }

    private final void setHorizontalMargins(C24353Bzo bzo) {
        int i;
        if (bzo != null && (i = bzo.dimen) != this.A0F) {
            A08();
            this.A0F = i;
        }
    }

    private final void setStartAddonIconStyle(AnonymousClass4D8 r2, C83064Df r3, AnonymousClass4D7 r4, C24253ByB byB) {
        WDSIcon wDSIcon = this.A0A;
        if (wDSIcon != null) {
            if (r2 != null) {
                wDSIcon.setVariant(r2);
            }
            if (r3 != null) {
                wDSIcon.setSize(r3);
            }
            if (r4 != null) {
                wDSIcon.setAction(r4);
            }
            if (byB != null) {
                wDSIcon.setShape(byB);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r1 = new X.C39301sq(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        r2.setProfileBadge(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setStartAddonProfilePhotoStyle(java.lang.Boolean r4, X.C39201sg r5, X.C39191sf r6, X.C24300Byx r7, X.C24280Byd r8) {
        /*
            r3 = this;
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = r3.A0C
            if (r2 == 0) goto L_0x0063
            boolean r0 = X.C72453Mb.A1Y(r4)
            r2.setStatusIndicatorEnabled(r0)
            if (r6 == 0) goto L_0x0010
            r2.setProfilePhotoSize(r6)
        L_0x0010:
            if (r5 == 0) goto L_0x0015
            r2.setProfilePhotoShape(r5)
        L_0x0015:
            if (r7 == 0) goto L_0x0047
            int r0 = r7.ordinal()
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x003d;
                case 2: goto L_0x0037;
                case 3: goto L_0x0031;
                case 4: goto L_0x0029;
                case 5: goto L_0x0026;
                case 6: goto L_0x0023;
                default: goto L_0x001e;
            }
        L_0x001e:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0023:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x002b
        L_0x0026:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x002b
        L_0x0029:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
        L_0x002b:
            X.1sq r1 = new X.1sq
            r1.<init>(r0)
            goto L_0x0044
        L_0x0031:
            X.1st r1 = new X.1st
            r1.<init>()
            goto L_0x0044
        L_0x0037:
            X.1sl r1 = new X.1sl
            r1.<init>()
            goto L_0x0044
        L_0x003d:
            X.1sp r1 = new X.1sp
            r1.<init>()
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            r2.setProfileBadge(r1)
        L_0x0047:
            if (r8 == 0) goto L_0x0063
            int r1 = r8.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x006a
            r0 = 1
            if (r1 == r0) goto L_0x0067
            r0 = 2
            if (r1 == r0) goto L_0x0064
            r0 = 3
            if (r1 != r0) goto L_0x006d
            X.1sh r1 = X.C39211sh.ERROR
        L_0x005b:
            X.1sj r0 = new X.1sj
            r0.<init>(r1)
            r2.setProfileStatus(r0)
        L_0x0063:
            return
        L_0x0064:
            X.1sh r1 = X.C39211sh.UNSEEN
            goto L_0x005b
        L_0x0067:
            X.1sh r1 = X.C39211sh.SEEN_80_ALPHA
            goto L_0x005b
        L_0x006a:
            X.1sh r1 = X.C39211sh.SEEN
            goto L_0x005b
        L_0x006d:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.list.listitem.WDSListItem.setStartAddonProfilePhotoStyle(java.lang.Boolean, X.1sg, X.1sf, X.Byx, X.Byd):void");
    }

    private final void setVerticalInBetweenMargin(C24353Bzo bzo) {
        int i;
        int A022;
        if (bzo != null && (i = bzo.dimen) != this.A0H && (A022 = AnonymousClass3Ma.A02(this, i)) >= 0) {
            WaTextView waTextView = this.A04;
            if (waTextView == null || waTextView.getVisibility() != 8) {
                WaTextView waTextView2 = this.A05;
                if (waTextView2 != null) {
                    C72473Md.A11(waTextView2, A022 / 2);
                }
            } else {
                WaTextView waTextView3 = this.A05;
                if (waTextView3 != null) {
                    C72473Md.A11(waTextView3, 0);
                }
            }
            WaTextView waTextView4 = this.A05;
            if (waTextView4 == null || waTextView4.getVisibility() != 8) {
                WaTextView waTextView5 = this.A04;
                if (waTextView5 != null) {
                    C72463Mc.A14(waTextView5, waTextView5.getPaddingLeft(), A022 / 2);
                }
            } else {
                WaTextView waTextView6 = this.A04;
                if (waTextView6 != null) {
                    C72463Mc.A14(waTextView6, waTextView6.getPaddingLeft(), 0);
                }
            }
            this.A0H = i;
        }
    }

    private final void setVerticalMargins(C24353Bzo bzo) {
        int i;
        if (bzo != null && (i = bzo.dimen) != this.A0I) {
            View view = this.A0J;
            view.setPadding(view.getPaddingLeft(), AnonymousClass3Ma.A02(this, i), view.getPaddingRight(), AnonymousClass3Ma.A02(this, i));
            this.A0I = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (X.AnonymousClass3MW.A1Z(r0) != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (X.AnonymousClass3MW.A1Z(r0) != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r2 = r5.A0J;
        r2.setPadding(0, r2.getPaddingTop(), r3, r2.getPaddingBottom());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r5 = this;
            X.CkZ r0 = r5.A0B
            if (r0 == 0) goto L_0x0034
            X.Bzo r0 = r0.A0V
            int r0 = r0.dimen
            int r3 = X.AnonymousClass3Ma.A02(r5, r0)
            X.CkZ r0 = r5.A0B
            if (r0 == 0) goto L_0x004d
            java.lang.Integer r0 = r0.A0p
            int r1 = r0.intValue()
            r0 = 3
            r4 = 0
            if (r1 == r0) goto L_0x0035
            r0 = 6
            if (r1 != r0) goto L_0x004d
            X.0vb r0 = r5.A06
            if (r0 == 0) goto L_0x0034
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            if (r0 == 0) goto L_0x003f
        L_0x0027:
            android.view.View r2 = r5.A0J
            int r1 = r2.getPaddingTop()
            int r0 = r2.getPaddingBottom()
            r2.setPadding(r3, r1, r4, r0)
        L_0x0034:
            return
        L_0x0035:
            X.0vb r0 = r5.A06
            if (r0 == 0) goto L_0x0034
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            if (r0 == 0) goto L_0x0027
        L_0x003f:
            android.view.View r2 = r5.A0J
            int r1 = r2.getPaddingTop()
            int r0 = r2.getPaddingBottom()
            r2.setPadding(r4, r1, r3, r0)
            return
        L_0x004d:
            android.view.View r2 = r5.A0J
            int r1 = r2.getPaddingTop()
            int r0 = r2.getPaddingBottom()
            r2.setPadding(r3, r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.list.listitem.WDSListItem.A08():void");
    }

    public final void A09(Drawable drawable, boolean z) {
        WDSIcon wDSIcon = this.A0A;
        if (wDSIcon == null) {
            return;
        }
        if (drawable == null) {
            wDSIcon.setVisibility(8);
            return;
        }
        wDSIcon.setVisibility(0);
        C18000vb r1 = this.A06;
        if (r1 != null && z) {
            drawable = new C74743cP(drawable, r1);
        }
        wDSIcon.setIcon(drawable);
    }

    public final C18030ve getAbProps() {
        return this.A07;
    }

    public CharSequence getContentDescription() {
        CharSequence charSequence;
        C25704CkZ ckZ = this.A0B;
        if (ckZ != null) {
            int intValue = ckZ.A0o.intValue();
            if (intValue == 0) {
                StringBuilder A10 = AnonymousClass000.A10();
                WaTextView waTextView = this.A05;
                if (waTextView != null) {
                    charSequence = waTextView.getText();
                } else {
                    charSequence = null;
                }
                A10.append(charSequence);
                WaTextView waTextView2 = this.A04;
                if (waTextView2 != null && waTextView2.getVisibility() == 0) {
                    BE6.A1K(A10);
                    A10.append(waTextView2.getText());
                }
                return C18070vi.A0H(A10);
            } else if (!(intValue == 1 || intValue == 2)) {
                throw AnonymousClass3MW.A14();
            }
        }
        return "";
    }

    public final WaImageView getEndAddonBadge() {
        return this.A03;
    }

    public final WDSIcon getEndAddonIcon() {
        return this.A09;
    }

    public final RadioButton getEndAddonRadioButton() {
        return this.A02;
    }

    public final WDSSwitch getEndAddonSwitch() {
        return this.A0D;
    }

    public final C25704CkZ getItemAttributes() {
        return this.A0B;
    }

    public final View getItemDividerView() {
        return this.A01;
    }

    public final WaTextView getItemSubTextView() {
        return this.A04;
    }

    public final WaTextView getItemTextView() {
        return this.A05;
    }

    public final WDSIcon getStartAddonIcon() {
        return this.A0A;
    }

    public final WDSProfilePhoto getStartAddonProfilePhoto() {
        return this.A0C;
    }

    public final AnonymousClass1LT getWaAsyncLayoutInflaterManager() {
        return this.A08;
    }

    public final C18000vb getWhatsAppLocale() {
        return this.A06;
    }

    public void setBadgeIcon(Drawable drawable) {
        Integer num;
        int i;
        C25704CkZ ckZ = this.A0B;
        ColorStateList colorStateList = null;
        if (ckZ != null) {
            num = ckZ.A0p;
        } else {
            num = null;
        }
        if (num != AnonymousClass00R.A0Y) {
            return;
        }
        if (drawable != null || this.A03 != null) {
            if (this.A03 == null) {
                View findViewById = findViewById(2131434752);
                if (findViewById instanceof ViewStub) {
                    ViewStub viewStub = (ViewStub) findViewById;
                    viewStub.setLayoutResource(2131627567);
                    View inflate = viewStub.inflate();
                    C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.WaImageView");
                    this.A03 = (WaImageView) inflate;
                }
            }
            WaImageView waImageView = this.A03;
            if (waImageView != null) {
                if (drawable == null) {
                    i = 8;
                } else {
                    C25704CkZ ckZ2 = this.A0B;
                    if (!(ckZ2 == null || ckZ2.A0L == -1)) {
                        C28081Yu.A01(PorterDuff.Mode.SRC_IN, waImageView);
                        int i2 = ckZ2.A0L;
                        if (i2 != 0) {
                            colorStateList = ColorStateList.valueOf(i2);
                        }
                        C28081Yu.A00(colorStateList, waImageView);
                    }
                    waImageView.setImageDrawable(drawable);
                    i = 0;
                }
                waImageView.setVisibility(i);
            }
        }
    }

    public final void setEndAddonIcon(Drawable drawable) {
        WDSIcon wDSIcon = this.A09;
        if (wDSIcon == null) {
            return;
        }
        if (drawable == null) {
            wDSIcon.setVisibility(8);
            return;
        }
        wDSIcon.setVisibility(0);
        wDSIcon.setIcon(drawable);
    }

    public void setIcon(int i) {
        WDSIcon wDSIcon = this.A0A;
        if (wDSIcon != null) {
            wDSIcon.setImageResource(i);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            AnonymousClass1Y5.A07(this, "Button");
        }
        super.setOnClickListener(onClickListener);
    }

    public final void setRowContentTextStyle(C24363Bzy bzy) {
        int intValue;
        TextView textView;
        if (bzy != null) {
            int A002 = AnonymousClass1YL.A00(getContext(), bzy.textColorAttrb, 2131103232);
            if (A002 == 2131103232) {
                TypedValue typedValue = new TypedValue();
                Resources.Theme theme = getContext().getTheme();
                if (theme != null) {
                    theme.resolveAttribute(bzy.textColorAttrb, typedValue, true);
                }
                A002 = typedValue.resourceId;
            }
            C25704CkZ ckZ = this.A0B;
            AnonymousClass4D7 r1 = null;
            if (ckZ != null) {
                r1 = ckZ.A0Z;
            }
            if (r1 == AnonymousClass4D7.DESTRUCTIVE) {
                A002 = 2131100136;
            }
            if (ckZ == null || (intValue = ckZ.A0o.intValue()) == -1) {
                Log.w("Null value passed as content type");
                return;
            }
            if (intValue == 0) {
                textView = this.A05;
            } else if (intValue == 1) {
                textView = C17880vN.A0E(this, 2131429428);
            } else if (intValue != 2) {
                throw AnonymousClass3MW.A14();
            } else {
                return;
            }
            if (textView != null) {
                C29261bv.A08(textView, bzy.styleRes);
                AnonymousClass3MX.A1C(getContext(), textView, A002);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        if (r7 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        if (r7 != null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setRowDensity(X.C24291Byo r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0060
            X.CkZ r7 = r8.A0B
            r6 = 0
            if (r7 == 0) goto L_0x0023
            java.lang.Integer r0 = r7.A0o
        L_0x0009:
            r5 = -1
            if (r0 != 0) goto L_0x001e
            r0 = -1
        L_0x000d:
            r4 = 3
            r3 = 2
            r2 = 1
            r1 = 0
            if (r0 == r5) goto L_0x0025
            if (r0 == r1) goto L_0x0025
            if (r0 == r2) goto L_0x0034
            if (r0 == r3) goto L_0x0034
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x001e:
            int r0 = r0.intValue()
            goto L_0x000d
        L_0x0023:
            r0 = r6
            goto L_0x0009
        L_0x0025:
            int r0 = r9.ordinal()
            if (r0 == r2) goto L_0x0058
            if (r0 == r1) goto L_0x0055
            if (r0 == r3) goto L_0x005b
            if (r0 != r4) goto L_0x0050
            if (r7 == 0) goto L_0x0044
            goto L_0x0042
        L_0x0034:
            int r0 = r9.ordinal()
            if (r0 == r2) goto L_0x004d
            if (r0 == r1) goto L_0x0055
            if (r0 == r3) goto L_0x005b
            if (r0 != r4) goto L_0x0048
            if (r7 == 0) goto L_0x0044
        L_0x0042:
            X.Bzo r6 = r7.A0X
        L_0x0044:
            r8.setVerticalMargins(r6)
            return
        L_0x0048:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x004d:
            X.Bzo r0 = X.C24353Bzo.NO_SPACE
            goto L_0x005d
        L_0x0050:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0055:
            X.Bzo r0 = X.C24353Bzo.SPACING_SINGLE_PLUS
            goto L_0x005d
        L_0x0058:
            X.Bzo r0 = X.C24353Bzo.SPACING_SINGLE
            goto L_0x005d
        L_0x005b:
            X.Bzo r0 = X.C24353Bzo.SPACING_DOUBLE
        L_0x005d:
            r8.setVerticalMargins(r0)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.list.listitem.WDSListItem.setRowDensity(X.Byo):void");
    }

    public final void setRowDividerStyle(C24267ByQ byQ) {
        View view;
        ViewGroup.LayoutParams layoutParams;
        Resources resources;
        int i;
        if (byQ != null && (view = this.A01) != null) {
            int ordinal = byQ.ordinal();
            if (ordinal == 1) {
                layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    resources = view.getResources();
                    i = 2131169483;
                } else {
                    throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else if (ordinal == 2) {
                layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    resources = view.getResources();
                    i = 2131169482;
                } else {
                    throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else if (ordinal == 0) {
                view.setVisibility(8);
                return;
            } else {
                throw AnonymousClass3MW.A14();
            }
            layoutParams.height = resources.getDimensionPixelSize(i);
            view.setLayoutParams(layoutParams);
            view.setVisibility(0);
        }
    }

    public final void setRowSubContentTextStyle(C24363Bzy bzy) {
        int A002;
        int intValue;
        TextView textView;
        if (bzy != null) {
            C25704CkZ ckZ = this.A0B;
            AnonymousClass4D7 r1 = null;
            if (ckZ != null) {
                r1 = ckZ.A0Z;
            }
            if (r1 == AnonymousClass4D7.DESTRUCTIVE) {
                A002 = 2131100136;
            } else {
                A002 = AnonymousClass1YL.A00(getContext(), bzy.subTextColorAttrb, 2131103225);
            }
            C25704CkZ ckZ2 = this.A0B;
            if (ckZ2 == null || (intValue = ckZ2.A0o.intValue()) == -1) {
                Log.w("Null value passed as content type");
                return;
            }
            if (intValue == 0) {
                textView = this.A04;
            } else if (intValue == 1) {
                textView = C17880vN.A0E(this, 2131429798);
            } else if (intValue != 2) {
                throw AnonymousClass3MW.A14();
            } else {
                return;
            }
            if (textView != null) {
                C29261bv.A08(textView, bzy.styleRes);
                AnonymousClass3MX.A1C(getContext(), textView, A002);
            }
        }
    }

    public final void setStartAddonProfilePhotoDrawable(Drawable drawable) {
        WDSProfilePhoto wDSProfilePhoto = this.A0C;
        if (wDSProfilePhoto == null) {
            return;
        }
        if (drawable == null) {
            wDSProfilePhoto.setVisibility(8);
            return;
        }
        wDSProfilePhoto.setVisibility(0);
        wDSProfilePhoto.setImageDrawable(drawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r4.length() == 0) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSubText(java.lang.CharSequence r4) {
        /*
            r3 = this;
            com.whatsapp.WaTextView r2 = r3.A04
            if (r2 == 0) goto L_0x0015
            if (r4 == 0) goto L_0x000d
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x000f
        L_0x000d:
            r0 = 8
        L_0x000f:
            r2.setVisibility(r0)
            r2.setText(r4)
        L_0x0015:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.list.listitem.WDSListItem.setSubText(java.lang.CharSequence):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r4.length() == 0) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setText(java.lang.CharSequence r4) {
        /*
            r3 = this;
            com.whatsapp.WaTextView r2 = r3.A05
            if (r2 == 0) goto L_0x0015
            if (r4 == 0) goto L_0x000d
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x000f
        L_0x000d:
            r0 = 8
        L_0x000f:
            r2.setVisibility(r0)
            r2.setText(r4)
        L_0x0015:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.list.listitem.WDSListItem.setText(java.lang.CharSequence):void");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i4 + 1;
        int i6 = this.A00;
        if ((i5 <= i6 && i6 < i2) || (i2 + 1 <= i6 && i6 < i4)) {
            View findViewById = findViewById(2131434753);
            if (findViewById != null) {
                post(new C146877Qy(this, i2, 3, findViewById));
            }
            View findViewById2 = findViewById(2131434752);
            if (findViewById2 != null) {
                post(new C146877Qy(this, i2, 3, findViewById2));
            }
        }
    }

    public final void setAbProps(C18030ve r1) {
        this.A07 = r1;
    }

    public final void setEndAddonBadge(WaImageView waImageView) {
        this.A03 = waImageView;
    }

    public final void setEndAddonRadioButton(RadioButton radioButton) {
        this.A02 = radioButton;
    }

    public final void setEndAddonSwitch(WDSSwitch wDSSwitch) {
        this.A0D = wDSSwitch;
    }

    public final void setItemAttributes(C25704CkZ ckZ) {
        this.A0B = ckZ;
    }

    public final void setItemDividerView(View view) {
        this.A01 = view;
    }

    public final void setItemSubTextView(WaTextView waTextView) {
        this.A04 = waTextView;
    }

    public final void setItemTextView(WaTextView waTextView) {
        this.A05 = waTextView;
    }

    public final void setStartAddonIcon(WDSIcon wDSIcon) {
        this.A0A = wDSIcon;
    }

    public final void setStartAddonProfilePhoto(WDSProfilePhoto wDSProfilePhoto) {
        this.A0C = wDSProfilePhoto;
    }

    public final void setWaAsyncLayoutInflaterManager(AnonymousClass1LT r1) {
        this.A08 = r1;
    }

    public final void setWhatsAppLocale(C18000vb r1) {
        this.A06 = r1;
    }

    public final void setEndAddonIcon(WDSIcon wDSIcon) {
        this.A09 = wDSIcon;
    }

    public void setIcon(Drawable drawable) {
        A09(drawable, false);
    }

    public final void setSubText(int i) {
        WaTextView waTextView = this.A04;
        if (waTextView != null) {
            int i2 = 0;
            if (i == 0) {
                i2 = 8;
            }
            waTextView.setVisibility(i2);
            waTextView.setText(i);
        }
    }

    public void setText(int i) {
        WaTextView waTextView = this.A05;
        if (waTextView != null) {
            int i2 = 0;
            if (i == 0) {
                i2 = 8;
            }
            waTextView.setVisibility(i2);
            waTextView.setText(i);
        }
    }
}
