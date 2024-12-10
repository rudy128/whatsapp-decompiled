package com.whatsapp.gallerypicker;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass02B;
import X.AnonymousClass02H;
import X.AnonymousClass11P;
import X.AnonymousClass1BI;
import X.AnonymousClass1FL;
import X.AnonymousClass1KB;
import X.AnonymousClass1PM;
import X.AnonymousClass1Q5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4aX;
import X.AnonymousClass65B;
import X.AnonymousClass72S;
import X.AnonymousClass731;
import X.AnonymousClass73D;
import X.AnonymousClass7FZ;
import X.AnonymousClass7S3;
import X.AnonymousClass8AA;
import X.AnonymousClass8B2;
import X.C108955ca;
import X.C109005cf;
import X.C109305dA;
import X.C112225l8;
import X.C112775m1;
import X.C1188465m;
import X.C146747Ql;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C20050A4v;
import X.C29351c6;
import X.C29431cG;
import X.C29831cw;
import X.C36711oL;
import X.C38391rD;
import X.C72453Mb;
import X.C99434so;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.gallery.NewMediaPickerFragment;
import com.whatsapp.media.WamediaManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MediaPickerFragment extends Hilt_MediaPickerFragment implements AnonymousClass8AA {
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass02H A03;
    public AnonymousClass02B A04;
    public AnonymousClass731 A05;
    public AnonymousClass1PM A06;
    public AnonymousClass11P A07;
    public C112775m1 A08;
    public AnonymousClass1BI A09;
    public WamediaManager A0A;
    public AnonymousClass1Q5 A0B;
    public C36711oL A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public BroadcastReceiver A0M;
    public Integer A0N;
    public boolean A0O = true;
    public final AnonymousClass73D A0P = new AnonymousClass73D();
    public final HashSet A0Q = C17880vN.A14();
    public final C18100vl A0R = AnonymousClass7S3.A00(this, 25);
    public final C18100vl A0S = AnonymousClass7S3.A00(this, 24);

    public void A1w(int i, int i2, Intent intent) {
        C112225l8 r1;
        if (i == 1) {
            AnonymousClass1FL A1D = A1D();
            C18070vi.A0z(A1D, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (i2 == -1) {
                A1D.setResult(-1, intent);
            } else if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        A1D.setResult(2);
                    } else {
                        return;
                    }
                } else if (intent != null) {
                    ArrayList<Object> parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                    this.A0N = Integer.valueOf(intent.getIntExtra("media_quality_selection", 0));
                    HashSet hashSet = this.A0Q;
                    hashSet.clear();
                    if (parcelableArrayListExtra != null) {
                        hashSet.addAll(parcelableArrayListExtra);
                    }
                    if (this instanceof NewMediaPickerFragment) {
                        NewMediaPickerFragment newMediaPickerFragment = (NewMediaPickerFragment) this;
                        if (parcelableArrayListExtra != null) {
                            int size = parcelableArrayListExtra.size();
                            Set set = newMediaPickerFragment.A05;
                            if (size < set.size()) {
                                ArrayList A0D2 = C29351c6.A0D(parcelableArrayListExtra);
                                for (Object A1U : parcelableArrayListExtra) {
                                    C108955ca.A1U(A1U, A0D2);
                                }
                                Set A12 = C29431cG.A12(A0D2);
                                ArrayList A13 = AnonymousClass000.A13();
                                for (Object next : set) {
                                    if (A12.contains(((AnonymousClass8B2) next).BLl().toString())) {
                                        A13.add(next);
                                    }
                                }
                                set.clear();
                                set.addAll(A13);
                                RecyclerView recyclerView = newMediaPickerFragment.A03;
                                C38391rD r12 = null;
                                if (recyclerView != null) {
                                    r12 = recyclerView.A0B;
                                }
                                if ((r12 instanceof C112225l8) && (r1 = (C112225l8) r12) != null) {
                                    r1.A0V(set);
                                }
                            }
                        }
                    }
                    AnonymousClass02B r0 = this.A04;
                    if (r0 == null) {
                        A2J();
                    } else {
                        r0.A06();
                    }
                    this.A0P.A05(intent.getExtras());
                    A2B();
                    return;
                } else {
                    return;
                }
            } else if (!AnonymousClass000.A1W(this.A04)) {
                Map map = this.A0P.A00;
                synchronized (map) {
                    map.clear();
                }
                return;
            } else {
                return;
            }
            A1D.finish();
        }
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.A20(bundle);
        bundle.putParcelableArrayList("android.intent.extra.STREAM", C17880vN.A10(this.A0Q));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0055, code lost:
        if (A01() != false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r9, android.view.View r10) {
        /*
            r8 = this;
            r2 = 0
            X.C18070vi.A0d(r10, r2)
            super.A21(r9, r10)
            java.lang.String r0 = "MediaPickerFragment/onViewCreated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11P r0 = r8.A07
            if (r0 == 0) goto L_0x015d
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.A02 = r0
            X.1FL r1 = r8.A1D()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            X.C18070vi.A0z(r1, r0)
            android.content.Intent r6 = r1.getIntent()
            X.0ve r3 = r8.A27()
            r1 = 2614(0xa36, float:3.663E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r3, r1)
            java.lang.String r0 = "max_items"
            int r0 = r6.getIntExtra(r0, r1)
            r8.A01 = r0
            java.lang.String r0 = "skip_max_items_new_limit"
            boolean r0 = r6.getBooleanExtra(r0, r2)
            r8.A0L = r0
            java.lang.String r0 = "preview"
            r5 = 1
            boolean r0 = r6.getBooleanExtra(r0, r5)
            r8.A0O = r0
            java.lang.String r0 = "is_in_multi_select_mode_only"
            boolean r0 = r6.getBooleanExtra(r0, r2)
            if (r0 != 0) goto L_0x0057
            boolean r1 = r8.A01()
            r0 = 0
            if (r1 == 0) goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            r8.A0J = r0
            android.content.Context r1 = r8.A14()
            X.79h r0 = new X.79h
            r0.<init>(r1, r8)
            r8.A03 = r0
            boolean r0 = r8.A0J
            if (r0 == 0) goto L_0x006c
            r8.A2J()
        L_0x006c:
            X.1Dv r1 = X.AnonymousClass1BI.A00
            java.lang.String r0 = "jid"
            X.1BI r0 = X.C108965cb.A0Q(r6, r1, r0)
            r8.A09 = r0
            java.lang.String r0 = "is_favorite_filter_enabled"
            boolean r0 = r6.getBooleanExtra(r0, r2)
            r8.A0I = r0
            r7 = 7
            r8.A00 = r7
            X.1FL r1 = X.C72453Mb.A0Z(r8)
            X.1FU r1 = (X.AnonymousClass1FU) r1
            android.content.Intent r3 = r1.getIntent()
            if (r3 == 0) goto L_0x0100
            java.lang.String r4 = r3.resolveType(r1)
            if (r4 == 0) goto L_0x00cc
            java.lang.String r0 = "vnd.android.cursor.dir/image"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "image/*"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00af
        L_0x00a3:
            r8.A00 = r5
            r0 = 2131899312(0x7f1233b0, float:1.9433566E38)
            java.lang.String r0 = r8.A1H(r0)
            r1.setTitle(r0)
        L_0x00af:
            java.lang.String r0 = "vnd.android.cursor.dir/video"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00bf
            java.lang.String r0 = "video/*"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00cc
        L_0x00bf:
            r0 = 4
            r8.A00 = r0
            r0 = 2131899313(0x7f1233b1, float:1.9433568E38)
            java.lang.String r0 = r8.A1H(r0)
            r1.setTitle(r0)
        L_0x00cc:
            android.os.Bundle r4 = r3.getExtras()
            if (r4 == 0) goto L_0x0100
            java.lang.String r0 = "window_title"
            java.lang.String r3 = r4.getString(r0)
            if (r3 == 0) goto L_0x00f5
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x00f5
            r1.A43(r3)
            r0 = 2131436270(0x7f0b22ee, float:1.8494406E38)
            android.view.View r1 = r1.findViewById(r0)
            boolean r0 = r1 instanceof androidx.appcompat.widget.Toolbar
            if (r0 == 0) goto L_0x00f5
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            if (r1 == 0) goto L_0x00f5
            r1.setTitle((java.lang.CharSequence) r3)
        L_0x00f5:
            java.lang.String r1 = "include_media"
            int r0 = r8.A00
            int r0 = r4.getInt(r1, r0)
            r7 = r7 & r0
            r8.A00 = r7
        L_0x0100:
            java.lang.String r0 = "android.intent.extra.STREAM"
            if (r9 == 0) goto L_0x0155
            java.util.ArrayList r1 = r9.getParcelableArrayList(r0)
        L_0x0108:
            if (r1 == 0) goto L_0x011e
            boolean r0 = X.C17880vN.A1X(r1)
            if (r0 == 0) goto L_0x011e
            java.util.HashSet r0 = r8.A0Q
            r0.clear()
            r0.addAll(r1)
            r8.A2J()
            r8.A2B()
        L_0x011e:
            r8.A1Z(r5)
            r8.A2F(r2, r5)
            androidx.recyclerview.widget.RecyclerView r4 = r8.A07
            if (r4 == 0) goto L_0x013c
            X.1oL r3 = r8.A0C
            if (r3 == 0) goto L_0x015a
            android.app.Activity r2 = X.AnonymousClass3Ma.A05(r4)
            r1 = 3
            r3.A02(r2)
            X.28O r0 = new X.28O
            r0.<init>(r2, r3, r1)
            r4.A0t(r0)
        L_0x013c:
            int r0 = r8.A01
            if (r0 <= r5) goto L_0x0154
            X.0ve r0 = r8.A27()
            X.5m1 r1 = new X.5m1
            r1.<init>(r0, r8)
            androidx.recyclerview.widget.RecyclerView r0 = r8.A07
            if (r0 == 0) goto L_0x0152
            java.util.ArrayList r0 = r0.A12
            r0.add(r1)
        L_0x0152:
            r8.A08 = r1
        L_0x0154:
            return
        L_0x0155:
            java.util.ArrayList r1 = r6.getParcelableArrayListExtra(r0)
            goto L_0x0108
        L_0x015a:
            java.lang.String r0 = "scrollPerfLoggerManager"
            goto L_0x015f
        L_0x015d:
            java.lang.String r0 = "time"
        L_0x015f:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPickerFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        C18070vi.A0d(menu, 0);
        if (this.A01 > 1 && !A01()) {
            if (this.A01 > 1) {
                AnonymousClass7FZ r0 = this.A0J;
                if (r0 != null) {
                    if (C18020vd.A05(C18040vf.A02, r0.A00, 8882)) {
                        return;
                    }
                } else {
                    C18070vi.A11("mediaTray");
                    throw null;
                }
            }
            menu.add(0, 2131432622, 0, A1H(2131899379)).setIcon(AnonymousClass4aX.A04(A1n(), A14(), 2130971979, 2131103154, 2131232273)).setShowAsAction(2);
        }
    }

    public boolean A24(MenuItem menuItem) {
        if (AnonymousClass3MY.A01(menuItem, 0) != 2131432622) {
            return false;
        }
        AnonymousClass00H r0 = this.A0F;
        if (r0 != null) {
            ((C20050A4v) r0.get()).A02(33, 1, 1);
            A2J();
            A2B();
            return true;
        }
        C18070vi.A11("mediaSharingUserJourneyLogger");
        throw null;
    }

    public void BwD(AnonymousClass8B2 r4, AnonymousClass65B r5) {
        AnonymousClass00H r0 = this.A0F;
        if (r0 != null) {
            ((C20050A4v) r0.get()).A02(Integer.valueOf(C109005cf.A04(r4)), 1, 1);
            if (r5.A0A() || !C72453Mb.A1a(this.A0S)) {
                A2L(r4);
                return;
            }
            return;
        }
        C18070vi.A11("mediaSharingUserJourneyLogger");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, A27(), 5643) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BwJ(X.AnonymousClass8B2 r7, X.AnonymousClass65B r8) {
        /*
            r6 = this;
            r4 = 0
            r2 = 1
            X.1BI r0 = r6.A09
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x0019
            X.0ve r3 = r6.A27()
            r1 = 5643(0x160b, float:7.908E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 != 0) goto L_0x0019
        L_0x0018:
            return r4
        L_0x0019:
            int r0 = r6.A01
            if (r0 <= r2) goto L_0x0018
            X.00H r0 = r6.A0F
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r3 = r0.get()
            X.A4v r3 = (X.C20050A4v) r3
            int r0 = X.C109005cf.A04(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 4
            r3.A02(r1, r0, r2)
            r5 = 0
            boolean r0 = r8.A0A()
            if (r0 != 0) goto L_0x0043
            X.0vl r0 = r6.A0S
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x0043:
            java.util.HashSet r3 = r6.A0Q
            android.net.Uri r4 = r7.BLl()
            boolean r0 = X.C29431cG.A18(r3, r4)
            if (r0 != 0) goto L_0x0071
            X.5m1 r0 = r6.A08
            if (r0 == 0) goto L_0x0071
            int r1 = r3.size()
            int r0 = r6.A01
            if (r1 >= r0) goto L_0x0071
            androidx.recyclerview.widget.RecyclerView r0 = r6.A07
            if (r0 == 0) goto L_0x0071
            int r0 = androidx.recyclerview.widget.RecyclerView.A01(r8)
            X.5m1 r1 = r6.A08
            if (r1 == 0) goto L_0x0071
            r1.A04 = r2
            r1.A03 = r0
            int r0 = X.C108945cZ.A06(r8)
            r1.A00 = r0
        L_0x0071:
            X.02B r0 = r6.A04
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 == 0) goto L_0x007d
            r6.A2L(r7)
            return r2
        L_0x007d:
            r3.add(r4)
            X.73D r1 = r6.A0P
            X.72S r0 = new X.72S
            r0.<init>(r4)
            r1.A06(r0)
            X.1FL r1 = r6.A1D()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            X.C18070vi.A0z(r1, r0)
            X.01E r1 = (X.AnonymousClass01E) r1
            X.02H r0 = r6.A03
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "actionModeCallback"
            X.C18070vi.A11(r0)
            throw r5
        L_0x009f:
            X.02B r0 = r1.COJ(r0)
            r6.A04 = r0
            r6.A2B()
            int r0 = r3.size()
            r6.A2D(r0)
            return r2
        L_0x00b0:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPickerFragment.BwJ(X.8B2, X.65B):boolean");
    }

    private final boolean A01() {
        if (this.A01 > 1) {
            AnonymousClass7FZ r0 = this.A0J;
            if (r0 != null) {
                if (!C18020vd.A05(C18040vf.A02, r0.A00, 4261)) {
                    return false;
                }
                return true;
            }
            C18070vi.A11("mediaTray");
            throw null;
        }
        return false;
    }

    public void A2I() {
        this.A0Q.clear();
        if (A01()) {
            A2J();
            AnonymousClass02B r0 = this.A04;
            if (r0 != null) {
                r0.A06();
            }
        }
        A2B();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0244, code lost:
        if (r5 != false) goto L_0x0215;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2K(android.net.Uri r22, java.util.Set r23) {
        /*
            r21 = this;
            if (r23 == 0) goto L_0x0379
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x0379
            java.util.ArrayList r10 = X.C17880vN.A10(r23)
            r9 = r21
            X.1BI r0 = r9.A09
            boolean r0 = X.C42701yb.A01(r0)
            r3 = -1
            java.lang.String r8 = "android.intent.extra.STREAM"
            if (r0 == 0) goto L_0x0057
            X.00H r0 = r9.A0D
            if (r0 == 0) goto L_0x0330
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0057
            java.util.ArrayList r5 = X.C29351c6.A0D(r10)
            java.util.Iterator r4 = r10.iterator()
        L_0x002f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0360
            android.net.Uri r2 = X.C108945cZ.A0M(r4)
            X.C18070vi.A0b(r2)
            X.00H r0 = r9.A0E
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r0.get()
            X.6u4 r0 = (X.C136596u4) r0
            boolean r1 = r0.A02(r2)
            X.4cI r0 = new X.4cI
            r0.<init>(r1, r2)
            r5.add(r0)
            goto L_0x002f
        L_0x0053:
            java.lang.String r0 = "cameraStateManager"
            goto L_0x0332
        L_0x0057:
            X.1FL r15 = r9.A1D()
            boolean r0 = r9.A0O
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0337
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "origin"
            int r5 = r1.getIntExtra(r0, r6)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "should_send_media"
            boolean r11 = r1.getBooleanExtra(r0, r6)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "should_hide_caption_view"
            boolean r13 = r1.getBooleanExtra(r0, r7)
            X.1FL r12 = r9.A1D()
            X.6yo r4 = new X.6yo
            r4.<init>(r12)
            r4.A0I = r10
            X.1BI r0 = r9.A09
            java.lang.String r0 = X.C22971Dz.A06(r0)
            r4.A0D = r0
            int r1 = r9.A01
            java.util.HashSet r14 = r9.A0Q
            int r0 = r14.size()
            int r1 = r1 - r0
            r4.A00 = r1
            boolean r0 = r9.A0K
            r4.A0T = r0
            r4.A01 = r5
            X.11P r0 = r9.A07
            if (r0 == 0) goto L_0x032d
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r9.A02
            long r0 = r0 - r2
            r4.A03 = r0
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "picker_open_time"
            r2 = 0
            long r0 = r1.getLongExtra(r0, r2)
            r4.A04 = r0
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "quoted_message_row_id"
            long r0 = r1.getLongExtra(r0, r2)
            r4.A05 = r0
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "quoted_group_jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            r4.A0E = r0
            r0 = 20
            boolean r0 = X.AnonymousClass000.A1S(r5, r0)
            r4.A0O = r0
            r4.A0S = r11
            r4.A0R = r13
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "number_from_url"
            boolean r0 = r1.getBooleanExtra(r0, r7)
            r4.A0N = r0
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "send_media_preview_params_as_result"
            boolean r0 = r1.getBooleanExtra(r0, r7)
            r4.A0Q = r0
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "standalone_add_button_provider_key"
            java.lang.String r0 = r1.getStringExtra(r0)
            r4.A0F = r0
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "apply_rotation_on_not_send"
            boolean r0 = r1.getBooleanExtra(r0, r7)
            r4.A0J = r0
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "enable_template_tool"
            boolean r0 = r1.getBooleanExtra(r0, r7)
            r4.A0L = r0
            r0 = 35
            if (r5 == r0) goto L_0x024e
            r0 = 37
            if (r5 == r0) goto L_0x024e
            r0 = 40
            if (r5 == r0) goto L_0x024e
            r0 = 54
            if (r5 == r0) goto L_0x024e
            if (r11 == 0) goto L_0x024e
            r4.A0P = r6
        L_0x0132:
            X.731 r2 = r9.A05
            if (r2 == 0) goto L_0x032a
            X.02B r0 = r9.A04
            boolean r1 = X.AnonymousClass000.A1W(r0)
            int r0 = r14.size()
            r2.A04(r1, r0)
            X.73D r3 = r9.A0P
            java.lang.Object r0 = r10.get(r7)
            android.net.Uri r0 = (android.net.Uri) r0
            X.72S r5 = r3.A02(r0)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "mentions"
            java.lang.String r0 = r1.getStringExtra(r0)
            java.util.ArrayList r2 = X.AnonymousClass4aJ.A03(r0)
            X.00H r0 = r9.A0G
            if (r0 == 0) goto L_0x0327
            java.lang.Object r1 = r0.get()
            X.2kg r1 = (X.C58432kg) r1
            java.lang.String r0 = r5.A0G()
            java.util.List r1 = r1.A00(r0)
            boolean r0 = X.C137476vW.A00(r2)
            if (r0 != 0) goto L_0x0193
            boolean r0 = X.C137476vW.A00(r1)
            if (r0 == 0) goto L_0x0193
            X.00H r0 = r9.A0G
            if (r0 == 0) goto L_0x0327
            java.lang.Object r1 = r0.get()
            X.2kg r1 = (X.C58432kg) r1
            java.lang.String r0 = r5.A0H()
            r1.A01(r0, r2)
            java.lang.String r0 = r5.A0H()
            r5.A0S(r0)
        L_0x0193:
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r2 = r1.getStringExtra(r0)
            java.lang.String r1 = r5.A0E()
            if (r2 == 0) goto L_0x01b4
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x01b4
            if (r1 == 0) goto L_0x01b1
            int r0 = r1.length()
            if (r0 != 0) goto L_0x01b4
        L_0x01b1:
            r5.A0P(r2)
        L_0x01b4:
            java.lang.Integer r0 = r9.A0N
            r4.A0A = r0
            X.C139416yo.A00(r3, r4)
            r0 = r22
            r4.A07 = r0
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "is_send_as_document"
            boolean r5 = r1.getBooleanExtra(r0, r7)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "disable_shared_activity_transition_animation"
            boolean r1 = r1.getBooleanExtra(r0, r7)
            boolean r0 = X.AnonymousClass745.A00
            if (r0 == 0) goto L_0x0247
            if (r1 != 0) goto L_0x0247
            int r0 = r10.size()
            if (r0 != r6) goto L_0x0247
            android.view.View r0 = r9.A0B
            if (r0 == 0) goto L_0x0247
            java.lang.Object r11 = r10.get(r7)
            android.net.Uri r11 = (android.net.Uri) r11
            if (r11 == 0) goto L_0x0240
            androidx.recyclerview.widget.RecyclerView r0 = r9.A07
            if (r0 == 0) goto L_0x0240
            java.util.Iterator r1 = X.C99434so.A00(r0, r6)
        L_0x01f3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0240
            android.view.View r2 = X.AnonymousClass3MX.A0E(r1)
            boolean r0 = r2 instanceof X.AnonymousClass65B
            if (r0 == 0) goto L_0x01f3
            X.65B r2 = (X.AnonymousClass65B) r2
            android.net.Uri r0 = r2.getUri()
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01f3
            r4.A06 = r11
            X.1BI r3 = r9.A09
            if (r3 == 0) goto L_0x0274
            if (r5 == 0) goto L_0x0274
        L_0x0215:
            X.1PM r1 = r9.A06
            if (r1 == 0) goto L_0x0270
            int r0 = r10.size()
            boolean r0 = X.AnonymousClass747.A04(r1, r3, r0)
            if (r0 == 0) goto L_0x0252
            java.lang.Object r0 = r10.get(r7)
            android.net.Uri r0 = (android.net.Uri) r0
            r18 = 0
            r17 = r3
            r19 = r18
            r20 = r7
            r16 = r0
            android.content.Intent r1 = X.AnonymousClass1LU.A0Q(r15, r16, r17, r18, r19, r20)
            X.C18070vi.A0X(r1)
            r0 = 36
            r15.startActivityForResult(r1, r0)
            return
        L_0x0240:
            X.1BI r3 = r9.A09
            if (r3 == 0) goto L_0x031f
            if (r5 == 0) goto L_0x031f
            goto L_0x0215
        L_0x0247:
            X.1BI r3 = r9.A09
            if (r3 == 0) goto L_0x031b
            if (r5 == 0) goto L_0x031b
            goto L_0x0215
        L_0x024e:
            r4.A0P = r7
            goto L_0x0132
        L_0x0252:
            android.content.Intent r2 = X.C17880vN.A0A()
            android.content.Intent r0 = X.C108955ca.A0B(r9)
            android.net.Uri r1 = r0.getData()
            java.lang.String r0 = "bucket_uri"
            r2.putExtra(r0, r1)
            java.util.ArrayList r0 = X.C17880vN.A10(r10)
            r2.putParcelableArrayListExtra(r8, r0)
            r0 = -1
            r15.setResult(r0, r2)
            goto L_0x0376
        L_0x0270:
            java.lang.String r0 = "verifiedNameManager"
            goto L_0x0332
        L_0x0274:
            android.content.Intent r4 = r4.A01()
            X.1FL r3 = r9.A1D()
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.lang.String r0 = r11.toString()
            X.AnonymousClass3Ma.A1P(r2, r0, r8)
            android.view.View r1 = r9.A17()
            r0 = 2131431389(0x7f0b0fdd, float:1.8484506E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r1)
            X.AnonymousClass3Ma.A1P(r1, r0, r8)
            android.view.View r1 = r9.A17()
            r0 = 2131436420(0x7f0b2384, float:1.849471E38)
            android.view.View r5 = r1.findViewById(r0)
            X.1FL r0 = r9.A1D()
            X.4ZR r1 = new X.4ZR
            r1.<init>(r0)
            r0 = 2131899527(0x7f123487, float:1.9434002E38)
            java.lang.String r0 = r1.A02(r0)
            X.AnonymousClass1Xr.A04(r5, r0)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r5)
            X.AnonymousClass3Ma.A1P(r5, r0, r8)
            android.view.View r1 = r9.A17()
            r0 = 2131431058(0x7f0b0e92, float:1.8483834E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r1)
            X.AnonymousClass3Ma.A1P(r1, r0, r8)
            android.view.View r1 = r9.A17()
            r0 = 2131431069(0x7f0b0e9d, float:1.8483857E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r1)
            X.AnonymousClass3Ma.A1P(r1, r0, r8)
            android.graphics.Bitmap r5 = r2.A06
            if (r5 == 0) goto L_0x02fb
            X.1Lp r0 = r9.A09
            if (r0 == 0) goto L_0x0318
            X.1ga r2 = r0.A05()
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r11)
            java.lang.String r0 = "-gallery_thumb"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r2.A0F(r0, r5)
        L_0x02fb:
            X.0yx[] r0 = new X.C19760yx[r7]
            java.lang.Object[] r1 = r8.toArray(r0)
            X.0yx[] r1 = (X.C19760yx[]) r1
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            X.0yx[] r0 = (X.C19760yx[]) r0
            X.5hM r0 = X.C1406772n.A01(r3, r0)
            android.app.ActivityOptions r0 = r0.A00
            android.os.Bundle r0 = r0.toBundle()
            r3.startActivityForResult(r4, r6, r0)
            return
        L_0x0318:
            java.lang.String r0 = "caches"
            goto L_0x0332
        L_0x031b:
            X.1FL r15 = r9.A1D()
        L_0x031f:
            android.content.Intent r0 = r4.A01()
            r15.startActivityForResult(r0, r6)
            return
        L_0x0327:
            java.lang.String r0 = "mentionState"
            goto L_0x0332
        L_0x032a:
            java.lang.String r0 = "cameraCaptureFlowLogger"
            goto L_0x0332
        L_0x032d:
            java.lang.String r0 = "time"
            goto L_0x0332
        L_0x0330:
            java.lang.String r0 = "botGatingLazy"
        L_0x0332:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0337:
            android.content.Intent r2 = X.C17880vN.A0A()
            android.content.Intent r0 = X.C108955ca.A0B(r9)
            android.net.Uri r1 = r0.getData()
            java.lang.String r0 = "bucket_uri"
            r2.putExtra(r0, r1)
            r2.putParcelableArrayListExtra(r8, r10)
            int r0 = r10.size()
            if (r0 != r6) goto L_0x035e
            java.lang.Object r0 = r10.get(r7)
            android.net.Uri r0 = (android.net.Uri) r0
        L_0x0357:
            r2.setData(r0)
            r15.setResult(r3, r2)
            goto L_0x0376
        L_0x035e:
            r0 = 0
            goto L_0x0357
        L_0x0360:
            java.util.ArrayList r0 = X.C17880vN.A10(r5)
            android.content.Intent r1 = X.C17880vN.A0A()
            r1.putParcelableArrayListExtra(r8, r0)
            X.1FL r0 = r9.A1D()
            r0.setResult(r3, r1)
            X.1FL r15 = r9.A1D()
        L_0x0376:
            r15.finish()
        L_0x0379:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPickerFragment.A2K(android.net.Uri, java.util.Set):void");
    }

    public boolean Bf1() {
        return AnonymousClass000.A1W(this.A04);
    }

    public boolean BjF() {
        if (!this.A0L) {
            C109005cf.A0l(this, this.A0Q.size());
        }
        if (this.A0Q.size() < this.A01) {
            return false;
        }
        return true;
    }

    public void CHD(AnonymousClass8B2 r3) {
        if (!C29431cG.A18(this.A0Q, r3.BLl())) {
            A2L(r3);
        }
    }

    public void CMv() {
        Toast toast = this.A06;
        if (toast != null) {
            toast.cancel();
        }
        AnonymousClass1KB A26 = A26();
        Context A14 = A14();
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, this.A01);
        Toast A032 = A26.A03(A14.getString(2131896124, A1a));
        A032.show();
        this.A06 = A032;
    }

    public void CQF(AnonymousClass8B2 r3) {
        if (C29431cG.A18(this.A0Q, r3.BLl())) {
            A2L(r3);
        }
    }

    public void A1r() {
        ImageView imageView;
        super.A1r();
        this.A04 = null;
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            Iterator A002 = C99434so.A00(recyclerView, 1);
            while (A002.hasNext()) {
                View A0E2 = AnonymousClass3MX.A0E(A002);
                if ((A0E2 instanceof C1188465m) && (imageView = (ImageView) A0E2) != null) {
                    imageView.setImageDrawable((Drawable) null);
                }
            }
        }
    }

    public void A1t() {
        super.A1t();
        if (this.A0M != null) {
            AnonymousClass00H r0 = this.A0H;
            if (r0 != null) {
                ((C29831cw) r0.get()).A02(this.A0M, A1D());
                this.A0M = null;
                return;
            }
            C18070vi.A11("runtimeReceiverCompat");
            throw null;
        }
    }

    public void A1u() {
        super.A1u();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addDataScheme("file");
        this.A0M = new C109305dA(this, 3);
        AnonymousClass00H r0 = this.A0H;
        if (r0 != null) {
            ((C29831cw) r0.get()).A01(A1D(), this.A0M, intentFilter, true);
        } else {
            C18070vi.A11("runtimeReceiverCompat");
            throw null;
        }
    }

    public void A2J() {
        AnonymousClass1FL A1D = A1D();
        C18070vi.A0z(A1D, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AnonymousClass01E r1 = (AnonymousClass01E) A1D;
        AnonymousClass02H r0 = this.A03;
        if (r0 == null) {
            C18070vi.A11("actionModeCallback");
            throw null;
        } else {
            this.A04 = r1.COJ(r0);
        }
    }

    public void A2L(AnonymousClass8B2 r8) {
        Uri BLl = r8.BLl();
        if (AnonymousClass000.A1W(this.A04)) {
            HashSet hashSet = this.A0Q;
            if (C29431cG.A18(hashSet, BLl)) {
                hashSet.remove(BLl);
                this.A0P.A03(BLl);
            } else {
                if (!this.A0L) {
                    C109005cf.A0l(this, hashSet.size());
                }
                if (hashSet.size() >= this.A01) {
                    Toast toast = this.A06;
                    if (toast != null) {
                        toast.cancel();
                    }
                    AnonymousClass1KB A26 = A26();
                    Context A14 = A14();
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1L(objArr, this.A01);
                    Toast A032 = A26.A03(A14.getString(2131896124, objArr));
                    A032.show();
                    this.A06 = A032;
                } else {
                    hashSet.add(BLl);
                    this.A0P.A06(new AnonymousClass72S(BLl));
                }
            }
            AnonymousClass02B r0 = this.A04;
            if (r0 != null) {
                r0.A06();
            }
            if (hashSet.size() > 0) {
                A26().A0K(C146747Ql.A00(this, 44), 300);
            }
            A2B();
        } else if (BLl != null) {
            HashSet A12 = C17880vN.A12();
            A12.add(BLl);
            A2K((Uri) null, A12);
            this.A0P.A06(new AnonymousClass72S(BLl));
        }
    }
}
