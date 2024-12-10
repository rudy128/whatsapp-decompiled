package com.whatsapp.stickers.store.preview;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass11J;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1SB;
import X.AnonymousClass1Y5;
import X.AnonymousClass205;
import X.AnonymousClass2LK;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4aU;
import X.AnonymousClass6H5;
import X.AnonymousClass6LG;
import X.AnonymousClass6RG;
import X.AnonymousClass725;
import X.AnonymousClass74O;
import X.AnonymousClass78P;
import X.AnonymousClass7AS;
import X.AnonymousClass7L4;
import X.AnonymousClass7MT;
import X.AnonymousClass7RI;
import X.AnonymousClass7RO;
import X.AnonymousClass81P;
import X.C000200d;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C108995ce;
import X.C109005cf;
import X.C112345lK;
import X.C112735lx;
import X.C123636Vf;
import X.C124176Xi;
import X.C126616d1;
import X.C135906sx;
import X.C1423379b;
import X.C145717Mi;
import X.C1597685u;
import X.C1597885w;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C219217x;
import X.C24481Km;
import X.C25291Nq;
import X.C26631Sw;
import X.C28931bI;
import X.C30391dr;
import X.C41561wd;
import X.C50522Ut;
import X.C59732mn;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C90594eK;
import X.C98494rF;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public final class StickerStorePackPreviewActivity extends AnonymousClass1FY implements AnonymousClass11J, C1597685u, C1597885w {
    public View A00;
    public ImageView A01;
    public RecyclerView A02;
    public AnonymousClass6RG A03;
    public AnonymousClass205 A04;
    public C24481Km A05;
    public C90594eK A06;
    public C26631Sw A07;
    public AnonymousClass1SB A08;
    public C50522Ut A09;
    public C112345lK A0A;
    public StickerStorePackPreviewViewModel A0B;
    public WDSButton A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public String A0T;
    public String A0U;
    public boolean A0V;
    public boolean A0W;
    public View A0X;
    public View A0Y;
    public View A0Z;
    public TextView A0a;
    public TextView A0b;
    public TextView A0c;
    public C28931bI A0d;
    public WDSButton A0e;
    public WDSButton A0f;
    public boolean A0g;
    public final C126616d1 A0h;
    public final AnonymousClass6LG A0i;
    public final AnonymousClass6LG A0j;
    public final C112735lx A0k;
    public final AnonymousClass7L4 A0l;
    public final AnonymousClass6H5 A0m;

    public void Bps(C59732mn r2) {
        C18070vi.A0d(r2, 0);
        if (r2.A02) {
            A0V(this);
            C112345lK r0 = this.A0A;
            if (r0 != null) {
                r0.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (X.C25291Nq.A04(r1, 10692) != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r9) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            X.00H r0 = r8.A0J
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r0.get()
            X.6pv r0 = (X.C134046pv) r0
            java.lang.String r1 = r8.A0T
            java.lang.String r3 = "packId"
            r7 = 0
            if (r1 == 0) goto L_0x00b7
            java.lang.String r0 = r0.A01()
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 != 0) goto L_0x00b2
            android.view.MenuInflater r1 = r8.getMenuInflater()
            r0 = 2131820591(0x7f11002f, float:1.9273901E38)
            r1.inflate(r0, r9)
            r0 = 2131432517(0x7f0b1445, float:1.8486794E38)
            android.view.MenuItem r2 = r9.findItem(r0)
            X.6RG r1 = r8.A03
            if (r1 != 0) goto L_0x003a
            java.lang.String r0 = "stickerPackPreviewSource"
            X.C18070vi.A11(r0)
            throw r7
        L_0x003a:
            X.6RG r0 = X.AnonymousClass6RG.FULL_TEXT_SEARCH
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            r2.setVisible(r0)
            java.lang.String r2 = r8.A0T
            if (r2 == 0) goto L_0x00b7
            r1 = 0
            java.lang.String r0 = " "
            boolean r0 = X.AnonymousClass1YF.A0Y(r2, r0, r1)
            if (r0 == 0) goto L_0x005d
            X.0ve r1 = r8.A0E
            X.C18070vi.A0W(r1)
            r0 = 10692(0x29c4, float:1.4983E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 == 0) goto L_0x00b2
        L_0x005d:
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r0 = r8.A0B
            java.lang.String r6 = "viewModel"
            if (r0 != 0) goto L_0x0067
            X.C18070vi.A11(r6)
            throw r7
        L_0x0067:
            X.1DT r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            boolean r5 = r0 instanceof X.C145707Mh
            r0 = 2131432520(0x7f0b1448, float:1.84868E38)
            android.view.MenuItem r4 = r9.findItem(r0)
            android.graphics.drawable.Drawable r0 = r4.getIcon()
            if (r0 == 0) goto L_0x007f
            r0.mutate()
        L_0x007f:
            android.graphics.drawable.Drawable r3 = r4.getIcon()
            if (r3 == 0) goto L_0x008b
            if (r5 == 0) goto L_0x0093
            r2 = r7
        L_0x0088:
            r3.setColorFilter(r2)
        L_0x008b:
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r0 = r8.A0B
            if (r0 != 0) goto L_0x00a2
            X.C18070vi.A11(r6)
            throw r7
        L_0x0093:
            r0 = 2131103156(0x7f060db4, float:1.781877E38)
            int r1 = X.C19740yt.A00(r8, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r1, r0)
            goto L_0x0088
        L_0x00a2:
            X.1DT r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            boolean r0 = r0 instanceof X.C145717Mi
            r0 = r0 ^ 1
            r4.setVisible(r0)
            r4.setEnabled(r5)
        L_0x00b2:
            boolean r0 = super.onCreateOptionsMenu(r9)
            return r0
        L_0x00b7:
            X.C18070vi.A11(r3)
            throw r7
        L_0x00bb:
            java.lang.String r0 = "funStickerPack"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        Intent intent;
        int A012 = AnonymousClass3MY.A01(menuItem, 0);
        if (A012 == 2131432517) {
            AnonymousClass7RI.A01(this.A05, this, 29);
        } else if (A012 != 2131432520) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            AnonymousClass00H r0 = this.A0H;
            if (r0 != null) {
                C108945cZ.A0e(r0).A03(31, 1, 8);
                StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel = this.A0B;
                if (stickerStorePackPreviewViewModel == null) {
                    str = "viewModel";
                } else {
                    AnonymousClass725 A0T2 = stickerStorePackPreviewViewModel.A0T();
                    if (A0T2 != null) {
                        AnonymousClass00H r02 = this.A0R;
                        if (r02 != null) {
                            C219217x r03 = (C219217x) C18070vi.A0E(r02);
                            boolean A17 = C18070vi.A17(this, r03);
                            if (!r03.A0G()) {
                                intent = AnonymousClass74O.A03(this, 2131894471, C123636Vf.A00(), false);
                            } else if (A17) {
                                if (!A0T2.A0W) {
                                    AnonymousClass00H r04 = this.A0Q;
                                    if (r04 != null) {
                                        r04.get();
                                        Object[] objArr = new Object[1];
                                        String str2 = this.A0T;
                                        if (str2 == null) {
                                            str = "packId";
                                        } else {
                                            String format = String.format("https://wa.me/stickerpack/%s", C108945cZ.A1b(str2, objArr, 0, 1));
                                            C18070vi.A0X(format);
                                            intent = AnonymousClass1LU.A1J(this, format);
                                        }
                                    }
                                } else {
                                    C18030ve r1 = this.A0E;
                                    C18070vi.A0W(r1);
                                    if (C25291Nq.A04(r1, 10692)) {
                                        LinkedHashSet A14 = C17880vN.A14();
                                        LinkedHashSet A142 = C17880vN.A14();
                                        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(this.A0U);
                                        if (A022 != null) {
                                            A142.add(A022);
                                        }
                                        A14.add(105);
                                        AnonymousClass00H r05 = this.A0Q;
                                        if (r05 != null) {
                                            r05.get();
                                            ArrayList A10 = C17880vN.A10(A142);
                                            ArrayList A102 = C17880vN.A10(A14);
                                            Intent A0B2 = C72483Me.A0B(this, "com.whatsapp.contact.picker.ContactPicker", 1);
                                            C108995ce.A0n(A0B2, true, A102);
                                            C108965cb.A10(A0B2, A10);
                                            startActivityForResult(A0B2, 1);
                                            return true;
                                        }
                                    }
                                }
                                str = "waIntents";
                            }
                            startActivity(intent);
                            return true;
                        }
                        str = "waPermissionsHelper";
                    }
                }
            } else {
                str = "expressionUserJourneyLogger";
            }
            C18070vi.A11(str);
            throw null;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(X.AnonymousClass725 r5) {
        /*
            r4 = this;
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r0 = r4.A0B
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "viewModel"
        L_0x0006:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x000b:
            X.1DT r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            boolean r0 = r0 instanceof X.C145677Me
            r3 = 8
            r2 = 0
            X.1bI r1 = r4.A0d
            if (r0 == 0) goto L_0x0098
            if (r1 == 0) goto L_0x0025
            android.view.View r0 = r1.A02()
            if (r0 == 0) goto L_0x0025
            r0.setVisibility(r2)
        L_0x0025:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A02
            if (r0 == 0) goto L_0x002c
            r0.setVisibility(r3)
        L_0x002c:
            boolean r0 = r5.A0W
            if (r0 != 0) goto L_0x0096
            java.lang.String r2 = r5.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0096
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "https://static.whatsapp.net/sticker?img="
            java.lang.String r3 = X.AnonymousClass001.A1H(r0, r2, r1)
        L_0x0042:
            X.0ve r1 = r4.A0E
            r0 = 5693(0x163d, float:7.978E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x005e
            X.0ve r1 = r4.A0E
            r0 = 6785(0x1a81, float:9.508E-42)
            java.lang.String r0 = X.C18020vd.A01(r2, r1, r0)
            if (r0 == 0) goto L_0x005e
            if (r3 == 0) goto L_0x0081
            java.lang.String r3 = X.C17900vP.A0A(r3, r0)
        L_0x005e:
            if (r3 == 0) goto L_0x0081
            X.1Km r0 = r4.A05
            if (r0 == 0) goto L_0x00be
            java.lang.String r3 = r0.A01(r3)
            if (r3 == 0) goto L_0x0081
            X.0ve r1 = r4.A0E
            r0 = 7296(0x1c80, float:1.0224E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x00b0
            X.10I r2 = r4.A05
            r1 = 19
            X.7RS r0 = new X.7RS
            r0.<init>(r1, r3, r4)
            r2.CGF(r0)
        L_0x0080:
            return
        L_0x0081:
            android.widget.ImageView r3 = r4.A01
            if (r3 == 0) goto L_0x0080
            X.1SB r2 = r4.A08
            if (r2 == 0) goto L_0x00c2
            java.lang.String r1 = X.AnonymousClass725.A00(r5)
            X.7MZ r0 = new X.7MZ
            r0.<init>(r3, r1)
            r2.A0F(r5, r0)
            return
        L_0x0096:
            r3 = 0
            goto L_0x0042
        L_0x0098:
            if (r1 == 0) goto L_0x00a7
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x00a7
            android.view.View r0 = r1.A02()
            if (r0 == 0) goto L_0x00a7
            r0.setVisibility(r3)
        L_0x00a7:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A02
            if (r0 == 0) goto L_0x002c
            r0.setVisibility(r2)
            goto L_0x002c
        L_0x00b0:
            X.1SB r0 = r4.A08
            if (r0 == 0) goto L_0x00c2
            X.4VT r1 = r0.A08()
            android.widget.ImageView r0 = r4.A01
            r1.A03(r0, r3)
            return
        L_0x00be:
            java.lang.String r0 = "staticContentUrlGenerator"
            goto L_0x0006
        L_0x00c2:
            java.lang.String r0 = "stickerRepository"
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.A03(X.725):void");
    }

    public static final void A0Q(StickerStorePackPreviewActivity stickerStorePackPreviewActivity) {
        AnonymousClass205 r5 = stickerStorePackPreviewActivity.A04;
        String str = "viewModel";
        StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel = stickerStorePackPreviewActivity.A0B;
        if (r5 != null) {
            if (stickerStorePackPreviewViewModel != null) {
                stickerStorePackPreviewViewModel.A00.A0F(C145717Mi.A00);
                AnonymousClass3MW.A1X(stickerStorePackPreviewViewModel.A06, new StickerStorePackPreviewViewModel$loadStickerPack$2(r5, stickerStorePackPreviewViewModel, (C30391dr) null), C41561wd.A00(stickerStorePackPreviewViewModel));
                return;
            }
        } else if (stickerStorePackPreviewViewModel != null) {
            String str2 = stickerStorePackPreviewActivity.A0T;
            if (str2 == null) {
                str = "packId";
            } else {
                stickerStorePackPreviewViewModel.A00.A0F(C145717Mi.A00);
                stickerStorePackPreviewViewModel.A04.A0G(new AnonymousClass7MT(stickerStorePackPreviewViewModel), str2, true);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b2, code lost:
        if (r7.A02 != 0) goto L_0x00b4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0V(com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r18) {
        /*
            r3 = r18
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L_0x0266
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r0 = r3.A0B
            java.lang.String r12 = "viewModel"
            if (r0 == 0) goto L_0x0261
            X.725 r7 = r0.A0T()
            r4 = 8
            r2 = 0
            if (r7 == 0) goto L_0x0213
            android.view.View r0 = r3.A0Z
            if (r0 == 0) goto L_0x001e
            r0.setVisibility(r4)
        L_0x001e:
            android.view.View r0 = r3.A0X
            if (r0 == 0) goto L_0x0025
            r0.setVisibility(r2)
        L_0x0025:
            android.widget.TextView r5 = r3.A0b
            if (r5 == 0) goto L_0x006d
            X.6RG r1 = r3.A03
            java.lang.String r0 = "stickerPackPreviewSource"
            if (r1 != 0) goto L_0x0034
            X.C18070vi.A11(r0)
        L_0x0032:
            r0 = 0
            throw r0
        L_0x0034:
            X.6RG r0 = X.AnonymousClass6RG.STICKER_STORE_MY_TAB
            if (r1 == r0) goto L_0x0204
            boolean r0 = r7.A0O
            if (r0 != 0) goto L_0x0208
        L_0x003c:
            r0 = 0
        L_0x003d:
            java.lang.String r15 = r7.A04
            if (r0 == 0) goto L_0x006a
            r1 = 2131233039(0x7f08090f, float:1.8082204E38)
            r0 = 2131102619(0x7f060b9b, float:1.7817681E38)
            android.graphics.drawable.Drawable r14 = X.AnonymousClass4aX.A02(r3, r1, r0)
            android.text.TextPaint r13 = r5.getPaint()
            int r0 = r15.length()
            int r17 = r0 + 1
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r15)
            java.lang.String r0 = "  "
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            int r18 = r17 + 1
            android.text.SpannableStringBuilder r15 = X.AnonymousClass3MW.A09(r0)
            r16 = -1
            X.C72813Np.A04(r13, r14, r15, r16, r17, r18)
        L_0x006a:
            r5.setText(r15)
        L_0x006d:
            android.widget.TextView r9 = r3.A0c
            r10 = 0
            r6 = 1
            if (r9 == 0) goto L_0x009e
            long r0 = r7.A02
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x01f7
            X.0vb r5 = r3.A00
            java.lang.String r8 = X.C88584aA.A02(r5, r0)
            X.C18070vi.A0X(r8)
            java.lang.String r5 = r7.A0K
            if (r5 == 0) goto L_0x009b
            int r0 = r5.length()
            if (r0 == 0) goto L_0x009b
            r1 = 2131896453(0x7f122885, float:1.9427768E38)
            java.lang.Object[] r0 = X.AnonymousClass3MX.A1b(r5, r2)
            java.lang.String r8 = X.C17880vN.A0q(r3, r8, r0, r6, r1)
            X.C18070vi.A0b(r8)
        L_0x009b:
            r9.setText(r8)
        L_0x009e:
            android.widget.TextView r8 = r3.A0c
            if (r8 == 0) goto L_0x00b8
            java.lang.String r0 = r7.A0K
            if (r0 == 0) goto L_0x00ac
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00b4
        L_0x00ac:
            long r0 = r7.A02
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r0 = 8
            if (r5 == 0) goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            r8.setVisibility(r0)
        L_0x00b8:
            android.widget.TextView r1 = r3.A0a
            if (r1 == 0) goto L_0x00c1
            java.lang.String r0 = r7.A0D
            r1.setText(r0)
        L_0x00c1:
            android.widget.TextView r5 = r3.A0a
            if (r5 == 0) goto L_0x00cf
            java.lang.String r1 = r7.A0D
            r0 = 8
            if (r1 == 0) goto L_0x00cc
            r0 = 0
        L_0x00cc:
            r5.setVisibility(r0)
        L_0x00cf:
            r3.A03(r7)
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r0 = r3.A0B
            if (r0 == 0) goto L_0x0261
            X.1DT r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            boolean r0 = r0 instanceof X.C145717Mi
            if (r0 != 0) goto L_0x020b
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r0 = r3.A0B
            if (r0 == 0) goto L_0x0261
            X.1DT r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            boolean r0 = r0 instanceof X.C145697Mg
            if (r0 != 0) goto L_0x020b
            boolean r0 = r7.A09
            if (r0 != 0) goto L_0x020b
            boolean r0 = r3.A0W
            if (r0 != 0) goto L_0x020b
            boolean r0 = A0q(r3)
            if (r0 == 0) goto L_0x0132
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0e
            if (r0 == 0) goto L_0x0103
            r0.setVisibility(r4)
        L_0x0103:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0C
            if (r0 == 0) goto L_0x010a
            r0.setVisibility(r4)
        L_0x010a:
            android.view.View r0 = r3.A0Y
            if (r0 == 0) goto L_0x0111
            r0.setVisibility(r4)
        L_0x0111:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0f
            if (r0 == 0) goto L_0x0118
            r0.setVisibility(r2)
        L_0x0118:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0f
            if (r0 == 0) goto L_0x011f
            r0.setClickable(r6)
        L_0x011f:
            A0d(r3, r2)
            r3.A03(r7)
        L_0x0125:
            r0 = 2131432520(0x7f0b1448, float:1.84868E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x0266
            X.AnonymousClass3MW.A1Q(r0)
            return
        L_0x0132:
            android.view.View r0 = r3.A0Y
            if (r0 == 0) goto L_0x0139
            r0.setVisibility(r4)
        L_0x0139:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0f
            if (r0 == 0) goto L_0x0140
            r0.setVisibility(r4)
        L_0x0140:
            java.lang.String r0 = r7.A03
            if (r0 != 0) goto L_0x014c
            boolean r0 = r7.A0W
            if (r0 == 0) goto L_0x018b
            boolean r0 = r7.A0V
            if (r0 != 0) goto L_0x018b
        L_0x014c:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0C
            if (r0 == 0) goto L_0x0153
            r0.setVisibility(r4)
        L_0x0153:
            r0 = 2131896455(0x7f122887, float:1.9427772E38)
            java.lang.String r1 = X.C18070vi.A0F(r3, r0)
            r0 = 2131896456(0x7f122888, float:1.9427774E38)
            java.lang.String r0 = X.C18070vi.A0F(r3, r0)
            X.0yx r4 = new X.0yx
            r4.<init>(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r3.A0e
            if (r1 == 0) goto L_0x0171
            java.lang.Object r0 = r4.A00
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L_0x0171:
            com.whatsapp.wds.components.button.WDSButton r1 = r3.A0e
            if (r1 == 0) goto L_0x017c
            java.lang.Object r0 = r4.A01
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setContentDescription(r0)
        L_0x017c:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0e
            if (r0 == 0) goto L_0x0183
            r0.setClickable(r6)
        L_0x0183:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0e
        L_0x0185:
            if (r0 == 0) goto L_0x0125
            r0.setVisibility(r2)
            goto L_0x0125
        L_0x018b:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0e
            if (r0 == 0) goto L_0x0192
            r0.setVisibility(r4)
        L_0x0192:
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r0 = r3.A0B
            if (r0 == 0) goto L_0x0261
            X.1DT r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            boolean r5 = r0 instanceof X.C145677Me
            if (r5 == 0) goto L_0x01ce
            r0 = 2131896458(0x7f12288a, float:1.9427778E38)
            java.lang.String r0 = X.C18070vi.A0F(r3, r0)
            X.0yx r4 = new X.0yx
            r4.<init>(r0, r0)
        L_0x01ac:
            com.whatsapp.wds.components.button.WDSButton r1 = r3.A0C
            if (r1 == 0) goto L_0x01c8
            java.lang.Object r0 = r4.A00
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            java.lang.Object r0 = r4.A01
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setContentDescription(r0)
            r1.setClickable(r6)
            if (r5 == 0) goto L_0x01cb
            X.6LG r0 = r3.A0j
        L_0x01c5:
            r1.setOnClickListener(r0)
        L_0x01c8:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0C
            goto L_0x0185
        L_0x01cb:
            X.6LG r0 = r3.A0i
            goto L_0x01c5
        L_0x01ce:
            java.lang.String r0 = r7.A03
            if (r0 == 0) goto L_0x01ec
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x01ec
            r0 = 2131896459(0x7f12288b, float:1.942778E38)
            java.lang.String r1 = X.C18070vi.A0F(r3, r0)
            r0 = 2131896460(0x7f12288c, float:1.9427782E38)
        L_0x01e2:
            java.lang.String r0 = X.C18070vi.A0F(r3, r0)
            X.0yx r4 = new X.0yx
            r4.<init>(r1, r0)
            goto L_0x01ac
        L_0x01ec:
            r0 = 2131896437(0x7f122875, float:1.9427735E38)
            java.lang.String r1 = X.C18070vi.A0F(r3, r0)
            r0 = 2131896438(0x7f122876, float:1.9427737E38)
            goto L_0x01e2
        L_0x01f7:
            r5 = 2131896452(0x7f122884, float:1.9427766E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r7.A0K
            java.lang.String r8 = X.C17880vN.A0q(r3, r0, r1, r2, r5)
            goto L_0x009b
        L_0x0204:
            boolean r0 = r7.A0Q
            if (r0 == 0) goto L_0x003c
        L_0x0208:
            r0 = 1
            goto L_0x003d
        L_0x020b:
            boolean r0 = r7.A0S
            if (r0 == 0) goto L_0x0223
            A0d(r3, r6)
            return
        L_0x0213:
            android.view.View r1 = r3.A0Z
            if (r1 == 0) goto L_0x0266
            android.view.View r0 = r3.A0X
            if (r0 == 0) goto L_0x0266
            r1.setVisibility(r2)
            android.view.View r1 = r3.A0X
            if (r1 != 0) goto L_0x025d
            return
        L_0x0223:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0C
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x022c
            r0.setText(r1)
        L_0x022c:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0C
            if (r0 == 0) goto L_0x0233
            r0.setClickable(r2)
        L_0x0233:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0e
            if (r0 == 0) goto L_0x023a
            r0.setText(r1)
        L_0x023a:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0e
            if (r0 == 0) goto L_0x0241
            r0.setClickable(r2)
        L_0x0241:
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0f
            if (r0 == 0) goto L_0x0248
            r0.setClickable(r2)
        L_0x0248:
            android.view.View r1 = r3.A0Y
            if (r1 == 0) goto L_0x0266
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel r0 = r3.A0B
            if (r0 == 0) goto L_0x0261
            X.1DT r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            boolean r0 = r0 instanceof X.AnonymousClass6IK
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x025d
            r4 = 0
        L_0x025d:
            r1.setVisibility(r4)
            return
        L_0x0261:
            X.C18070vi.A11(r12)
            goto L_0x0032
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.A0V(com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity):void");
    }

    public static final void A0d(StickerStorePackPreviewActivity stickerStorePackPreviewActivity, boolean z) {
        StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel = stickerStorePackPreviewActivity.A0B;
        if (stickerStorePackPreviewViewModel == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        AnonymousClass725 A0T2 = stickerStorePackPreviewViewModel.A0T();
        if (A0T2 != null && A0T2.A07 != null) {
            ImageView imageView = stickerStorePackPreviewActivity.A01;
            if (imageView != null) {
                imageView.setImageResource(2131233042);
            }
            C112345lK r2 = stickerStorePackPreviewActivity.A0A;
            if (r2 != null) {
                List<C135906sx> list = r2.A03;
                if (list == null) {
                    list = AnonymousClass000.A13();
                }
                for (C135906sx r0 : list) {
                    r0.A00 = z;
                }
                r2.notifyDataSetChanged();
            }
        }
    }

    public static final boolean A0q(StickerStorePackPreviewActivity stickerStorePackPreviewActivity) {
        if (!stickerStorePackPreviewActivity.A02.A0N()) {
            if (C18020vd.A05(C18040vf.A02, stickerStorePackPreviewActivity.A0E, 1396)) {
                String str = stickerStorePackPreviewActivity.A0T;
                if (str == null) {
                    C18070vi.A11("packId");
                    throw null;
                } else if (!str.equals("meta-avatar")) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public void A2y() {
        if (!this.A0g) {
            this.A0g = true;
            AnonymousClass1K1 A0K2 = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K2, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r3 = A0A2.A00;
            C109005cf.A0d(A0A2, r3, this);
            C109005cf.A0e(A0A2, r3, this, r3.A5A);
            this.A0D = C000200d.A00(A0A2.A0R);
            this.A0E = C000200d.A00(A0K2.A09);
            this.A0F = C000200d.A00(A0A2.ADn);
            this.A0G = C000200d.A00(A0A2.A0V);
            this.A0H = C108965cb.A0j(r3);
            this.A0I = AnonymousClass3MX.A12(A0A2);
            this.A0J = C000200d.A00(A0K2.A44);
            this.A05 = (C24481Km) A0A2.AA8.get();
            this.A0K = C000200d.A00(A0A2.Ajr);
            this.A07 = C108965cb.A0a(A0A2);
            this.A09 = (C50522Ut) A0K2.A0B.get();
            this.A0L = C000200d.A00(A0A2.AAP);
            this.A0M = C000200d.A00(A0A2.AAQ);
            this.A0N = C000200d.A00(A0K2.A5t);
            this.A0O = C000200d.A00(A0A2.Ak2);
            this.A08 = (AnonymousClass1SB) A0A2.AAS.get();
            this.A0P = C000200d.A00(A0A2.ABA);
            this.A0Q = AnonymousClass3MW.A0s(A0A2);
            this.A0R = C000200d.A00(A0A2.ABj);
            this.A0S = C000200d.A00(A0A2.A9B);
        }
    }

    public StickerStorePackPreviewActivity(int i) {
        this.A0g = false;
        C1423379b.A00(this, 0);
    }

    public static final void A0c(StickerStorePackPreviewActivity stickerStorePackPreviewActivity, CharSequence charSequence) {
        View A0H2 = AnonymousClass3MY.A0H(stickerStorePackPreviewActivity, 2131435747);
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass11C r0 = stickerStorePackPreviewActivity.A08;
        C18070vi.A0X(r0);
        C90594eK A002 = C124176Xi.A00(A0H2, stickerStorePackPreviewActivity, r0, charSequence, A13);
        A002.A07(AnonymousClass7RI.A00(stickerStorePackPreviewActivity, 30));
        A002.A03();
        stickerStorePackPreviewActivity.A06 = A002;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 28) {
            finish();
        }
        C98494rF A002 = C98494rF.A00();
        StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel = this.A0B;
        if (stickerStorePackPreviewViewModel == null) {
            str = "viewModel";
        } else {
            AnonymousClass725 A0T2 = stickerStorePackPreviewViewModel.A0T();
            if (A0T2 != null) {
                A002.element = A0T2;
                if (i == 1 && intent != null && i2 == -1) {
                    ArrayList A0r = C72463Mc.A0r(intent, AnonymousClass1BI.class);
                    AnonymousClass7RO.A02(this.A05, A002, this, A0r, 9);
                    int size = A0r.size();
                    AnonymousClass1L9 r1 = this.A01;
                    AnonymousClass00H r0 = this.A0Q;
                    if (r0 != null) {
                        AnonymousClass1LU A0h2 = C108945cZ.A0h(r0);
                        if (size == 1) {
                            C72473Md.A0q(this, r1, A0h2, A0r);
                            return;
                        }
                        r1.A09(this, C108985cd.A0B(this));
                        CPW(A0r, 1);
                        return;
                    }
                    str = "waIntents";
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        setContentView(2131627119);
        this.A0B = (StickerStorePackPreviewViewModel) AnonymousClass3MW.A0N(this).A00(StickerStorePackPreviewViewModel.class);
        this.A03 = (AnonymousClass6RG) AnonymousClass6RG.A00.get(getIntent().getIntExtra("sticker_pack_preview_source", 0));
        String stringExtra = getIntent().getStringExtra("sticker_pack_id");
        if (stringExtra != null) {
            this.A0T = stringExtra;
            AnonymousClass205 A022 = AnonymousClass4aU.A02(getIntent());
            this.A04 = A022;
            if (A022 != null) {
                AnonymousClass6RG r2 = this.A03;
                String str3 = null;
                if (r2 == null) {
                    C18070vi.A11("stickerPackPreviewSource");
                    throw null;
                } else if (r2 == AnonymousClass6RG.STICKER_PACK_MESSAGE) {
                    AnonymousClass1BI r0 = A022.A00;
                    if (r0 != null) {
                        str3 = r0.getRawString();
                    }
                    this.A0U = str3;
                }
            } else {
                this.A0U = getIntent().getStringExtra("sticker_pack_raw_chat_jid");
            }
            StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel = this.A0B;
            if (stickerStorePackPreviewViewModel == null) {
                str = "viewModel";
            } else {
                AnonymousClass7AS.A00(this, stickerStorePackPreviewViewModel.A00, new AnonymousClass81P(this), 22);
                AnonymousClass00H r02 = this.A0L;
                if (r02 != null) {
                    ((AnonymousClass2LK) r02.get()).registerObserver(this.A0m);
                    if (A0q(this)) {
                        AnonymousClass00H r03 = this.A0F;
                        if (r03 != null) {
                            C17880vN.A0V(r03).registerObserver(this.A0l);
                        } else {
                            str = "avatarEventObservers";
                        }
                    }
                    A0Q(this);
                    Toolbar toolbar = (Toolbar) this.A00.findViewById(2131436270);
                    C109005cf.A0O(this, toolbar, this.A00);
                    toolbar.setTitle(2131896508);
                    toolbar.setNavigationContentDescription(2131896450);
                    toolbar.setNavigationOnClickListener(new AnonymousClass78P((Object) this, 31));
                    AnonymousClass1Y5.A0A(toolbar, true);
                    setSupportActionBar(toolbar);
                    this.A0X = this.A00.findViewById(2131429954);
                    this.A0Z = this.A00.findViewById(2131432166);
                    TextView A0E2 = C17880vN.A0E(this.A00, 2131433389);
                    AnonymousClass1Y5.A0A(A0E2, true);
                    this.A0b = A0E2;
                    this.A0c = C17880vN.A0E(this.A00, 2131433388);
                    this.A0a = C17880vN.A0E(this.A00, 2131433387);
                    this.A0Y = this.A00.findViewById(2131433384);
                    this.A01 = AnonymousClass3MW.A0H(this.A00, 2131433392);
                    this.A00 = this.A00.findViewById(2131430073);
                    this.A0C = AnonymousClass3MW.A0r(this.A00, 2131430157);
                    this.A0e = AnonymousClass3MW.A0r(this.A00, 2131429879);
                    this.A0f = AnonymousClass3MW.A0r(this.A00, 2131430245);
                    this.A0d = C72453Mb.A0s(this.A00, 2131435850);
                    WDSButton wDSButton = this.A0e;
                    if (wDSButton != null) {
                        AnonymousClass6LG.A00(wDSButton, this, 32);
                    }
                    WDSButton wDSButton2 = this.A0f;
                    if (wDSButton2 != null) {
                        AnonymousClass6LG.A00(wDSButton2, this, 33);
                    }
                    RecyclerView A0Q2 = AnonymousClass3MX.A0Q(this.A00, 2131435757);
                    A0Q2.A0t(this.A0k);
                    this.A02 = A0Q2;
                    this.A07.registerObserver(this);
                    this.A00.findViewById(2131433391).setVisibility(8);
                    if (A0q(this)) {
                        AnonymousClass6RG r1 = this.A03;
                        if (r1 == null) {
                            str2 = "stickerPackPreviewSource";
                        } else {
                            if (r1 == AnonymousClass6RG.DEEPLINK) {
                                AnonymousClass00H r04 = this.A0G;
                                if (r04 != null) {
                                    C108945cZ.A0p(r04).A01(8);
                                }
                                str2 = "avatarLogger";
                            }
                            AnonymousClass00H r05 = this.A0G;
                            if (r05 != null) {
                                C108975cc.A0L(r05).A03((Boolean) null, 16);
                                return;
                            }
                            str2 = "avatarLogger";
                        }
                        C18070vi.A11(str2);
                        throw null;
                    }
                    return;
                }
                str = "stickerObservers";
            }
            C18070vi.A11(str);
            throw null;
        }
        throw AnonymousClass000.A0k("Sticker pack id cannot be null.");
    }

    public void onDestroy() {
        String str;
        String str2;
        super.onDestroy();
        AnonymousClass00H r0 = this.A0L;
        if (r0 != null) {
            C17880vN.A0V(r0).unregisterObserver(this.A0m);
            C26631Sw r02 = this.A07;
            if (r02 != null) {
                r02.A04();
                this.A07.unregisterObserver(this);
                if (A0q(this)) {
                    AnonymousClass00H r03 = this.A0F;
                    if (r03 != null) {
                        C17880vN.A0V(r03).unregisterObserver(this.A0l);
                        AnonymousClass6RG r1 = this.A03;
                        if (r1 == null) {
                            str2 = "stickerPackPreviewSource";
                        } else if (r1 == AnonymousClass6RG.DEEPLINK) {
                            AnonymousClass00H r04 = this.A0G;
                            if (r04 != null) {
                                C108945cZ.A0p(r04).A00(8);
                                return;
                            }
                            str2 = "avatarLogger";
                        } else {
                            return;
                        }
                    } else {
                        str2 = "avatarEventObservers";
                    }
                    C18070vi.A11(str2);
                    throw null;
                }
                return;
            }
            str = "stickerImageFileLoader";
        } else {
            str = "stickerObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public StickerStorePackPreviewActivity() {
        this(0);
        this.A0m = new AnonymousClass6H5(this, 7);
        this.A0l = new AnonymousClass7L4(this, 4);
        this.A0k = new C112735lx(this, 16);
        this.A0h = new C126616d1(this);
        this.A0i = new AnonymousClass6LG(this, 31);
        this.A0j = new AnonymousClass6LG(this, 34);
    }
}
