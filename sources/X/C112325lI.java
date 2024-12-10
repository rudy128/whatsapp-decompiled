package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallery.adapters.GalleryMediaAdapter$loadVideoDuration$1$1;
import com.whatsapp.gallery.adapters.GalleryMediaAdapter$onBindMediaItemView$1;
import com.whatsapp.gallery.adapters.MediaAdapter$loadVideoDuration$1;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.5lI  reason: invalid class name and case insensitive filesystem */
public class C112325lI extends C38391rD {
    public long A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final MediaGalleryFragmentBase A03;
    public final C200710s A04;
    public final AnonymousClass00H A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final AnonymousClass8A8 A09;
    public final AnonymousClass8A9 A0A;
    public final AnonymousClass00H A0B;
    public final Map A0C;
    public final boolean A0D;

    public void A0R(C42011xT r3) {
        C18070vi.A0d(r3, 0);
        if (r3 instanceof C113295mr) {
            AnonymousClass65B r1 = ((C113295mr) r3).A03;
            r1.setImageBitmap((Bitmap) null);
            r1.A06 = null;
            View view = r3.A0H;
            if ((view.getTag() instanceof AnonymousClass891) && C72453Mb.A1a(this.A06)) {
                A02(view, this.A03);
            }
        }
    }

    public void Bmc(C42011xT r10, int i) {
        C200710s r2;
        int i2;
        C42011xT r4 = r10;
        C18070vi.A0d(r10, 0);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A03;
        if (!C72453Mb.A1a(mediaGalleryFragmentBase.A0f)) {
            RecyclerView recyclerView = mediaGalleryFragmentBase.A07;
            if (recyclerView != null) {
                i2 = recyclerView.getChildCount();
            } else {
                i2 = 0;
            }
            if (mediaGalleryFragmentBase.A00 < i2) {
                mediaGalleryFragmentBase.A00 = i2;
                RecyclerView recyclerView2 = mediaGalleryFragmentBase.A07;
                if (recyclerView2 != null) {
                    C42001xS A002 = C38441rI.A00(recyclerView2.getRecycledViewPool(), 1);
                    A002.A00 = i2;
                    ArrayList arrayList = A002.A03;
                    while (arrayList.size() > i2) {
                        arrayList.remove(AnonymousClass000.A0Q(arrayList));
                    }
                }
            }
        }
        if (r10 instanceof C113295mr) {
            C113295mr r42 = (C113295mr) r4;
            int max = Math.max(i - ((int) A01()), 0);
            if (this instanceof AnonymousClass65N) {
                AnonymousClass65N r5 = (AnonymousClass65N) this;
                C18070vi.A0d(r42, 0);
                View view = r42.A0H;
                C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.gallery.MediaItemView");
                AnonymousClass65B r1 = (AnonymousClass65B) view;
                r1.A06 = null;
                AnonymousClass3MW.A1R(r1);
                MediaGalleryFragmentBase mediaGalleryFragmentBase2 = r5.A02;
                C160878Ah r0 = mediaGalleryFragmentBase2.A0G;
                if (r0 != null) {
                    AnonymousClass8B2 BUY = r0.BUY(max);
                    if (BUY != null) {
                        r5.A0V(BUY, r42, max);
                    } else if (r42.A00 == null) {
                        int i3 = r5.A01 + 1;
                        r5.A01 = i3;
                        r42.A00 = Integer.valueOf(i3);
                        AnonymousClass3MX.A1Q(new GalleryMediaAdapter$onBindMediaItemView$1(r42, r5, (C30391dr) null, i3, max), AnonymousClass3MZ.A0H(mediaGalleryFragmentBase2));
                    }
                }
            } else {
                C18070vi.A0d(r42, 0);
                View view2 = r42.A0H;
                C18070vi.A0z(view2, "null cannot be cast to non-null type com.whatsapp.gallery.MediaItemView");
                AnonymousClass65B r12 = (AnonymousClass65B) view2;
                r12.A06 = null;
                AnonymousClass3MW.A1R(r12);
                C160878Ah r02 = mediaGalleryFragmentBase.A0G;
                if (r02 != null) {
                    AnonymousClass8B2 BUY2 = r02.BUY(max);
                    A0V(BUY2, r42, max);
                    if (BUY2 == null && (r2 = mediaGalleryFragmentBase.A0K) != null) {
                        r2.execute(new AnonymousClass7RM((Object) mediaGalleryFragmentBase, max, 7));
                    }
                }
            }
        } else if (r10 instanceof C112835m7) {
            AnonymousClass8A8 r22 = this.A09;
            View view3 = r10.A0H;
            C18070vi.A0W(view3);
            C84084Hu.A00(view3, new C158177zr(r22));
            AnonymousClass1Y5.A03(view3, 2131890606);
            AnonymousClass3MW.A1Q(view3);
        } else if (!(r10 instanceof C112845m8)) {
            Log.w("MediaAdapter/onBindViewHolder unknown view holder");
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [X.65B, X.5h5, X.657] */
    /* JADX WARNING: type inference failed for: r3v8, types: [X.65B, X.5h5, X.657] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        if (X.C72453Mb.A1a(r4.A0S) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0086, code lost:
        if (X.C72453Mb.A1a(r4.A0H) == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C42011xT BqY(android.view.ViewGroup r15, int r16) {
        /*
            r14 = this;
            r2 = 0
            X.C18070vi.A0d(r15, r2)
            r0 = 2
            r3 = r16
            if (r3 == r0) goto L_0x0114
            r1 = 3
            java.util.List r0 = X.C42011xT.A0I
            if (r3 == r1) goto L_0x0089
            X.8A8 r2 = r14.A09
            com.whatsapp.gallery.MediaGalleryFragmentBase r4 = r14.A03
            boolean r0 = r4 instanceof com.whatsapp.storage.StorageUsageMediaGalleryFragment
            if (r0 == 0) goto L_0x0034
            X.1FL r0 = r4.A1B()
            X.657 r3 = new X.657
            r3.<init>(r0)
            r3.A06()
            r0 = 1
            r3.A00 = r0
        L_0x0025:
            r3.setSelectable(r0)
        L_0x0028:
            X.0vl r0 = r14.A08
            boolean r0 = X.C72453Mb.A1a(r0)
            X.5mr r7 = new X.5mr
            r7.<init>(r2, r3, r0)
        L_0x0033:
            return r7
        L_0x0034:
            boolean r0 = r4 instanceof com.whatsapp.gallerypicker.MediaPickerFragment
            if (r0 == 0) goto L_0x004d
            com.whatsapp.gallerypicker.MediaPickerFragment r4 = (com.whatsapp.gallerypicker.MediaPickerFragment) r4
            X.1FL r0 = r4.A1D()
            X.65m r3 = new X.65m
            r3.<init>(r0)
            X.0vl r0 = r4.A0S
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x0028
        L_0x004b:
            r0 = 1
            goto L_0x0025
        L_0x004d:
            boolean r0 = r4 instanceof com.whatsapp.gallery.MediaGalleryFragment
            if (r0 == 0) goto L_0x0075
            com.whatsapp.gallery.MediaGalleryFragment r4 = (com.whatsapp.gallery.MediaGalleryFragment) r4
            X.1FL r0 = r4.A1B()
            X.657 r3 = new X.657
            r3.<init>(r0)
            r3.A06()
            r1 = 1
            r3.A00 = r1
            r0 = 2
            r3.A00 = r0
            X.00H r0 = r4.A08
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x0028
            r3.setSelectable(r1)
            goto L_0x0028
        L_0x0075:
            com.whatsapp.gallery.GalleryRecentsFragment r4 = (com.whatsapp.gallery.GalleryRecentsFragment) r4
            X.1FL r0 = r4.A1D()
            X.65m r3 = new X.65m
            r3.<init>(r0)
            X.0vl r0 = r4.A0H
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x0028
            goto L_0x004b
        L_0x0089:
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r15)
            r0 = 2131625424(0x7f0e05d0, float:1.8878056E38)
            android.view.View r9 = X.AnonymousClass3MX.A0B(r1, r15, r0, r2)
            com.whatsapp.gallery.MediaGalleryFragmentBase r8 = r14.A03
            X.8A9 r1 = r14.A0A
            r6 = 1
            X.5m8 r7 = new X.5m8
            r7.<init>(r9)
            boolean r0 = r9 instanceof com.whatsapp.wds.components.actiontile.WDSActionTileGroup
            if (r0 == 0) goto L_0x010c
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
        L_0x00a4:
            if (r1 == 0) goto L_0x010e
            if (r9 == 0) goto L_0x010e
            java.util.List r5 = r1.BS7()
            boolean r0 = X.AnonymousClass000.A1a(r5)
            if (r0 == 0) goto L_0x0033
            java.util.Iterator r13 = r5.iterator()
            r1 = 0
        L_0x00b7:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r10 = r13.next()
            int r12 = r1 + 1
            if (r1 >= 0) goto L_0x00ca
            X.AnonymousClass1ZU.A0B()
            r0 = 0
            throw r0
        L_0x00ca:
            X.6ru r10 = (X.C135256ru) r10
            int r0 = X.AnonymousClass3MX.A02(r5, r6)
            boolean r11 = X.AnonymousClass000.A1S(r1, r0)
            android.view.View r0 = r7.A0H
            android.view.LayoutInflater r4 = X.AnonymousClass3MZ.A0D(r0)
            r0 = 2131625422(0x7f0e05ce, float:1.8878052E38)
            r3 = 0
            android.view.View r2 = r4.inflate(r0, r9, r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wds.components.actiontile.WDSActionTile"
            X.C18070vi.A0z(r2, r0)
            com.whatsapp.wds.components.actiontile.WDSActionTile r2 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r2
            int r1 = r10.A00
            int r0 = r10.A01
            r2.setIcon((int) r1)
            r2.setText((int) r0)
            r9.addView(r2)
            X.82J r0 = new X.82J
            r0.<init>(r8, r10)
            X.C84084Hu.A00(r2, r0)
            if (r11 == 0) goto L_0x010a
            r0 = 2131625421(0x7f0e05cd, float:1.887805E38)
            android.view.View r0 = r4.inflate(r0, r9, r3)
            r9.addView(r0)
        L_0x010a:
            r1 = r12
            goto L_0x00b7
        L_0x010c:
            r9 = 0
            goto L_0x00a4
        L_0x010e:
            java.lang.String r0 = "MediaPickerActionViewHolder/init: view is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r7
        L_0x0114:
            android.view.LayoutInflater r1 = X.AnonymousClass3MY.A0B(r15)
            r0 = 2131625409(0x7f0e05c1, float:1.8878025E38)
            android.view.View r0 = X.AnonymousClass3MX.A0B(r1, r15, r0, r2)
            X.5m7 r7 = new X.5m7
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112325lI.BqY(android.view.ViewGroup, int):X.1xT");
    }

    public static int A00(MediaGalleryFragmentBase mediaGalleryFragmentBase, int i) {
        return ((C147397Sz) ((AnonymousClass87A) mediaGalleryFragmentBase.A0b.get(i))).bucketCount;
    }

    public static void A02(View view, MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        C136166tN r2 = mediaGalleryFragmentBase.A0H;
        if (r2 != null) {
            Object tag = view.getTag();
            C18070vi.A0z(tag, "null cannot be cast to non-null type com.whatsapp.gallerypicker.MediaThumbLoader.BitmapLoader");
            r2.A01((AnonymousClass891) tag);
        }
    }

    private final boolean A03() {
        AnonymousClass8A9 r2 = this.A0A;
        if (r2 != null && r2.BED()) {
            return true;
        }
        if (!this.A09.BeG() || r2 != null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.4rE] */
    public void A0U(AnonymousClass8B2 r8, AnonymousClass65B r9, C113295mr r10) {
        ? obj = new Object();
        AnonymousClass7HW r5 = new AnonymousClass7HW(r8, r9, r10, this);
        r9.setTag(r5);
        C144427Hg r1 = new C144427Hg(r8, r9, this, r5, obj);
        C136166tN r0 = this.A03.A0H;
        if (r0 != null) {
            r0.A02(r5, r1);
        }
    }

    public void A0V(AnonymousClass8B2 r12, C113295mr r13, int i) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase;
        ViewTreeObserver viewTreeObserver;
        AnonymousClass797 r2;
        AnonymousClass854 r22;
        MediaGalleryFragmentBase mediaGalleryFragmentBase2;
        File BQC;
        AnonymousClass854 r23;
        AnonymousClass8B2 r5 = r12;
        C113295mr r7 = r13;
        if (this instanceof AnonymousClass65N) {
            AnonymousClass65N r8 = (AnonymousClass65N) this;
            View view = r13.A0H;
            C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.gallery.MediaItemView");
            AnonymousClass65B r6 = (AnonymousClass65B) view;
            r6.setMediaItem(r12);
            if ((r6 instanceof AnonymousClass854) && (r23 = (AnonymousClass854) r6) != null) {
                ((AnonymousClass657) r23).A07 = AnonymousClass000.A1T(r8.A02.A03, 3);
            }
            if (r12 != null) {
                r8.A0U(r12, r6, r13);
                if (r12.getType() == 1 && (BQC = r12.BQC()) != null) {
                    if (r12 instanceof AnonymousClass65a) {
                        long j = ((AnonymousClass65a) r5).A00;
                        if (j > 0) {
                            r6.setDuration(Long.valueOf(j));
                        }
                    }
                    if (r13.A01 == null) {
                        AnonymousClass3MX.A1Q(new GalleryMediaAdapter$loadVideoDuration$1$1(r5, r6, r7, r8, BQC, (C30391dr) null), AnonymousClass2SS.A00(r8.A02));
                    }
                }
                mediaGalleryFragmentBase2 = r8.A02;
                if (mediaGalleryFragmentBase2.A2H(i)) {
                    r6.A09(mediaGalleryFragmentBase2.A2A(r12));
                }
                r6.A07();
            } else {
                r6.setScaleType(ImageView.ScaleType.CENTER);
                mediaGalleryFragmentBase2 = r8.A02;
                r6.setBackgroundColor(mediaGalleryFragmentBase2.A02);
                r6.setImageDrawable((Drawable) null);
                r6.A07();
            }
            if (!mediaGalleryFragmentBase2.A0U) {
                mediaGalleryFragmentBase2.A0U = true;
                viewTreeObserver = r6.getViewTreeObserver();
                r2 = new AnonymousClass797(r6, mediaGalleryFragmentBase2, 0);
            } else {
                return;
            }
        } else {
            View view2 = r13.A0H;
            C18070vi.A0z(view2, "null cannot be cast to non-null type com.whatsapp.gallery.MediaItemView");
            AnonymousClass65B r3 = (AnonymousClass65B) view2;
            r3.setMediaItem(r12);
            if ((r3 instanceof AnonymousClass854) && (r22 = (AnonymousClass854) r3) != null) {
                ((AnonymousClass657) r22).A07 = AnonymousClass000.A1T(this.A03.A03, 3);
            }
            if (r3.getTag() instanceof AnonymousClass891) {
                A02(r3, this.A03);
            }
            if (r12 != null) {
                A0U(r12, r3, r13);
                if (r12.getType() == 1) {
                    if (C18020vd.A05(C18040vf.A02, this.A01, 9021)) {
                        AnonymousClass3MW.A1X(new C23791Hq(this.A04), new MediaAdapter$loadVideoDuration$1(r12, r3, this, (C30391dr) null), AnonymousClass2SS.A00(this.A03));
                    }
                }
                mediaGalleryFragmentBase = this.A03;
                if (mediaGalleryFragmentBase.A2H(i)) {
                    r3.A09(mediaGalleryFragmentBase.A2A(r12));
                }
                r3.A07();
            } else {
                r3.setScaleType(ImageView.ScaleType.CENTER);
                mediaGalleryFragmentBase = this.A03;
                r3.setBackgroundColor(mediaGalleryFragmentBase.A02);
                r3.setImageDrawable((Drawable) null);
                r3.A07();
            }
            if (!mediaGalleryFragmentBase.A0U) {
                mediaGalleryFragmentBase.A0U = true;
                viewTreeObserver = r3.getViewTreeObserver();
                r2 = new AnonymousClass797(r3, mediaGalleryFragmentBase, 0);
            } else {
                return;
            }
        }
        viewTreeObserver.addOnPreDrawListener(r2);
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            if (this.A0D) {
                return 3;
            }
        } else if (i != 1 || !this.A0D) {
            return 1;
        }
        if (!A03()) {
            return 1;
        }
        return 2;
    }

