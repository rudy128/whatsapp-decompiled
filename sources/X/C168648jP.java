package X;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel;
import com.whatsapp.biz.catalog.view.variants.Hilt_VariantsCarouselFragment;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselBaseFragment;
import com.whatsapp.biz.catalog.view.variants.v2.Hilt_VariantsCarouselFragmentV2;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.whatsapp.biz.product.view.fragment.Hilt_ProductMoreInfoFragment;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8jP  reason: invalid class name and case insensitive filesystem */
public abstract class C168648jP extends C166768dw implements BAK {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ObjectAnimator A04;
    public ScrollView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C23520Bik A09;
    public TextEmojiLabel A0A;
    public C33251iW A0B;
    public C22417B6z A0C;
    public C196149uX A0D;
    public C26911Ty A0E;
    public C195529tU A0F;
    public B7A A0G;
    public AnonymousClass8F7 A0H;
    public A1M A0I;
    public C20287AEv A0J;
    public C20287AEv A0K;
    public A8Q A0L;
    public C20005A2v A0M;
    public C191899nN A0N;
    public CatalogCarouselDetailImageView A0O;
    public EllipsizedTextEmojiLabel A0P;
    public QuantitySelector A0Q;
    public C187599g4 A0R;
    public AnonymousClass8GC A0S;
    public A78 A0T;
    public AnonymousClass1M9 A0U;
    public C37511pf A0V;
    public AnonymousClass1PM A0W;
    public C24921Me A0X;
    public C32951i1 A0Y;
    public UserJid A0Z;
    public AnonymousClass2UJ A0a;
    public C20004A2u A0b;
    public C28931bI A0c;
    public C28931bI A0d;
    public C28931bI A0e;
    public C28931bI A0f;
    public C28931bI A0g;
    public C28931bI A0h;
    public WDSButton A0i;
    public AnonymousClass00H A0j;
    public AnonymousClass00H A0k;
    public AnonymousClass00H A0l;
    public AnonymousClass00H A0m;
    public AnonymousClass00H A0n;
    public AnonymousClass00H A0o;
    public AnonymousClass00H A0p;
    public AnonymousClass00H A0q;
    public AnonymousClass00H A0r;
    public AnonymousClass00H A0s;
    public AnonymousClass00H A0t;
    public AnonymousClass00H A0u;
    public AnonymousClass00H A0v;
    public AnonymousClass00H A0w;
    public AnonymousClass00H A0x;
    public String A0y;
    public String A0z;
    public String A10;
    public String A11;
    public String A12;
    public List A13;
    public boolean A14;
    public boolean A15;
    public boolean A16 = true;
    public ViewTreeObserver.OnScrollChangedListener A17;
    public C28931bI A18;
    public boolean A19;
    public boolean A1A;
    public final C180579Nc A1B = new C167948i2(this, 2);

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        ArrayList<String> arrayList;
        String stringExtra;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent2);
        if (i2 == -1 && this.A0K != null) {
            if (i == 3) {
                Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
                File file = null;
                if (intent != null) {
                    arrayList = intent2.getStringArrayListExtra("jids");
                } else {
                    arrayList = null;
                }
                ArrayList A0A2 = C22971Dz.A0A(cls, arrayList);
                if (!(intent == null || (stringExtra = intent2.getStringExtra("file_path")) == null)) {
                    file = C108945cZ.A17(stringExtra);
                }
                C20287AEv aEv = this.A0K;
                if (aEv != null) {
                    C33251iW r7 = this.A0B;
                    if (r7 != null) {
                        r7.A19.CGF(new C21472Akd(Uri.fromFile(file), r7, aEv, A4e(), (AnonymousClass206) null, (List) A0A2));
                    } else {
                        str = "userActions";
                    }
                }
                if (A0A2.size() == 1) {
                    AnonymousClass1L9 r3 = this.A01;
                    AnonymousClass00H r0 = this.A0w;
                    if (r0 != null) {
                        r3.A09(this, ((AnonymousClass1LU) r0.get()).A1w(this, (AnonymousClass1BI) A0A2.get(0), 0));
                        return;
                    }
                    str = "waIntents";
                } else {
                    A4U(A0A2);
                    return;
                }
            } else if (i == 66) {
                A1M a1m = this.A0I;
                if (a1m != null) {
                    a1m.A02(this, this.A0M, (AnonymousClass1BI) null, A4e(), C18070vi.A0M(this.A0K), 3, 0, 0);
                    return;
                }
                str = "catalogUtils";
            } else {
                return;
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        TextView textView;
        C18070vi.A0d(menu, 0);
        boolean A002 = AnonymousClass8GC.A00(this);
        boolean z = A4e() instanceof PhoneUserJid;
        MenuItem findItem = menu.findItem(2131432496);
        MenuItem findItem2 = menu.findItem(2131432516);
        MenuItem findItem3 = menu.findItem(2131432503);
        MenuItem findItem4 = menu.findItem(2131432513);
        boolean z2 = false;
        findItem.setVisible(false);
        findItem3.setVisible(A002);
        if (A002 && z) {
            z2 = true;
        }
        findItem2.setVisible(z2);
        A78 a78 = this.A0T;
        if (a78 != null) {
            findItem4.setVisible(a78.A04(A4e()));
            AnonymousClass8BY.A0i(findItem);
            View actionView = findItem.getActionView();
            if (actionView != null) {
                AnonymousClass3Ma.A1C(actionView, this, 40);
            }
            View actionView2 = findItem.getActionView();
            if (actionView2 != null) {
                textView = C17880vN.A0E(actionView2, 2131428886);
            } else {
                textView = null;
            }
            String str = this.A0y;
            if (!(str == null || textView == null)) {
                textView.setText(str);
            }
            C20339AGv.A00(this, A4b().A00, new C21533Alg(findItem3, findItem2, findItem, this, 0), 13);
            return super.onCreateOptionsMenu(menu);
        }
        C18070vi.A11("bizUtils");
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        String str2;
        MenuItem menuItem2 = menuItem;
        C18070vi.A0d(menuItem2, 0);
        if (16908332 == menuItem2.getItemId()) {
            onBackPressed();
        } else if (2131432513 != menuItem2.getItemId()) {
            if (2131432503 == menuItem2.getItemId()) {
                if (AnonymousClass8GC.A00(this)) {
                    A1M a1m = this.A0I;
                    if (a1m != null) {
                        a1m.A02(this, this.A0M, (AnonymousClass1BI) null, A4e(), C18070vi.A0M(this.A0K), 3, 0, 0);
                        return true;
                    }
                    str = "catalogUtils";
                }
            } else if (2131432516 != menuItem2.getItemId()) {
                return super.onOptionsItemSelected(menuItem2);
            } else {
                String str3 = this.A11;
                if (str3 != null) {
                    AnonymousClass00H r0 = this.A0w;
                    if (r0 != null) {
                        r0.get();
                        UserJid A4e = A4e();
                        Intent A0A2 = C17880vN.A0A();
                        A0A2.setClassName(getPackageName(), "com.whatsapp.ShareProductLinkActivity");
                        A0A2.setAction("android.intent.action.VIEW");
                        AnonymousClass3MY.A12(A0A2, A4e, "jid");
                        A0A2.putExtra("product_id", str3);
                        startActivity(A0A2);
                        return true;
                    }
                    str = "waIntents";
                }
            }
            C18070vi.A11(str);
            throw null;
        } else if (!A46() && (str2 = this.A11) != null) {
            UserJid A4e2 = A4e();
            Hilt_ProductMoreInfoFragment hilt_ProductMoreInfoFragment = new Hilt_ProductMoreInfoFragment();
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putParcelable("product_owner_jid", A4e2);
            A0D2.putString("product_id", str2);
            hilt_ProductMoreInfoFragment.A1R(A0D2);
            CMl(hilt_ProductMoreInfoFragment);
            return true;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r23 != null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0V(X.C20287AEv r21, X.C168648jP r22, java.util.List r23) {
        /*
            r5 = r22
            boolean r0 = r5.A19
            if (r0 != 0) goto L_0x00b4
            r4 = 0
            r7 = r21
            if (r23 == 0) goto L_0x0031
            if (r21 == 0) goto L_0x0031
            java.util.ArrayList r2 = X.C29351c6.A0D(r23)
            java.util.Iterator r1 = r23.iterator()
        L_0x0015:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r1.next()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r0 = r0.first
            r2.add(r0)
            goto L_0x0015
        L_0x0027:
            java.util.List r0 = X.C196509vB.A00(r7, r2)
            X.9qF r11 = new X.9qF
            r11.<init>(r2, r0)
            goto L_0x0034
        L_0x0031:
            r11 = r4
            if (r23 == 0) goto L_0x0055
        L_0x0034:
            int r0 = X.C200510q.A00(r23)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r0)
            java.util.Iterator r2 = r23.iterator()
        L_0x0041:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r2.next()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            r4.put(r1, r0)
            goto L_0x0041
        L_0x0055:
            X.00H r0 = r5.A0r
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r12 = r0.get()
            X.A41 r12 = (X.A41) r12
            com.whatsapp.jid.UserJid r13 = r5.A4e()
            r6 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            X.8F7 r0 = r5.A4b()
            X.1DT r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            boolean r10 = r1.equals(r0)
            java.lang.String r3 = r5.A10
            java.lang.String r2 = r5.A12
            java.lang.String r1 = r5.A0z
            X.8GC r9 = r5.A4d()
            X.00H r0 = r9.A0N
            java.lang.Object r8 = r0.get()
            X.96v r8 = (X.C1770196v) r8
            com.whatsapp.jid.UserJid r0 = r9.A0L
            java.lang.String r20 = X.A5T.A01(r8, r0)
            r23 = 12
            r14 = 0
            r0 = 31
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            if (r21 == 0) goto L_0x00a1
            boolean r0 = r7.A03()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
        L_0x00a1:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r10)
            r21 = 0
            r22 = r4
            r19 = r1
            r18 = r2
            r17 = r3
            X.A41.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r5.A19 = r6
        L_0x00b4:
            return
        L_0x00b5:
            java.lang.String r0 = "catalogVariantsAnalyticsLogger"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168648jP.A0V(X.AEv, X.8jP, java.util.List):void");
    }

    public static final void A0c(C168648jP r2) {
        WDSButton wDSButton;
        boolean z;
        C20287AEv aEv = r2.A0K;
        if (aEv == null || aEv.A00 != 0) {
            wDSButton = r2.A0i;
            z = false;
        } else {
            wDSButton = r2.A0i;
            z = true;
        }
        if (wDSButton != null) {
            wDSButton.setEnabled(z);
        }
        QuantitySelector quantitySelector = r2.A0Q;
        if (quantitySelector != null) {
            quantitySelector.setEnabled(z);
        }
    }

    public static final void A0d(C168648jP r6, AEW aew) {
        C20287AEv aEv;
        String str;
        VariantsCarouselBaseFragment hilt_VariantsCarouselFragment;
        Bundle A0D2;
        if (aew != null && (aEv = r6.A0K) != null && aEv.A03()) {
            AnonymousClass00H r0 = r6.A0o;
            if (r0 == null) {
                str = "catalogFeaturesEnableManager";
            } else if (((C19973A1i) r0.get()).A01(AnonymousClass8BV.A0B(r6).A09(r6.A4e()), aew)) {
                C28931bI r1 = r6.A0h;
                if (r1 != null) {
                    r1.A04(0);
                }
                if (r6.getSupportFragmentManager().A0O(2131428917) == null) {
                    C28931bI r02 = r6.A0h;
                    if (r02 != null) {
                        r02.A02();
                    }
                    AnonymousClass11S r2 = r6.A02;
                    C18070vi.A0W(r2);
                    AnonymousClass00H r03 = r6.A0n;
                    if (r03 != null) {
                        if (AnonymousClass9PM.A00(r2, (C20114A7x) C18070vi.A0E(r03), aew, r6.A4e())) {
                            if (C18020vd.A05(C18040vf.A02, r6.A0E, 8798)) {
                                UserJid A4e = r6.A4e();
                                hilt_VariantsCarouselFragment = new Hilt_VariantsCarouselFragmentV2();
                                A0D2 = C17880vN.A0D();
                                AnonymousClass3MY.A15(A0D2, A4e, "extra_product_owner_jid");
                                A0D2.putInt("extra_entry_point", 1);
                                hilt_VariantsCarouselFragment.A1R(A0D2);
                                hilt_VariantsCarouselFragment.A01 = new C20511ANw(r6, 0);
                                C34001jj A0H2 = AnonymousClass3Ma.A0H(r6);
                                A0H2.A0G = true;
                                A0H2.A0C(hilt_VariantsCarouselFragment, (String) null, 2131428917);
                                A0H2.A03();
                                return;
                            }
                        }
                        UserJid A4e2 = r6.A4e();
                        hilt_VariantsCarouselFragment = new Hilt_VariantsCarouselFragment();
                        A0D2 = C17880vN.A0D();
                        AnonymousClass3MY.A15(A0D2, A4e2, "extra_product_owner_jid");
                        hilt_VariantsCarouselFragment.A1R(A0D2);
                        hilt_VariantsCarouselFragment.A01 = new C20511ANw(r6, 0);
                        C34001jj A0H22 = AnonymousClass3Ma.A0H(r6);
                        A0H22.A0G = true;
                        A0H22.A0C(hilt_VariantsCarouselFragment, (String) null, 2131428917);
                        A0H22.A03();
                        return;
                    }
                    str = "catalogCacheManager";
                } else {
                    return;
                }
            } else {
                return;
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public static final void A0q(C168648jP r18, String str) {
        String str2;
        Set A002;
        int A1X;
        Number A1E;
        C168648jP r5 = r18;
        String str3 = str;
        r5.A11 = str3;
        C18030ve r2 = r5.A0E;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 10626) && !r5.A14) {
            AnonymousClass00H r0 = r5.A0r;
            if (r0 != null) {
                UserJid A4e = r5.A4e();
                String str4 = r5.A11;
                String str5 = r5.A10;
                String str6 = r5.A12;
                String str7 = r5.A0z;
                AnonymousClass8GC A4d = r5.A4d();
                A41.A00((C193529qF) null, (A41) r0.get(), A4e, (Boolean) null, (Boolean) null, (Integer) null, str5, str6, str7, A5T.A01((C1770196v) A4d.A0N.get(), A4d.A0L), str4, (Map) null, 54);
                r5.A14 = true;
            } else {
                str2 = "catalogVariantsAnalyticsLogger";
                C18070vi.A11(str2);
                throw null;
            }
        }
        r5.A03 = r5.getIntent().getIntExtra("thumb_width", AnonymousClass3MW.A01(r5.getResources(), 2131167707));
        r5.A00 = r5.getIntent().getIntExtra("thumb_height", AnonymousClass3MW.A01(r5.getResources(), 2131167707));
        C20114A7x A0B2 = AnonymousClass8BV.A0B(r5);
        long A012 = AnonymousClass11P.A01(A0B2.A00);
        C18030ve r22 = A0B2.A01;
        if (C18020vd.A05(r1, r22, 8209) && (A1E = C108945cZ.A1E(str3, A0B2.A07)) != null) {
            long longValue = A1E.longValue();
            if (A012 - longValue < TimeUnit.MINUTES.toMillis((long) C18020vd.A00(r1, r22, 12835))) {
                A1X = 4;
                r5.A01 = A1X;
                return;
            }
        }
        if (r5.A16 || !r5.A1A) {
            A002 = AnonymousClass9QG.A00();
        } else {
            A002 = C25511Om.A00;
        }
        AnonymousClass00H r02 = r5.A0s;
        if (r02 != null) {
            ((C192559ob) r02.get()).A01(r5.A4e(), A002, new C21530Ald(0, str3, r5));
            A1X = AnonymousClass000.A1X(r5.A0K);
            r5.A01 = A1X;
            return;
        }
        str2 = "catalogVariantsRequestDataProvider";
        C18070vi.A11(str2);
        throw null;
    }

    public static final void A0r(C168648jP r7, List list) {
        long j;
        long j2;
        WDSButton wDSButton;
        int i;
        C28931bI r0 = r7.A0c;
        if (r0 != null && r0.A0A()) {
            C20287AEv aEv = r7.A0K;
            if (aEv != null) {
                j = aEv.A01;
            } else {
                j = 99;
            }
            String str = r7.A11;
            if (str != null) {
                r7.A4b();
                j2 = AnonymousClass8F7.A00(str, list);
            } else {
                j2 = 0;
            }
            QuantitySelector quantitySelector = r7.A0Q;
            if (quantitySelector != null) {
                quantitySelector.A04(j2, j);
            }
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            QuantitySelector quantitySelector2 = r7.A0Q;
            if (i2 > 0) {
                if (quantitySelector2 != null) {
                    quantitySelector2.setVisibility(0);
                }
                wDSButton = r7.A0i;
                if (wDSButton != null) {
                    i = 16;
                } else {
                    return;
                }
            } else {
                C72453Mb.A1B(quantitySelector2);
                wDSButton = r7.A0i;
                if (wDSButton != null) {
                    i = 17;
                } else {
                    return;
                }
            }
            AnonymousClass3MZ.A1I(wDSButton, r7, i);
        }
    }

    public static final void A0s(C168648jP r6, boolean z) {
        WDSButton wDSButton;
        int i;
        int i2;
        C28931bI r0 = r6.A0c;
        if (r0 != null && r0.A0A()) {
            List list = r6.A13;
            String str = r6.A11;
            if (!(list == null || str == null)) {
                r6.A4b();
                if (AnonymousClass8F7.A00(str, list) > 0) {
                    WDSButton wDSButton2 = r6.A0i;
                    if (z) {
                        if (wDSButton2 != null) {
                            i2 = 2131887980;
                        } else {
                            return;
                        }
                    } else if (wDSButton2 != null) {
                        i2 = 2131894787;
                    } else {
                        return;
                    }
                    AnonymousClass3MY.A0y(r6, wDSButton2, new Object[]{r6.A0y}, i2);
                    return;
                }
            }
            if (!z) {
                AEW aew = (AEW) r6.A4d().A04.A06();
                AnonymousClass11S r2 = r6.A02;
                C18070vi.A0W(r2);
                AnonymousClass00H r02 = r6.A0n;
                if (r02 == null) {
                    C18070vi.A11("catalogCacheManager");
                    throw null;
                } else if (!AnonymousClass9PM.A00(r2, (C20114A7x) C18070vi.A0E(r02), aew, r6.A4e())) {
                    wDSButton = r6.A0i;
                    if (wDSButton != null) {
                        i = 2131887983;
                        wDSButton.setText(i);
                    }
                    return;
                }
            }
            wDSButton = r6.A0i;
            if (wDSButton != null) {
                i = 2131887984;
                wDSButton.setText(i);
            }
        }
    }

    public final AnonymousClass8F7 A4b() {
        AnonymousClass8F7 r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("cartMenuViewModel");
        throw null;
    }

    public final A8Q A4c() {
        A8Q a8q = this.A0L;
        if (a8q != null) {
            return a8q;
        }
        C18070vi.A11("catalogAnalyticManager");
        throw null;
    }

    public final AnonymousClass8GC A4d() {
        AnonymousClass8GC r0 = this.A0S;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("productViewModel");
        throw null;
    }

    public final UserJid A4e() {
        UserJid userJid = this.A0Z;
        if (userJid != null) {
            return userJid;
        }
        C18070vi.A11("productOwnerJid");
        throw null;
    }

    public final C20004A2u A4f() {
        C20004A2u a2u = this.A0b;
        if (a2u != null) {
            return a2u;
        }
        C18070vi.A11("bizQPLManager");
        throw null;
    }

    public void BuO(String str, int i) {
        String str2;
        if (C18070vi.A18(str, this.A11)) {
            A0V((C20287AEv) null, this, (List) null);
            this.A01 = 3;
            if (str != null) {
                AnonymousClass00H r0 = this.A0v;
                if (r0 != null) {
                    C17880vN.A0V(r0).notifyAllObservers(new C20726AWg(i, str, 1));
                } else {
                    str2 = "productObservers";
                    C18070vi.A11(str2);
                    throw null;
                }
            }
            AnonymousClass00H r02 = this.A0u;
            if (r02 != null) {
                B3T.A00(r02);
                A4f().A06("view_product_tag", false);
                return;
            }
            str2 = "openVariantsPageLogger";
            C18070vi.A11(str2);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        if (r4 != null) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BuP(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.A11
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 == 0) goto L_0x006c
            r3 = 1
            r6.A1A = r3
            r5 = 0
            r6.A01 = r5
            if (r7 == 0) goto L_0x001b
            X.00H r0 = r6.A0v
            if (r0 == 0) goto L_0x00a2
            X.10T r0 = X.C17880vN.A0V(r0)
            X.C20738AWt.A00(r0, r7, r3)
        L_0x001b:
            X.A7x r0 = X.AnonymousClass8BV.A0B(r6)
            r2 = 0
            X.AEv r4 = r0.A0A(r2, r7)
            if (r4 == 0) goto L_0x0080
            X.AE6 r0 = r4.A05
            if (r0 == 0) goto L_0x006d
            X.ADW r0 = r0.A00
            if (r0 == 0) goto L_0x006d
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x006d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x006d
            X.AE6 r0 = r4.A05
            if (r0 != 0) goto L_0x0080
            X.00H r0 = r6.A0u
            if (r0 == 0) goto L_0x0090
            java.lang.Object r1 = r0.get()
            X.9zy r1 = (X.C199419zy) r1
            X.B0X r0 = new X.B0X
            r0.<init>(r1, r5)
            X.C199419zy.A00(r1, r0)
        L_0x004e:
            boolean r0 = r4.A03()
            if (r0 != 0) goto L_0x0057
            A0V(r2, r6, r2)
        L_0x0057:
            X.A2u r1 = r6.A4f()
            java.lang.String r0 = "view_product_tag"
            r1.A06(r0, r3)
            if (r7 == 0) goto L_0x006c
            X.9g4 r1 = r6.A0R
            if (r1 == 0) goto L_0x008a
            com.whatsapp.jid.UserJid r0 = r6.A4e()
            r1.A00 = r0
        L_0x006c:
            return
        L_0x006d:
            X.00H r0 = r6.A0u
            if (r0 == 0) goto L_0x0096
            java.lang.Object r1 = r0.get()
            X.9zy r1 = (X.C199419zy) r1
            X.B0W r0 = new X.B0W
            r0.<init>(r1, r5)
            X.C199419zy.A00(r1, r0)
            goto L_0x004e
        L_0x0080:
            X.00H r0 = r6.A0u
            if (r0 == 0) goto L_0x009c
            X.B3T.A00(r0)
            if (r4 == 0) goto L_0x0057
            goto L_0x004e
        L_0x008a:
            java.lang.String r0 = "otherVariantsPreFetcher"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0090:
            java.lang.String r0 = "openVariantsPageLogger"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0096:
            java.lang.String r0 = "openVariantsPageLogger"
            X.C18070vi.A11(r0)
            throw r2
        L_0x009c:
            java.lang.String r0 = "openVariantsPageLogger"
            X.C18070vi.A11(r0)
            throw r2
        L_0x00a2:
            java.lang.String r0 = "productObservers"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168648jP.BuP(java.lang.String):void");
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        AE6 ae6;
        ADW adw;
        List list;
        AnonymousClass4WF.A00(this);
        super.onCreate(bundle);
        A4f().A01(774775607, "view_product_tag", "ProductBaseActivity");
        this.A02 = getIntent().getIntExtra("view_product_origin", 0);
        AnonymousClass00H r0 = this.A0m;
        if (r0 != null) {
            C17880vN.A0V(r0).registerObserver(this.A1B);
            UserJid A042 = UserJid.Companion.A04(C72453Mb.A0u(this));
            if (A042 != null) {
                this.A0Z = A042;
                String stringExtra = getIntent().getStringExtra("product");
                if (stringExtra != null) {
                    this.A11 = stringExtra;
                    this.A15 = getIntent().getBooleanExtra("disable_report", false);
                    this.A10 = getIntent().getStringExtra("collection_index");
                    this.A12 = getIntent().getStringExtra("product_index");
                    this.A0z = getIntent().getStringExtra("collection_id");
                    setContentView(2131624372);
                    this.A0O = (CatalogCarouselDetailImageView) findViewById(2131428887);
                    this.A0A = AnonymousClass8BR.A0H(this, 2131428892);
                    this.A07 = AnonymousClass3MX.A0L(this, 2131428890);
                    this.A0P = (EllipsizedTextEmojiLabel) findViewById(2131428888);
                    this.A06 = AnonymousClass3MX.A0L(this, 2131428889);
                    this.A08 = AnonymousClass3MX.A0L(this, 2131428891);
                    this.A0g = AnonymousClass3Ma.A0x(this, 2131432165);
                    this.A0e = AnonymousClass3Ma.A0x(this, 2131434123);
                    this.A0d = AnonymousClass3Ma.A0x(this, 2131434098);
                    this.A05 = (ScrollView) findViewById(2131433727);
                    C28931bI A0x2 = AnonymousClass3Ma.A0x(this, 2131435339);
                    this.A0f = AnonymousClass3Ma.A0x(this, 2131432161);
                    this.A0h = AnonymousClass3Ma.A0x(this, 2131428918);
                    this.A0c = AnonymousClass3Ma.A0x(this, 2131434275);
                    this.A17 = new C20302AFk(this, A0x2);
                    this.A18 = AnonymousClass3Ma.A0x(this, 2131432674);
                    Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131434111);
                    toolbar.setTitle((CharSequence) "");
                    toolbar.A0L();
                    C003401n A0K2 = AnonymousClass3MY.A0K(this, toolbar);
                    if (A0K2 != null) {
                        A0K2.A0W(true);
                    }
                    AnonymousClass3NL.A02(this, toolbar, this.A00, 2131231712);
                    this.A0K = AnonymousClass8BV.A0B(this).A0A(A4e(), this.A11);
                    C20005A2v a2v = this.A0M;
                    if (a2v != null) {
                        a2v.A02();
                    }
                    C191899nN r1 = this.A0N;
                    if (r1 != null) {
                        AnonymousClass00H r02 = this.A0p;
                        if (r02 != null) {
                            this.A0M = C20005A2v.A00(r1, r02);
                            AnonymousClass8BW.A0F(this).A08.add(this);
                            if (this.A02 == 6) {
                                C21445AkC.A01(this.A05, this, 10);
                            }
                            UserJid A4e = A4e();
                            B7A b7a = this.A0G;
                            if (b7a != null) {
                                AnonymousClass8F7 r03 = (AnonymousClass8F7) AHF.A00(this, b7a, A4e);
                                C18070vi.A0d(r03, 0);
                                this.A0H = r03;
                                C26911Ty r12 = this.A0E;
                                if (r12 != null) {
                                    C20987Acf A072 = r12.A07(A4e(), (String) null);
                                    C22417B6z b6z = this.A0C;
                                    if (b6z != null) {
                                        C192829p3 BGF = b6z.BGF(A4e());
                                        UserJid A4e2 = A4e();
                                        AnonymousClass10I r2 = this.A05;
                                        C18070vi.A0W(r2);
                                        C26911Ty r13 = this.A0E;
                                        if (r13 != null) {
                                            AnonymousClass00H r04 = this.A0x;
                                            if (r04 != null) {
                                                C20485AMw aMw = new C20485AMw(r13, A072, A4e2, r2, r04);
                                                AnonymousClass11S r30 = this.A02;
                                                C18070vi.A0W(r30);
                                                UserJid A4e3 = A4e();
                                                C24921Me r122 = this.A0X;
                                                if (r122 != null) {
                                                    AnonymousClass11E r15 = this.A07;
                                                    C18070vi.A0W(r15);
                                                    int i = this.A02;
                                                    AnonymousClass2UJ r11 = this.A0a;
                                                    if (r11 != null) {
                                                        C196149uX r6 = this.A0D;
                                                        if (r6 != null) {
                                                            AnonymousClass00H r05 = this.A0r;
                                                            if (r05 != null) {
                                                                A41 a41 = (A41) C18070vi.A0E(r05);
                                                                AnonymousClass00H r06 = this.A0k;
                                                                if (r06 != null) {
                                                                    C196469v7 r4 = (C196469v7) C18070vi.A0E(r06);
                                                                    AnonymousClass00H r07 = this.A0l;
                                                                    if (r07 != null) {
                                                                        C185479ce r3 = (C185479ce) C18070vi.A0E(r07);
                                                                        AnonymousClass10I r132 = this.A05;
                                                                        C18070vi.A0W(r132);
                                                                        AnonymousClass00H r22 = this.A0t;
                                                                        if (r22 != null) {
                                                                            AnonymousClass00H r08 = this.A0n;
                                                                            if (r08 != null) {
                                                                                C196469v7 r18 = r4;
                                                                                C185479ce r19 = r3;
                                                                                C20114A7x a7x = (C20114A7x) C18070vi.A0E(r08);
                                                                                C196149uX r17 = r6;
                                                                                AnonymousClass11S r152 = r30;
                                                                                AnonymousClass8GC r09 = (AnonymousClass8GC) AnonymousClass8BR.A0C(new AHC(r152, BGF, r17, r18, r19, a7x, a41, aMw, r15, r122, A4e3, r11, r132, r22, i), this).A00(AnonymousClass8GC.class);
                                                                                C18070vi.A0d(r09, 0);
                                                                                this.A0S = r09;
                                                                                C20339AGv.A00(this, A4d().A0A, C21535Ali.A00(this, 3), 13);
                                                                                C20339AGv.A00(this, A4d().A07, C21535Ali.A00(this, 4), 13);
                                                                                C20339AGv.A00(this, A4d().A09, C21535Ali.A00(this, 5), 13);
                                                                                C20339AGv.A00(this, A4d().A0D.A03, C21535Ali.A00(this, 6), 13);
                                                                                C20339AGv.A00(this, A4d().A0B, C21535Ali.A00(this, 7), 13);
                                                                                C20339AGv.A00(this, A4d().A04, C21535Ali.A00(this, 8), 13);
                                                                                boolean z = true;
                                                                                A4f().A05("view_product_tag", "IsConsumer", !this.A02.A0O(A4e()));
                                                                                C20004A2u A4f = A4f();
                                                                                if (this.A0K == null) {
                                                                                    z = false;
                                                                                }
                                                                                A4f.A05("view_product_tag", "Cached", z);
                                                                                int i2 = this.A02;
                                                                                switch (i2) {
                                                                                    case 1:
                                                                                    case 7:
                                                                                        str2 = "Message";
                                                                                        break;
                                                                                    case 2:
                                                                                        str2 = "EditProduct";
                                                                                        break;
                                                                                    case 3:
                                                                                    case 11:
                                                                                        str2 = "Catalog";
                                                                                        break;
                                                                                    case 4:
                                                                                        str2 = "ContactInfo";
                                                                                        break;
                                                                                    case 5:
                                                                                        str2 = "Product";
                                                                                        break;
                                                                                    case 6:
                                                                                        str2 = "Deeplink";
                                                                                        break;
                                                                                    case 8:
                                                                                        str2 = "Cart";
                                                                                        break;
                                                                                    case 9:
                                                                                        str2 = "Order";
                                                                                        break;
                                                                                    case 10:
                                                                                        str2 = "TrustCard";
                                                                                        break;
                                                                                    default:
                                                                                        throw AnonymousClass8BX.A0W("ProductDetailActivity/startViewProductQpl/Unexpected value: ", AnonymousClass000.A10(), i2);
                                                                                }
                                                                                A4f().A04("view_product_tag", "EntryPoint", str2);
                                                                                if (this.A11 != null) {
                                                                                    C187599g4 r14 = this.A0R;
                                                                                    if (r14 != null) {
                                                                                        r14.A00 = A4e();
                                                                                    } else {
                                                                                        str = "otherVariantsPreFetcher";
                                                                                    }
                                                                                }
                                                                                AnonymousClass00H r010 = this.A0u;
                                                                                if (r010 != null) {
                                                                                    ((C199419zy) r010.get()).A01(A4e());
                                                                                    C20287AEv aEv = this.A0K;
                                                                                    if (aEv != null && ((ae6 = aEv.A05) == null || (adw = ae6.A00) == null || (list = adw.A00) == null || list.isEmpty())) {
                                                                                        AnonymousClass00H r011 = this.A0u;
                                                                                        if (r011 != null) {
                                                                                            C199419zy r16 = (C199419zy) r011.get();
                                                                                            C199419zy.A00(r16, new B0W(r16, true));
                                                                                        }
                                                                                    }
                                                                                    C20485AMw aMw2 = A4d().A0I;
                                                                                    C21445AkC.A01(aMw2.A04, aMw2, 9);
                                                                                    return;
                                                                                }
                                                                                str = "openVariantsPageLogger";
                                                                            } else {
                                                                                str = "catalogCacheManager";
                                                                            }
                                                                        } else {
                                                                            str = "ctwaAdIdStoreLazy";
                                                                        }
                                                                    } else {
                                                                        str = "cartManager";
                                                                    }
                                                                } else {
                                                                    str = "cartItemsHasVariantsUsecase";
                                                                }
                                                            } else {
                                                                str = "catalogVariantsAnalyticsLogger";
                                                            }
                                                        } else {
                                                            str = "businessProfileHelper";
                                                        }
                                                    } else {
                                                        str = "orderFragments";
                                                    }
                                                } else {
                                                    str = "waContactNames";
                                                }
                                            } else {
                                                str = "wabme2LidMigrationHelper";
                                            }
                                        }
                                    } else {
                                        C18070vi.A11("catalogListRepositoryFactory");
                                        throw null;
                                    }
                                }
                                str = "businessProfileManager";
                            } else {
                                str = "cartMenuViewModelFactory";
                            }
                        } else {
                            str = "catalogImageLoadQplLogger";
                        }
                    } else {
                        str = "catalogMediaManager";
                    }
                } else {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            } else {
                throw AnonymousClass000.A0n("Required value was null.");
            }
        } else {
            str = "cartObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        CatalogMediaCard catalogMediaCard;
        AnonymousClass00H r0 = this.A0m;
        if (r0 != null) {
            C17880vN.A0V(r0).unregisterObserver(this.A1B);
            C28931bI r2 = this.A0e;
            if (!(r2 == null || !r2.A0A() || (catalogMediaCard = (CatalogMediaCard) r2.A02()) == null)) {
                catalogMediaCard.A01();
            }
            AnonymousClass8BW.A0F(this).A08.remove(this);
            C20005A2v a2v = this.A0M;
            if (a2v != null) {
                a2v.A02();
            }
            A4f().A06("view_product_tag", false);
            A4f().A06("cart_add_tag", false);
            super.onDestroy();
            return;
        }
        C18070vi.A11("cartObservers");
        throw null;
    }

    public void A4g() {
        C28931bI r1;
        int i;
        View A022;
        C20339AGv.A00(this, A4b().A00, C21535Ali.A00(this, 2), 13);
        if (!AnonymousClass8GC.A00(this) || this.A02.A0O(A4e())) {
            r1 = this.A18;
            if (r1 != null) {
                i = 8;
            } else {
                return;
            }
        } else {
            C28931bI r2 = this.A18;
            if (!(r2 == null || r2.A0A() || (A022 = r2.A02()) == null)) {
                AnonymousClass3Ma.A1C(A022, this, 39);
            }
            r1 = this.A18;
            if (r1 != null) {
                i = 0;
            } else {
                return;
            }
        }
        r1.A04(i);
    }

    public void onPause() {
        ScrollView scrollView;
        ViewTreeObserver viewTreeObserver;
        super.onPause();
        if (this.A17 != null && (scrollView = this.A05) != null && (viewTreeObserver = scrollView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnScrollChangedListener(this.A17);
        }
    }

    public void onResume() {
        ScrollView scrollView;
        ViewTreeObserver viewTreeObserver;
        super.onResume();
        A4g();
        A4d().A0D.A00();
        if (this.A17 != null && (scrollView = this.A05) != null && (viewTreeObserver = scrollView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnScrollChangedListener(this.A17);
        }
    }

    public void onStart() {
        super.onStart();
        String str = this.A11;
        if (str != null) {
            A0q(this, str);
        }
    }
}
