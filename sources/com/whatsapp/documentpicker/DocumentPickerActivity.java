package com.whatsapp.documentpicker;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass02B;
import X.AnonymousClass02H;
import X.AnonymousClass10I;
import X.AnonymousClass112;
import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1GP;
import X.AnonymousClass1KB;
import X.AnonymousClass1L1;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1NM;
import X.AnonymousClass1PM;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4Z9;
import X.AnonymousClass4aV;
import X.AnonymousClass6WK;
import X.AnonymousClass747;
import X.AnonymousClass7AO;
import X.AnonymousClass88L;
import X.C003401n;
import X.C108945cZ;
import X.C108975cc;
import X.C108985cd;
import X.C110275fD;
import X.C111075i9;
import X.C111325jX;
import X.C115015t8;
import X.C125946bw;
import X.C133676pJ;
import X.C134196qC;
import X.C1423879g;
import X.C1604888r;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18460wS;
import X.C19830z4;
import X.C20098A7b;
import X.C218617r;
import X.C219217x;
import X.C22891Dp;
import X.C22971Dz;
import X.C24494C6m;
import X.C24921Me;
import X.C27201Vd;
import X.C28281Zt;
import X.C31131f4;
import X.C31161f7;
import X.C31181f9;
import X.C34001jj;
import X.C34511kb;
import X.C37451pZ;
import X.C62272r8;
import X.C678731e;
import X.C72473Md;
import X.C88184Yq;
import X.E8R;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.WaTextView;
import com.whatsapp.base.WDSSearchViewFragment;
import com.whatsapp.documentpicker.fragments.SendDocumentsConfirmationDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.search.WDSConversationSearchView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DocumentPickerActivity extends C115015t8 implements E8R, C1604888r, AnonymousClass88L {
    public int A00;
    public MenuItem A01;
    public View A02;
    public View A03;
    public AnonymousClass02B A04;
    public C34511kb A05;
    public AnonymousClass1M9 A06;
    public AnonymousClass1PM A07;
    public C24921Me A08;
    public C37451pZ A09;
    public C27201Vd A0A;
    public C88184Yq A0B;
    public C134196qC A0C;
    public C31131f4 A0D;
    public AnonymousClass1NM A0E;
    public C219217x A0F;
    public C110275fD A0G;
    public C678731e A0H;
    public C125946bw A0I;
    public AnonymousClass1LU A0J;
    public AnonymousClass1BI A0K;
    public C111075i9 A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public String A0P;
    public ArrayList A0Q;
    public List A0R;
    public List A0S;
    public ViewGroup A0T;
    public C003401n A0U;
    public BottomSheetBehavior A0V;
    public WaTextView A0W;
    public boolean A0X;
    public boolean A0Y;
    public final AnonymousClass02H A0Z = new C1423879g(this);
    public final List A0a = AnonymousClass000.A13();

    public final void A4c(Uri uri) {
        String str;
        Uri uri2 = uri;
        C18070vi.A0d(uri, 0);
        if (this.A0J != null) {
            AnonymousClass1BI r5 = this.A0K;
            if (r5 == null) {
                str = "chatJid";
            } else {
                Intent A0Q2 = AnonymousClass1LU.A0Q(this, uri2, r5, getIntent().getStringExtra("caption"), getIntent().getStringExtra("mentions"), getIntent().getBooleanExtra("send", false));
                C18070vi.A0X(A0Q2);
                startActivityForResult(A0Q2, 36);
                return;
            }
        } else {
            str = "waIntents";
        }
        C18070vi.A11(str);
        throw null;
    }

    public C24494C6m BqU(Bundle bundle) {
        C18030ve r5 = this.A0E;
        C18070vi.A0W(r5);
        C218617r r3 = this.A04;
        C18070vi.A0W(r3);
        C18000vb r4 = this.A00;
        C18070vi.A0W(r4);
        return new C111325jX(this, r3, r4, r5, getIntent().getStringArrayExtra("allowed_mime_types"));
    }

    public void Bx8() {
    }

    public void C81(AnonymousClass02B r3) {
        int A012;
        C18070vi.A0d(r3, 0);
        super.C81(r3);
        if (!AnonymousClass112.A01() && C22891Dp.A02) {
            A012 = 2131103100;
        } else if (A17(this)) {
            C28281Zt.A05(this, AnonymousClass1YL.A00(this, 2130969148, 2131100157));
            C28281Zt.A0A(getWindow(), true);
            return;
        } else {
            A012 = AnonymousClass4Z9.A01(this, false);
        }
        C28281Zt.A05(this, A012);
    }

    public void C82(AnonymousClass02B r3) {
        C18070vi.A0d(r3, 0);
        super.C82(r3);
        if (A17(this)) {
            C28281Zt.A0A(getWindow(), false);
        }
        C72473Md.A0o(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r0.isEmpty() == true) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CHW(java.util.ArrayList r11) {
        /*
            r10 = this;
            r9 = 1
            r5 = r11
            r10.A16(r11)
            X.1BI r1 = r10.A0K
            java.lang.String r0 = "chatJid"
            r3 = 0
            if (r1 == 0) goto L_0x0038
            int r6 = r10.A0z(r1, r11)
            X.1BI r4 = r10.A0K
            if (r4 == 0) goto L_0x0038
            java.util.List r0 = r10.A0R
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.isEmpty()
            r8 = 0
            if (r0 != r9) goto L_0x0020
        L_0x001f:
            r8 = 1
        L_0x0020:
            android.content.Intent r2 = r10.getIntent()
            java.lang.String r1 = "origin"
            r0 = 39
            int r7 = r2.getIntExtra(r1, r0)
            com.whatsapp.documentpicker.fragments.SendDocumentsConfirmationDialogFragment r1 = A10(r4, r5, r6, r7, r8, r9)
            X.1GP r0 = r10.getSupportFragmentManager()
            X.C20098A7b.A03(r1, r0, r3)
            return
        L_0x0038:
            X.C18070vi.A11(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.CHW(java.util.ArrayList):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0168, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r14.A0E, 9027) == false) goto L_0x016a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r9 = r14
            super.onCreate(r15)
            r0 = 2131889539(0x7f120d83, float:1.9413744E38)
            r14.setTitle(r0)
            X.1Dv r1 = X.AnonymousClass1BI.A00
            java.lang.String r0 = X.C72453Mb.A0u(r14)
            X.1BI r1 = r1.A02(r0)
            java.lang.String r0 = "rawJid is not a valid chat jid string"
            X.C17960vV.A08(r1, r0)
            X.C18070vi.A0X(r1)
            r14.A0K = r1
            X.0z4 r0 = r14.A0A
            int r2 = r14.A00
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "document_picker_sort"
            int r0 = r1.getInt(r0, r2)
            r14.A00 = r0
            X.0ve r0 = r14.A0E
            X.C18070vi.A0W(r0)
            boolean r1 = X.C87544Vz.A00(r0)
            r14.A0X = r1
            r0 = 2131625128(0x7f0e04a8, float:1.8877455E38)
            if (r1 == 0) goto L_0x0041
            r0 = 2131625130(0x7f0e04aa, float:1.887746E38)
        L_0x0041:
            r14.setContentView((int) r0)
            r0 = 2131434890(0x7f0b1d8a, float:1.8491607E38)
            android.view.View r0 = r14.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r14.A0T = r0
            X.01n r0 = r14.getSupportActionBar()
            r14.A0U = r0
            r4 = 1
            if (r0 == 0) goto L_0x005b
            r0.A0W(r4)
        L_0x005b:
            X.01n r0 = r14.A0U
            if (r0 == 0) goto L_0x0062
            r0.A0X(r4)
        L_0x0062:
            X.5fD r0 = new X.5fD
            r0.<init>(r14)
            r14.A0G = r0
            android.view.LayoutInflater r3 = r14.getLayoutInflater()
            r1 = 2131625133(0x7f0e04ad, float:1.8877465E38)
            android.widget.ListView r0 = r14.getListView()
            r2 = 0
            android.view.View r1 = X.AnonymousClass3MX.A0B(r3, r0, r1, r2)
            r14.A02 = r1
            java.lang.String r8 = "header"
            r11 = 0
            r0 = 2131434393(0x7f0b1b99, float:1.8490599E38)
            com.whatsapp.WaTextView r1 = X.C72453Mb.A0g(r1, r0)
            r14.A0W = r1
            java.lang.String r3 = "recentsHeader"
            if (r1 == 0) goto L_0x021c
            r0 = 2131889537(0x7f120d81, float:1.941374E38)
            r1.setText(r0)
            X.5fD r0 = r14.A0G
            java.lang.String r7 = "adapter"
            if (r0 == 0) goto L_0x0218
            int r0 = r0.getCount()
            if (r0 != 0) goto L_0x00a6
            com.whatsapp.WaTextView r1 = r14.A0W
            if (r1 == 0) goto L_0x021c
            r0 = 8
            r1.setVisibility(r0)
        L_0x00a6:
            android.view.View r1 = r14.A02
            if (r1 == 0) goto L_0x0214
            r0 = 2131428420(0x7f0b0444, float:1.8478484E38)
            android.view.View r6 = r1.findViewById(r0)
            X.3cj r6 = (X.C74793cj) r6
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "max_file_size_mb"
            int r1 = r1.getIntExtra(r0, r2)
            r5 = 2131887444(0x7f120554, float:1.9409495E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            if (r1 <= 0) goto L_0x00e4
            X.31e r0 = r14.A0H
            if (r0 == 0) goto L_0x0212
            java.lang.String r0 = r0.A00(r1)
        L_0x00cc:
            java.lang.String r0 = X.C17880vN.A0q(r14, r0, r3, r2, r5)
            r6.setDescription((java.lang.CharSequence) r0)
            r1 = 2
            X.4dG r0 = new X.4dG
            r0.<init>(r14, r1)
            r6.setOnClickListener(r0)
            android.view.View r1 = r14.A02
            if (r1 != 0) goto L_0x00ef
            X.C18070vi.A11(r8)
            throw r11
        L_0x00e4:
            X.31e r1 = r14.A0H
            if (r1 == 0) goto L_0x0212
            int r0 = r1.A00
            java.lang.String r0 = r1.A00(r0)
            goto L_0x00cc
        L_0x00ef:
            r0 = 2131429103(0x7f0b06ef, float:1.847987E38)
            X.1bI r5 = X.C28931bI.A00(r1, r0)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "hide_choose_from_gallery"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x0125
            r0 = 8
            r5.A04(r0)
        L_0x0107:
            android.view.View r1 = r14.A02
            if (r1 == 0) goto L_0x011e
            r0 = 2131429106(0x7f0b06f2, float:1.8479875E38)
            X.1bI r6 = X.C28931bI.A00(r1, r0)
            X.1kb r3 = r14.A05
            if (r3 == 0) goto L_0x0122
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1BI r0 = r14.A0K
            if (r0 != 0) goto L_0x014c
            java.lang.String r8 = "chatJid"
        L_0x011e:
            X.C18070vi.A11(r8)
            throw r11
        L_0x0122:
            java.lang.String r8 = "communityChatManager"
            goto L_0x011e
        L_0x0125:
            r5.A04(r2)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "choose_from_gallery_subtitle_only_photos"
            boolean r3 = r1.getBooleanExtra(r0, r2)
            android.view.View r1 = r5.A02()
            X.3cj r1 = (X.C74793cj) r1
            r0 = 2131888307(0x7f1208b3, float:1.9411246E38)
            if (r3 == 0) goto L_0x0140
            r0 = 2131888308(0x7f1208b4, float:1.9411248E38)
        L_0x0140:
            r1.setDescription((int) r0)
            X.4dG r0 = new X.4dG
            r0.<init>(r14, r4)
            r5.A05(r0)
            goto L_0x0107
        L_0x014c:
            X.1EC r1 = X.C42941yz.A00(r0)
            X.1CJ r0 = r3.A02
            int r0 = r0.A06(r1)
            boolean r0 = X.AnonymousClass2TI.A00(r0)
            r5 = 0
            if (r0 == 0) goto L_0x016a
            X.0ve r3 = r14.A0E
            r1 = 9027(0x2343, float:1.265E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r3, r1)
            r0 = 1
            if (r1 != 0) goto L_0x016d
        L_0x016a:
            r0 = 0
            r5 = 8
        L_0x016d:
            r6.A04(r5)
            if (r0 == 0) goto L_0x017c
            r1 = 44
            X.48f r0 = new X.48f
            r0.<init>(r14, r1)
            r6.A05(r0)
        L_0x017c:
            android.widget.ListView r1 = r14.getListView()
            android.view.View r0 = r14.A02
            if (r0 == 0) goto L_0x020e
            r1.addHeaderView(r0)
            android.view.View r1 = r14.A02
            if (r1 == 0) goto L_0x020e
            r3 = 4
            X.BJf r0 = new X.BJf
            r0.<init>(r3)
            X.AnonymousClass1HF.A0f(r1, r0)
            X.5fD r0 = r14.A0G
            if (r0 == 0) goto L_0x0218
            r14.A4b(r0)
            android.widget.ListView r1 = r14.getListView()
            X.79J r0 = new X.79J
            r0.<init>(r14, r3)
            r1.setOnItemClickListener(r0)
            android.widget.ListView r1 = r14.getListView()
            r12 = 1
            X.79M r0 = new X.79M
            r0.<init>(r14, r4)
            r1.setOnItemLongClickListener(r0)
            if (r15 == 0) goto L_0x0200
            java.lang.String r0 = "system_picker_auto_started"
            boolean r0 = r15.getBoolean(r0)
            if (r0 == 0) goto L_0x0200
        L_0x01be:
            r14.A0Y = r4
            X.Ct7 r0 = X.C26144Ct7.A00(r14)
            r0.A03(r14)
            boolean r0 = r14.A0X
            if (r0 == 0) goto L_0x01ff
            android.view.View r1 = r14.A00
            r0 = 2131430111(0x7f0b0adf, float:1.8481914E38)
            android.view.View r7 = X.C18070vi.A05(r1, r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior
            r0.<init>()
            r14.A0V = r0
            X.00H r0 = r14.A0M
            if (r0 == 0) goto L_0x0208
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            X.6uJ r6 = (X.C136736uJ) r6
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r14.A0V
            X.1L4 r10 = r14.A09
            X.C18070vi.A0W(r10)
            r13 = r12
            r6.A02(r7, r8, r9, r10, r11, r12, r13)
            X.00H r0 = r14.A0M
            if (r0 == 0) goto L_0x0202
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.6uJ r1 = (X.C136736uJ) r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r14.A0V
            r1.A03(r0, r2)
        L_0x01ff:
            return
        L_0x0200:
            r4 = 0
            goto L_0x01be
        L_0x0202:
            java.lang.String r0 = "mediaAttachmentUtils"
            X.C18070vi.A11(r0)
            throw r11
        L_0x0208:
            java.lang.String r0 = "mediaAttachmentUtils"
            X.C18070vi.A11(r0)
            throw r11
        L_0x020e:
            X.C18070vi.A11(r8)
            throw r11
        L_0x0212:
            java.lang.String r8 = "documentBanner"
        L_0x0214:
            X.C18070vi.A11(r8)
            throw r11
        L_0x0218:
            X.C18070vi.A11(r7)
            throw r11
        L_0x021c:
            X.C18070vi.A11(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if ((!r0.isEmpty()) == true) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            android.view.MenuInflater r1 = r3.getMenuInflater()
            r0 = 2131820561(0x7f110011, float:1.927384E38)
            r1.inflate(r0, r4)
            r0 = 2131432620(0x7f0b14ac, float:1.8487003E38)
            android.view.MenuItem r2 = r4.findItem(r0)
            r3.A01 = r2
            if (r2 == 0) goto L_0x0029
            java.util.List r0 = r3.A0R
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L_0x002e
        L_0x0026:
            r2.setVisible(r1)
        L_0x0029:
            boolean r0 = super.onCreateOptionsMenu(r4)
            return r0
        L_0x002e:
            r1 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        SharedPreferences.Editor putInt;
        int A012 = AnonymousClass3MY.A01(menuItem, 0);
        if (A012 == 2131432634) {
            this.A00 = 0;
            putInt = C19830z4.A00(this.A0A).putInt("document_picker_sort", 0);
        } else if (A012 == 2131432633) {
            this.A00 = 1;
            putInt = C19830z4.A00(this.A0A).putInt("document_picker_sort", 1);
        } else {
            if (A012 == 16908332) {
                finish();
            } else if (A012 == 2131432620) {
                C003401n r0 = this.A0U;
                if (r0 != null) {
                    r0.A0E();
                }
                if (this.A0L == null) {
                    C111075i9 r2 = (C111075i9) AnonymousClass3MW.A0N(this).A00(C111075i9.class);
                    this.A0L = r2;
                    if (r2 != null) {
                        r2.A00.A0A(this, new AnonymousClass7AO(this, 19));
                    }
                    C111075i9 r22 = this.A0L;
                    if (r22 != null) {
                        r22.A01.A0A(this, new AnonymousClass7AO(this, 20));
                    }
                }
                ViewGroup viewGroup = this.A0T;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                AnonymousClass1GP A0O2 = AnonymousClass3MX.A0O(this);
                WDSSearchViewFragment wDSSearchViewFragment = (WDSSearchViewFragment) A0O2.A0Q("search_fragment");
                if (wDSSearchViewFragment == null) {
                    wDSSearchViewFragment = new WDSSearchViewFragment();
                    C34001jj r1 = new C34001jj(A0O2);
                    r1.A0G = true;
                    r1.A0D(wDSSearchViewFragment, "search_fragment", 2131434890);
                    r1.A0H("search_fragment");
                    r1.A01();
                    A0O2.A0Z();
                }
                WDSConversationSearchView wDSConversationSearchView = wDSSearchViewFragment.A00;
                if (wDSConversationSearchView != null) {
                    wDSConversationSearchView.A02();
                    return true;
                }
            }
            return true;
        }
        putInt.apply();
        invalidateOptionsMenu();
        String str = this.A0P;
        C110275fD r02 = this.A0G;
        if (r02 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        r02.getFilter().filter(str);
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        MenuItem findItem = menu.findItem(2131432634);
        MenuItem findItem2 = menu.findItem(2131432633);
        if (this.A00 == 0) {
            findItem.setChecked(true);
            return true;
        }
        findItem2.setChecked(true);
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("system_picker_auto_started", this.A0Y);
    }

    public void startActivityForResult(Intent intent, int i) {
        C18070vi.A0d(intent, 0);
        try {
            super.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            Log.e("DocumentPickerActivity/pick-from-doc-provider ", e);
            this.A05.A08(2131886448, 0);
        }
    }

    private final int A0z(AnonymousClass1BI r8, List list) {
        boolean A1S = AnonymousClass000.A1S(this.A07.A03(false), 1);
        AnonymousClass747 r1 = C62272r8.A04;
        AnonymousClass11C r0 = this.A08;
        C18070vi.A0W(r0);
        long A082 = r1.A08(r0, list) / SearchActionVerificationClientService.MS_TO_NS;
        if (A1S && A082 > 100) {
            return 0;
        }
        AnonymousClass1M9 r02 = this.A06;
        if (r02 != null) {
            AnonymousClass1E7 A0H2 = r02.A0H(r8);
            if (C22971Dz.A0N(A0H2.A0J) || A0H2.A0F()) {
                return 2;
            }
            return 1;
        }
        C18070vi.A11("contactManager");
        throw null;
    }

    public static final SendDocumentsConfirmationDialogFragment A10(AnonymousClass1BI r2, ArrayList arrayList, int i, int i2, boolean z, boolean z2) {
        new SendDocumentsConfirmationDialogFragment();
        Bundle A0D2 = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D2, r2, "jid");
        A0D2.putParcelableArrayList("uri_list", arrayList);
        A0D2.putInt("dialog_type", i);
        A0D2.putBoolean("finish_on_cancel", z);
        A0D2.putInt("origin", i2);
        A0D2.putBoolean("selection_from_gallery_picker", z2);
        SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = new SendDocumentsConfirmationDialogFragment();
        sendDocumentsConfirmationDialogFragment.A1R(A0D2);
        return sendDocumentsConfirmationDialogFragment;
    }

    public static final void A11(DocumentPickerActivity documentPickerActivity) {
        String str;
        DocumentPickerActivity documentPickerActivity2 = documentPickerActivity;
        int A032 = C108975cc.A03(documentPickerActivity2);
        int min = Math.min(documentPickerActivity2.getIntent().getIntExtra("max_items", A032), A032);
        C125946bw r4 = documentPickerActivity2.A0I;
        if (r4 != null) {
            AnonymousClass1BI r8 = documentPickerActivity2.A0K;
            if (r8 == null) {
                str = "chatJid";
            } else {
                ArrayList A13 = AnonymousClass000.A13();
                int intExtra = documentPickerActivity2.getIntent().getIntExtra("origin", 39);
                C18460wS r3 = C18460wS.A00;
                C18070vi.A0d(r3, 14);
                C18030ve r0 = r4.A00;
                Intent A0d = AnonymousClass1LU.A0d(documentPickerActivity2, r8, (AnonymousClass1EC) null, AnonymousClass6WK.A00(r8), (Integer) null, "", A13, min, intExtra, 36, 0, false, false, true, false);
                if (C18020vd.A05(C18040vf.A02, r0, 11376)) {
                    A0d.putParcelableArrayListExtra("result_extra_media_selection", C17880vN.A10(r3));
                }
                if (intExtra == 51) {
                    A0d.putExtra("preview", true);
                    A0d.putExtra("send", false);
                    A0d.putExtra("include_media", 1);
                    A0d.putExtra("include", 1);
                    A0d.putExtra("should_hide_caption_view", true);
                    A0d.putExtra("should_set_gallery_result", true);
                    A0d.putExtra("should_send_media", false);
                    A0d.putExtra("skip_max_items_new_limit", true);
                }
                documentPickerActivity2.startActivityForResult(A0d, 22);
                return;
            }
        } else {
            str = "mediaTrayGallery";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A13(DocumentPickerActivity documentPickerActivity) {
        C110275fD r0 = documentPickerActivity.A0G;
        if (r0 == null) {
            AnonymousClass3MW.A1B();
        } else {
            if (r0.getCount() == 0) {
                if (documentPickerActivity.A0R == null) {
                    C108985cd.A14(documentPickerActivity, 2131434939, 8);
                    C108985cd.A14(documentPickerActivity, 2131434180, 0);
                } else {
                    ArrayList arrayList = documentPickerActivity.A0Q;
                    if (arrayList == null || !(!arrayList.isEmpty())) {
                        TextView A0L2 = AnonymousClass3MX.A0L(documentPickerActivity, 2131434939);
                        if (A0L2 != null) {
                            A0L2.setVisibility(0);
                            A0L2.setText(2131892917);
                        }
                    } else {
                        TextView A0L3 = AnonymousClass3MX.A0L(documentPickerActivity, 2131434939);
                        if (A0L3 != null) {
                            A0L3.setVisibility(0);
                            AnonymousClass3MY.A0y(documentPickerActivity, A0L3, new Object[]{documentPickerActivity.A0P}, 2131895497);
                        }
                    }
                    C108985cd.A14(documentPickerActivity, 2131434180, 8);
                }
                C108985cd.A14(documentPickerActivity, 16908292, 0);
                WaTextView waTextView = documentPickerActivity.A0W;
                if (waTextView != null) {
                    waTextView.setVisibility(8);
                    return;
                }
            } else {
                C108985cd.A14(documentPickerActivity, 16908292, 8);
                WaTextView waTextView2 = documentPickerActivity.A0W;
                if (waTextView2 != null) {
                    waTextView2.setVisibility(0);
                    return;
                }
            }
            C18070vi.A11("recentsHeader");
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        if (r1 != null) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A14(com.whatsapp.documentpicker.DocumentPickerActivity r8, X.C133676pJ r9) {
        /*
            java.util.List r6 = r8.A0a
            boolean r0 = r6.contains(r9)
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0042
            r6.remove(r9)
            X.02B r1 = r8.A04
            if (r1 == 0) goto L_0x001a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0083
            r1.A05()
        L_0x001a:
            boolean r0 = X.AnonymousClass000.A1a(r6)
            if (r0 == 0) goto L_0x0039
            X.11C r7 = r8.A08
            android.content.res.Resources r3 = r8.getResources()
            r2 = 2131755256(0x7f1000f8, float:1.9141386E38)
            int r1 = r6.size()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.C108985cd.A1S(r6, r0, r5)
            java.lang.String r0 = r3.getQuantityString(r2, r1, r0)
            X.AnonymousClass1Y5.A00(r8, r7, r0)
        L_0x0039:
            X.5fD r0 = r8.A0G
            if (r0 != 0) goto L_0x0087
            X.AnonymousClass3MW.A1B()
            r0 = 0
            throw r0
        L_0x0042:
            int r2 = X.C108975cc.A03(r8)
            int r0 = r6.size()
            if (r0 < r2) goto L_0x0056
            X.0ve r2 = r8.A0E
            r1 = 2693(0xa85, float:3.774E-42)
            X.0vf r0 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r0, r2, r1)
        L_0x0056:
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "max_items"
            int r0 = r1.getIntExtra(r0, r2)
            int r3 = java.lang.Math.min(r0, r2)
            int r0 = r6.size()
            if (r0 < r3) goto L_0x007c
            X.1KB r2 = r8.A05
            r1 = 2131896124(0x7f12273c, float:1.94271E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.C17880vN.A1T(r0, r3, r5)
            java.lang.String r0 = r8.getString(r1, r0)
            r2.A0G(r0, r5)
            goto L_0x001a
        L_0x007c:
            r6.add(r9)
            X.02B r1 = r8.A04
            if (r1 == 0) goto L_0x001a
        L_0x0083:
            r1.A06()
            goto L_0x001a
        L_0x0087:
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.A14(com.whatsapp.documentpicker.DocumentPickerActivity, X.6pJ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if ((!r4.isEmpty()) == true) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void Bx0(java.lang.Object r4) {
        /*
            r3 = this;
            java.util.List r4 = (java.util.List) r4
            r3.A0R = r4
            android.view.MenuItem r2 = r3.A01
            if (r2 == 0) goto L_0x0016
            if (r4 == 0) goto L_0x0021
            boolean r0 = r4.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L_0x0021
        L_0x0013:
            r2.setVisible(r1)
        L_0x0016:
            java.lang.String r1 = r3.A0P
            X.5fD r0 = r3.A0G
            if (r0 != 0) goto L_0x0023
            X.AnonymousClass3MW.A1B()
            r0 = 0
            throw r0
        L_0x0021:
            r1 = 0
            goto L_0x0013
        L_0x0023:
            android.widget.Filter r0 = r0.getFilter()
            r0.filter(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.Bx0(java.lang.Object):void");
    }

    public void onResume() {
        String str;
        super.onResume();
        AnonymousClass00H r0 = this.A0N;
        if (r0 != null) {
            boolean z = ((C31161f7) r0.get()).A03;
            View view = this.A00;
            if (z) {
                C18070vi.A0X(view);
                C18030ve r15 = this.A0E;
                C18070vi.A0W(r15);
                AnonymousClass1KB r13 = this.A05;
                C18070vi.A0W(r13);
                AnonymousClass11S r12 = this.A02;
                C18070vi.A0W(r12);
                AnonymousClass10I r11 = this.A05;
                C18070vi.A0W(r11);
                C27201Vd r10 = this.A0A;
                if (r10 != null) {
                    AnonymousClass1M9 r9 = this.A06;
                    if (r9 != null) {
                        C24921Me r8 = this.A08;
                        if (r8 != null) {
                            C18000vb r7 = this.A00;
                            C18070vi.A0W(r7);
                            C134196qC r6 = this.A0C;
                            if (r6 != null) {
                                C31131f4 r5 = this.A0D;
                                if (r5 != null) {
                                    AnonymousClass00H r4 = this.A0N;
                                    if (r4 != null) {
                                        AnonymousClass00H r3 = this.A0O;
                                        if (r3 != null) {
                                            View view2 = this.A03;
                                            C37451pZ r1 = this.A09;
                                            AnonymousClass1L1 r02 = this.A0F;
                                            C18070vi.A0W(r02);
                                            C18030ve r26 = r15;
                                            C31131f4 r24 = r5;
                                            C134196qC r23 = r6;
                                            C27201Vd r22 = r10;
                                            C37451pZ r21 = r1;
                                            C24921Me r20 = r8;
                                            AnonymousClass1M9 r19 = r9;
                                            AnonymousClass11S r18 = r12;
                                            AnonymousClass1KB r17 = r13;
                                            View view3 = view2;
                                            View view4 = view;
                                            Pair A002 = AnonymousClass4aV.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r7, r26, r02, r11, r4, r3, "document-picker-activity");
                                            this.A03 = (View) A002.first;
                                            this.A09 = (C37451pZ) A002.second;
                                        } else {
                                            str = "sequentialMessageControllerLazy";
                                        }
                                    }
                                }
                                str = "messageAudioPlayerProvider";
                            } else {
                                str = "messageAudioPlayerFactory";
                            }
                        } else {
                            str = "waContactNames";
                        }
                    } else {
                        str = "contactManager";
                    }
                } else {
                    str = "contactPhotos";
                }
                C18070vi.A11(str);
                throw null;
            } else if (C31181f9.A00(view)) {
                C31131f4 r2 = this.A0D;
                if (r2 != null) {
                    AnonymousClass00H r14 = this.A0N;
                    if (r14 != null) {
                        View view5 = this.A00;
                        C18070vi.A0X(view5);
                        AnonymousClass4aV.A03(view5, r2, r14);
                    }
                }
                str = "messageAudioPlayerProvider";
                C18070vi.A11(str);
                throw null;
            }
            AnonymousClass00H r03 = this.A0N;
            if (r03 != null) {
                ((C31161f7) r03.get()).A00();
                return;
            }
        }
        str = "outOfChatDisplayControllerLazy";
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (X.C22891Dp.A02 == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A12(com.whatsapp.documentpicker.DocumentPickerActivity r3) {
        /*
            X.1GP r1 = r3.getSupportFragmentManager()
            boolean r0 = r1.A0z()
            if (r0 != 0) goto L_0x0045
            java.lang.String r2 = "search_fragment"
            androidx.fragment.app.Fragment r0 = r1.A0Q(r2)
            com.whatsapp.base.WDSSearchViewFragment r0 = (com.whatsapp.base.WDSSearchViewFragment) r0
            if (r0 == 0) goto L_0x0017
            r0.A26()
        L_0x0017:
            X.1GP r1 = r3.getSupportFragmentManager()
            r0 = 1
            r1.A0v(r2, r0)
            android.view.ViewGroup r0 = r3.A0T
            X.C72453Mb.A1D(r0)
            X.01n r0 = r3.A0U
            if (r0 == 0) goto L_0x002b
            r0.A0I()
        L_0x002b:
            r0 = 0
            r3.A0Q = r0
            A13(r3)
            boolean r0 = X.AnonymousClass112.A01()
            if (r0 != 0) goto L_0x003e
            boolean r1 = X.C22891Dp.A02
            r0 = 2131103100(0x7f060d7c, float:1.7818657E38)
            if (r1 != 0) goto L_0x0042
        L_0x003e:
            int r0 = X.C108955ca.A02(r3)
        L_0x0042:
            X.C28281Zt.A05(r3, r0)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.A12(com.whatsapp.documentpicker.DocumentPickerActivity):void");
    }

    public static final void A15(DocumentPickerActivity documentPickerActivity, Collection collection) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A13.add(Uri.fromFile(((C133676pJ) it.next()).A02));
        }
        AnonymousClass1BI r0 = documentPickerActivity.A0K;
        if (r0 != null) {
            int A0z = documentPickerActivity.A0z(r0, A13);
            if (A0z != 0) {
                AnonymousClass1PM r2 = documentPickerActivity.A07;
                if (r2 != null) {
                    int size = A13.size();
                    AnonymousClass1BI r02 = documentPickerActivity.A0K;
                    if (r02 != null) {
                        if (AnonymousClass747.A04(r2, r02, size)) {
                            Object obj = A13.get(0);
                            C18070vi.A0X(obj);
                            documentPickerActivity.A4c((Uri) obj);
                            return;
                        }
                    }
                } else {
                    C18070vi.A11("verifiedNameManager");
                    throw null;
                }
            }
            AnonymousClass1BI r5 = documentPickerActivity.A0K;
            if (r5 != null) {
                C20098A7b.A03(A10(r5, A13, A0z, documentPickerActivity.getIntent().getIntExtra("origin", 39), false, false), documentPickerActivity.getSupportFragmentManager(), (String) null);
                return;
            }
        }
        C18070vi.A11("chatJid");
        throw null;
    }

    private final void A16(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                grantUriPermission("com.whatsapp", C108945cZ.A0M(it), 1);
            } catch (SecurityException e) {
                Log.w("DocumentPickerActivity/permission ", e);
            }
        }
    }

    public static final boolean A17(DocumentPickerActivity documentPickerActivity) {
        Fragment A0Q2;
        AnonymousClass1GP A0O2 = AnonymousClass3MX.A0O(documentPickerActivity);
        if (A0O2.A0K() != 1 || (A0Q2 = A0O2.A0Q("search_fragment")) == null || !A0Q2.A1e()) {
            return false;
        }
        return true;
    }

    public C111075i9 BYk() {
        return this.A0L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0108, code lost:
        if (r0.isEmpty() == true) goto L_0x010a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            r12 = this;
            super.onActivityResult(r13, r14, r15)
            r3 = -1
            r4 = 1
            if (r13 == r4) goto L_0x0045
            r0 = 2
            if (r13 == r0) goto L_0x002d
            r0 = 22
            if (r13 == r0) goto L_0x0017
            r0 = 36
            if (r13 == r0) goto L_0x0057
            r0 = 90
            if (r13 == r0) goto L_0x0017
        L_0x0016:
            return
        L_0x0017:
            if (r14 != r3) goto L_0x004a
            if (r15 == 0) goto L_0x0016
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r1 = r15.getParcelableArrayListExtra(r0)
            if (r1 == 0) goto L_0x0059
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0059
            r12.CHW(r1)
            return
        L_0x002d:
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 == 0) goto L_0x0016
            if (r14 != 0) goto L_0x0016
            X.17x r0 = r12.A0F
            if (r0 == 0) goto L_0x00bf
            java.lang.Integer r1 = r0.A05()
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x0016
            A11(r12)
            return
        L_0x0045:
            if (r14 == r3) goto L_0x0060
            if (r14 == 0) goto L_0x004c
            return
        L_0x004a:
            if (r14 != 0) goto L_0x0016
        L_0x004c:
            java.util.List r0 = r12.A0R
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.isEmpty()
            if (r0 != r4) goto L_0x0016
            goto L_0x005c
        L_0x0057:
            if (r14 != r3) goto L_0x0016
        L_0x0059:
            r12.setResult(r14, r15)
        L_0x005c:
            r12.finish()
            return
        L_0x0060:
            if (r15 == 0) goto L_0x0016
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            android.content.ClipData r5 = r15.getClipData()
            r6 = 0
            if (r5 == 0) goto L_0x0086
            int r2 = r5.getItemCount()
            r1 = 0
        L_0x0072:
            if (r1 >= r2) goto L_0x0086
            android.content.ClipData$Item r0 = r5.getItemAt(r1)
            if (r0 == 0) goto L_0x0083
            android.net.Uri r0 = r0.getUri()
            if (r0 == 0) goto L_0x0083
            r7.add(r0)
        L_0x0083:
            int r1 = r1 + 1
            goto L_0x0072
        L_0x0086:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0095
            android.net.Uri r0 = r15.getData()
            if (r0 == 0) goto L_0x0095
            r7.add(r0)
        L_0x0095:
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "max_items"
            int r3 = r1.getIntExtra(r0, r3)
            boolean r0 = X.C17880vN.A1X(r7)
            if (r0 == 0) goto L_0x0016
            if (r3 <= 0) goto L_0x00c6
            int r0 = r7.size()
            if (r0 <= r3) goto L_0x00c6
            X.1KB r2 = r12.A05
            r1 = 2131896124(0x7f12273c, float:1.94271E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.C17880vN.A1T(r0, r3, r6)
            java.lang.String r0 = r12.getString(r1, r0)
            r2.A0G(r0, r6)
            return
        L_0x00bf:
            java.lang.String r0 = "waPermissionsHelper"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00c6:
            r12.A16(r7)
            X.1BI r0 = r12.A0K
            java.lang.String r5 = "chatJid"
            r3 = 0
            if (r0 == 0) goto L_0x0124
            int r8 = r12.A0z(r0, r7)
            if (r8 == 0) goto L_0x00fb
            X.1PM r2 = r12.A07
            if (r2 == 0) goto L_0x00f5
            int r1 = r7.size()
            X.1BI r0 = r12.A0K
            if (r0 == 0) goto L_0x0124
            boolean r0 = X.AnonymousClass747.A04(r2, r0, r1)
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r0 = r7.get(r6)
            X.C18070vi.A0X(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r12.A4c(r0)
            return
        L_0x00f5:
            java.lang.String r0 = "verifiedNameManager"
            X.C18070vi.A11(r0)
            throw r3
        L_0x00fb:
            X.1BI r6 = r12.A0K
            if (r6 == 0) goto L_0x0124
            java.util.List r0 = r12.A0R
            if (r0 == 0) goto L_0x010a
            boolean r0 = r0.isEmpty()
            r10 = 0
            if (r0 != r4) goto L_0x010b
        L_0x010a:
            r10 = 1
        L_0x010b:
            android.content.Intent r2 = r12.getIntent()
            java.lang.String r1 = "origin"
            r0 = 39
            int r9 = r2.getIntExtra(r1, r0)
            r11 = 0
            com.whatsapp.documentpicker.fragments.SendDocumentsConfirmationDialogFragment r1 = A10(r6, r7, r8, r9, r10, r11)
            X.1GP r0 = r12.getSupportFragmentManager()
            X.C20098A7b.A03(r1, r0, r3)
            return
        L_0x0124:
            X.C18070vi.A11(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPickerActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        if (A17(this)) {
            A12(this);
        } else {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C31131f4 r1 = this.A0D;
        if (r1 != null) {
            AnonymousClass4aV.A01(this.A03, r1);
            C37451pZ r0 = this.A09;
            if (r0 != null) {
                r0.A02();
            }
            this.A09 = null;
            C88184Yq r12 = this.A0B;
            if (r12 != null) {
                r12.A02(2);
            } else {
                C18070vi.A11("conversationAttachmentEventLogger");
                throw null;
            }
        } else {
            C18070vi.A11("messageAudioPlayerProvider");
            throw null;
        }
    }

    public void onPause() {
        String str;
        super.onPause();
        C31131f4 r0 = this.A0D;
        if (r0 != null) {
            AnonymousClass4aV.A06(r0);
            AnonymousClass00H r02 = this.A0N;
            if (r02 != null) {
                View view = this.A00;
                C18070vi.A0X(view);
                ((C31161f7) r02.get()).A01(view);
                return;
            }
            str = "outOfChatDisplayControllerLazy";
        } else {
            str = "messageAudioPlayerProvider";
        }
        C18070vi.A11(str);
        throw null;
    }
}