    public C112325lI(C18030ve r4, AnonymousClass18K r5, AnonymousClass8A8 r6, MediaGalleryFragmentBase mediaGalleryFragmentBase, AnonymousClass10I r8, AnonymousClass00H r9, AnonymousClass00H r10, Integer num) {
        int intValue;
        Map map;
        this.A01 = r4;
        this.A09 = r6;
        this.A03 = mediaGalleryFragmentBase;
        this.A05 = r9;
        this.A0B = r10;
        this.A02 = r5;
        AnonymousClass8A9 r0 = null;
        if (!(num == null || (intValue = num.intValue()) == -1 || r10 == null || (map = (Map) r10.get()) == null)) {
            r0 = (AnonymousClass8A9) AnonymousClass000.A0w(map, intValue);
        }
        this.A0A = r0;
        boolean z = false;
        if (r0 != null && !r0.BS7().isEmpty()) {
            z = true;
        }
        this.A0D = z;
        this.A00 = A01();
        this.A0C = C17880vN.A11();
        this.A04 = C200710s.A00(r8);
        this.A08 = AnonymousClass1DF.A01(new C151267m1(this));
        this.A06 = AnonymousClass1DF.A01(new C151247lz(this));
        this.A07 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C151257m0(this));
    }

    private final long A01() {
        if (!A03() && !this.A0D) {
            return 0;
        }
        if (!A03() || !this.A0D) {
            return 1;
        }
        return 2;
    }

    public long A0M(int i) {
        boolean A032 = A03();
        if (i == 0 && (this.A0D || A032)) {
            return 0;
        }
        if (i == 1 && this.A0D && A032 && this.A00) {
            return 1;
        }
        int max = Math.max(i - ((int) A01()), 0);
        C160878Ah r0 = this.A03.A0G;
        AnonymousClass8B2 r1 = null;
        if (r0 != null) {
            r1 = r0.BUY(max);
        }
        if (!this.A00 || r1 == null) {
            return A01();
        }
        String BQD = r1.BQD();
        if (BQD == null) {
            Uri BLl = r1.BLl();
            if (C18070vi.A18(BLl, Uri.EMPTY) || (BQD = BLl.toString()) == null) {
                return A01();
            }
        }
        Map map = this.A0C;
        Number A1E = C108945cZ.A1E(BQD, map);
        if (A1E == null) {
            long j = this.A00;
            this.A00 = 1 + j;
            A1E = Long.valueOf(j);
            map.put(BQD, A1E);
        }
        return A1E.longValue();
    }

    public int A0Q() {
        int A012 = (int) A01();
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A03;
        C219217x r0 = mediaGalleryFragmentBase.A0C;
        if (r0 != null) {
            int i = 0;
            if (r0.A05() != AnonymousClass00R.A01) {
                if (C18020vd.A05(C18040vf.A02, mediaGalleryFragmentBase.A27(), 4647)) {
                    C160878Ah r02 = mediaGalleryFragmentBase.A0G;
                    if (r02 != null) {
                        i = r02.getCount();
                    }
                } else {
                    i = mediaGalleryFragmentBase.A01;
                }
            }
            return i + A012;
        }
        C18070vi.A11("waPermissionsHelper");
        throw null;
    }
}
