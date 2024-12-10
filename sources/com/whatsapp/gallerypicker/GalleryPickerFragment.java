package com.whatsapp.gallerypicker;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11B;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass1FL;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1OX;
import X.AnonymousClass1Q5;
import X.AnonymousClass20F;
import X.AnonymousClass28M;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6WQ;
import X.AnonymousClass7AT;
import X.AnonymousClass7S3;
import X.AnonymousClass7SB;
import X.C108945cZ;
import X.C108975cc;
import X.C108985cd;
import X.C108995ce;
import X.C109305dA;
import X.C109355dJ;
import X.C112035kp;
import X.C136166tN;
import X.C142657Ah;
import X.C151347m9;
import X.C151357mA;
import X.C156047tj;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C219217x;
import X.C24771Lp;
import X.C27201Vd;
import X.C29831cw;
import X.C30391dr;
import X.C30451dy;
import X.C31191fA;
import X.C38391rD;
import X.C41561wd;
import X.C72453Mb;
import X.C72463Mc;
import X.C86504Rw;
import X.C99274sY;
import X.C99434so;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.SquareImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadFolders$1;
import com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations;
import java.util.Iterator;

public class GalleryPickerFragment extends Hilt_GalleryPickerFragment {
    public int A00 = 1;
    public int A01;
    public int A02;
    public Drawable A03;
    public View A04;
    public AnonymousClass1KB A05;
    public WaTextView A06;
    public C24771Lp A07;
    public C31191fA A08;
    public AnonymousClass1M9 A09;
    public C27201Vd A0A;
    public AnonymousClass11C A0B;
    public AnonymousClass11P A0C;
    public AnonymousClass118 A0D;
    public C219217x A0E;
    public C18000vb A0F;
    public C18030ve A0G;
    public C112035kp A0H;
    public C136166tN A0I;
    public AnonymousClass1Q5 A0J;
    public AnonymousClass10I A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public BroadcastReceiver A0Q;
    public ContentObserver A0R;
    public RecyclerView A0S;
    public GridLayoutManagerNonPredictiveAnimations A0T;
    public boolean A0U;
    public boolean A0V;
    public final int A0W;
    public final C18100vl A0X;
    public final C18100vl A0Y;
    public final C18100vl A0Z;
    public final Handler A0a = C17890vO.A0D();

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625426, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        AnonymousClass7AT.A01(A1G(), ((GalleryPickerViewModel) this.A0Z.getValue()).A07, AnonymousClass7SB.A00(this, 14), 35);
        this.A00 = A15().getInt("include");
        int A002 = C19740yt.A00(A14(), 2131103204);
        this.A01 = A002;
        this.A03 = new ColorDrawable(A002);
        this.A02 = AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131166893);
        RecyclerView A0Q2 = AnonymousClass3MX.A0Q(A17(), 2131427745);
        A0Q2.setClipToPadding(false);
        A0Q2.setPadding(0, C108985cd.A04(view), 0, 0);
        A0Q2.A12.add(new C142657Ah(AnonymousClass00R.A01));
        this.A0S = A0Q2;
        A00();
        View A0M2 = C72463Mc.A0M(A17(), 2131433132);
        C18070vi.A0z(A0M2, "null cannot be cast to non-null type com.whatsapp.WaTextView");
        WaTextView waTextView = (WaTextView) A0M2;
        this.A06 = waTextView;
        C72453Mb.A1B(waTextView);
        this.A0Q = new C109305dA(this, 2);
        Handler handler = this.A0a;
        this.A0R = new C109355dJ(handler, this, 1);
        C112035kp r1 = new C112035kp(this);
        this.A0H = r1;
        RecyclerView recyclerView = this.A0S;
        if (recyclerView != null) {
            recyclerView.setAdapter(r1);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addDataScheme("file");
        AnonymousClass00H r0 = this.A0O;
        if (r0 != null) {
            C29831cw r2 = (C29831cw) r0.get();
            AnonymousClass118 r02 = this.A0D;
            if (r02 != null) {
                Context A0E2 = C108945cZ.A0E(r02);
                BroadcastReceiver broadcastReceiver = this.A0Q;
                if (broadcastReceiver == null) {
                    str = "mediaStorageStateReceiver";
                } else {
                    r2.A01(A0E2, broadcastReceiver, intentFilter, true);
                    AnonymousClass11C r03 = this.A0B;
                    if (r03 != null) {
                        AnonymousClass11B A0O2 = r03.A0O();
                        if (A0O2 != null) {
                            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            ContentObserver contentObserver = this.A0R;
                            if (contentObserver == null) {
                                str = "mediaContentObserver";
                            } else {
                                A0O2.A09(uri, contentObserver);
                            }
                        }
                        C24771Lp r3 = this.A07;
                        if (r3 != null) {
                            AnonymousClass11C r22 = this.A0B;
                            if (r22 != null) {
                                this.A0I = new C136166tN(handler, r3, r22, "image-loader-gallery-picker-fragment");
                                this.A0V = false;
                                this.A0U = false;
                                A02(this);
                                AnonymousClass00H r04 = this.A0L;
                                if (r04 != null) {
                                    ((C86504Rw) r04.get()).A00(view, A1D());
                                    return;
                                }
                                str = "galleryPartialPermissionProvider";
                            }
                        } else {
                            str = "caches";
                        }
                    }
                    str = "systemServices";
                }
            } else {
                str = "waContext";
            }
        } else {
            str = "runtimeReceiverCompat";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A00();
    }

    private final void A00() {
        RecyclerView recyclerView = this.A0S;
        if (recyclerView != null) {
            if (this.A0T == null) {
                int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(2131166889);
                recyclerView.A0R = true;
                C18000vb r1 = this.A0F;
                if (r1 != null) {
                    recyclerView.A0r(new AnonymousClass28M(r1, dimensionPixelSize));
                    GridLayoutManagerNonPredictiveAnimations A0R2 = C108995ce.A0R(this);
                    this.A0T = A0R2;
                    recyclerView.setLayoutManager(A0R2);
                } else {
                    AnonymousClass3MW.A1M();
                    throw null;
                }
            }
            int A0I2 = AnonymousClass3Ma.A09(recyclerView).widthPixels / C72453Mb.A0I(this.A0Y);
            if (A0I2 < 1) {
                A0I2 = 1;
            }
            GridLayoutManagerNonPredictiveAnimations gridLayoutManagerNonPredictiveAnimations = this.A0T;
            if (gridLayoutManagerNonPredictiveAnimations != null) {
                gridLayoutManagerNonPredictiveAnimations.A1g(A0I2);
            }
        }
    }

    public static final void A01(GalleryPickerFragment galleryPickerFragment) {
        if (galleryPickerFragment.A04 == null) {
            ViewGroup A0D2 = AnonymousClass3MW.A0D(galleryPickerFragment.A17(), 2131434738);
            AnonymousClass3MZ.A0E(galleryPickerFragment).inflate(2131625430, A0D2);
            View findViewById = A0D2.findViewById(2131433150);
            galleryPickerFragment.A04 = findViewById;
            if (findViewById != null) {
                AnonymousClass6WQ.A00(findViewById, galleryPickerFragment, new AnonymousClass7S3((Object) galleryPickerFragment, 21));
            }
        }
        C108975cc.A0q(galleryPickerFragment.A04);
        C72453Mb.A1B(galleryPickerFragment.A06);
    }

    public static final void A02(GalleryPickerFragment galleryPickerFragment) {
        WindowManager windowManager;
        Display defaultDisplay;
        Boolean bool = C17960vV.A01;
        C219217x r0 = galleryPickerFragment.A0E;
        if (r0 == null) {
            C18070vi.A11("waPermissionsHelper");
            throw null;
        } else if (r0.A05() == AnonymousClass00R.A01) {
            A01(galleryPickerFragment);
        } else {
            Point point = new Point();
            AnonymousClass1FL A1B = galleryPickerFragment.A1B();
            if (!(A1B == null || (windowManager = A1B.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                defaultDisplay.getSize(point);
            }
            int i = point.y * point.x;
            int i2 = galleryPickerFragment.A02;
            int i3 = (i / (i2 * i2)) + 1;
            GalleryPickerViewModel galleryPickerViewModel = (GalleryPickerViewModel) galleryPickerFragment.A0Z.getValue();
            int i4 = galleryPickerFragment.A00;
            boolean A042 = A04(galleryPickerFragment);
            AnonymousClass3Ma.A1R(galleryPickerViewModel.A01);
            AnonymousClass1OX A002 = C41561wd.A00(galleryPickerViewModel);
            galleryPickerViewModel.A01 = C30451dy.A02(AnonymousClass00R.A00, galleryPickerViewModel.A0G, new GalleryPickerViewModel$loadFolders$1(galleryPickerViewModel, (C30391dr) null, i3, i4, A042), A002);
        }
    }

    public static final boolean A04(GalleryPickerFragment galleryPickerFragment) {
        Bundle bundle = galleryPickerFragment.A06;
        if (bundle != null) {
            return bundle.getBoolean("picker_redesign", false);
        }
        return false;
    }

    public GalleryPickerFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(GalleryPickerViewModel.class);
        this.A0Z = C99274sY.A00(new C151347m9(this), new C151357mA(this), new C156047tj(this), A15);
        this.A0W = 2131625427;
        this.A0Y = AnonymousClass7S3.A00(this, 19);
        this.A0X = AnonymousClass7S3.A00(this, 20);
    }

    public static final void A03(GalleryPickerFragment galleryPickerFragment, boolean z, boolean z2) {
        AnonymousClass1FL A1B = galleryPickerFragment.A1B();
        if (A1B != null && !A1B.isFinishing()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GalleryPicker/");
            A10.append(galleryPickerFragment.A00);
            A10.append("/rebake unmounted:");
            A10.append(z);
            A10.append(" scanning:");
            A10.append(z2);
            A10.append(" old unmounted:");
            A10.append(galleryPickerFragment.A0V);
            A10.append(" old scanning:");
            C17900vP.A0r(A10, galleryPickerFragment.A0U);
            if (z != galleryPickerFragment.A0V || z2 != galleryPickerFragment.A0U) {
                galleryPickerFragment.A0V = z;
                galleryPickerFragment.A0U = z2;
                if (!z) {
                    C219217x r0 = galleryPickerFragment.A0E;
                    if (r0 == null) {
                        C18070vi.A11("waPermissionsHelper");
                        throw null;
                    } else if (r0.A05() != AnonymousClass00R.A01) {
                        C72453Mb.A1B(galleryPickerFragment.A06);
                        C72453Mb.A1B(galleryPickerFragment.A04);
                        A02(galleryPickerFragment);
                        return;
                    }
                }
                A01(galleryPickerFragment);
            }
        }
    }

    public void A1s() {
        ImageView imageView;
        super.A1s();
        C136166tN r0 = this.A0I;
        if (r0 != null) {
            r0.A00();
        }
        this.A0I = null;
        AnonymousClass00H r02 = this.A0O;
        if (r02 != null) {
            C29831cw r2 = (C29831cw) r02.get();
            AnonymousClass118 r03 = this.A0D;
            if (r03 != null) {
                Context A0E2 = C108945cZ.A0E(r03);
                BroadcastReceiver broadcastReceiver = this.A0Q;
                if (broadcastReceiver == null) {
                    C18070vi.A11("mediaStorageStateReceiver");
                    throw null;
                }
                r2.A02(broadcastReceiver, A0E2);
                AnonymousClass11C r04 = this.A0B;
                if (r04 != null) {
                    AnonymousClass11B A0O2 = r04.A0O();
                    if (A0O2 != null) {
                        ContentObserver contentObserver = this.A0R;
                        if (contentObserver == null) {
                            C18070vi.A11("mediaContentObserver");
                            throw null;
                        }
                        AnonymousClass11B.A00(A0O2).unregisterContentObserver(contentObserver);
                    }
                    RecyclerView recyclerView = this.A0S;
                    if (recyclerView != null) {
                        Iterator A002 = C99434so.A00(recyclerView, 1);
                        while (A002.hasNext()) {
                            View A0E3 = AnonymousClass3MX.A0E(A002);
                            if (A0E3 instanceof FrameLayout) {
                                Iterator A003 = C99434so.A00(A0E3, 1);
                                while (A003.hasNext()) {
                                    View A0E4 = AnonymousClass3MX.A0E(A003);
                                    if ((A0E4 instanceof SquareImageView) && (imageView = (ImageView) A0E4) != null) {
                                        imageView.setImageDrawable((Drawable) null);
                                    }
                                }
                            }
                        }
                        this.A0H = null;
                        recyclerView.setAdapter((C38391rD) null);
                        C24771Lp r05 = this.A07;
                        if (r05 != null) {
                            r05.A05().A02.A07(-1);
                        } else {
                            C18070vi.A11("caches");
                            throw null;
                        }
                    }
                } else {
                    AnonymousClass3MW.A1N();
                    throw null;
                }
            } else {
                C18070vi.A11("waContext");
                throw null;
            }
        } else {
            C18070vi.A11("runtimeReceiverCompat");
            throw null;
        }
    }

    public void A1u() {
        super.A1u();
        AnonymousClass00H r0 = this.A0L;
        if (r0 != null) {
            ((C86504Rw) r0.get()).A01(new AnonymousClass7S3((Object) this, 18));
        } else {
            C18070vi.A11("galleryPartialPermissionProvider");
            throw null;
        }
    }
}
