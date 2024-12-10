package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1FU;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1T1;
import X.AnonymousClass20F;
import X.AnonymousClass2E5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass72S;
import X.AnonymousClass73D;
import X.AnonymousClass73N;
import X.AnonymousClass740;
import X.AnonymousClass78K;
import X.AnonymousClass793;
import X.AnonymousClass7AT;
import X.AnonymousClass7HT;
import X.AnonymousClass7HV;
import X.AnonymousClass7J9;
import X.AnonymousClass7JF;
import X.AnonymousClass7JN;
import X.AnonymousClass7JS;
import X.AnonymousClass7RA;
import X.AnonymousClass7wN;
import X.AnonymousClass806;
import X.AnonymousClass85C;
import X.AnonymousClass891;
import X.AnonymousClass8AE;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C111125iM;
import X.C112135kz;
import X.C114315qV;
import X.C123906Wh;
import X.C127436eM;
import X.C136166tN;
import X.C136986uj;
import X.C139426yp;
import X.C1409573s;
import X.C1419377n;
import X.C144387Hc;
import X.C144397Hd;
import X.C151627mb;
import X.C151647md;
import X.C151657me;
import X.C156137ts;
import X.C156147tt;
import X.C1591383j;
import X.C160888Ai;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C18140vp;
import X.C18600wl;
import X.C19830z4;
import X.C218617r;
import X.C22781De;
import X.C24771Lp;
import X.C25291Nq;
import X.C26631Sw;
import X.C29401cD;
import X.C30391dr;
import X.C37891qK;
import X.C41501wV;
import X.C6X;
import X.C72453Mb;
import X.C72463Mc;
import X.C99274sY;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.WaTextView;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import com.whatsapp.mediacomposer.filter.FilterSelectorController$initFilterSheet$1;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.io.File;

public class ImageComposerFragment extends Hilt_ImageComposerFragment implements AnonymousClass8AE {
    public Bitmap A00;
    public Bitmap A01;
    public C218617r A02;
    public C24771Lp A03;
    public AnonymousClass2E5 A04;
    public AnonymousClass740 A05;
    public PhotoView A06;
    public AnonymousClass73N A07;
    public C18140vp A08;
    public C18600wl A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public AnonymousClass891 A0E;
    public AnonymousClass891 A0F;
    public final C18100vl A0G = AnonymousClass1DF.A01(new C151627mb(this));
    public final C18100vl A0H;

    public static final void A09(ImageComposerFragment imageComposerFragment) {
        C136166tN r0;
        AnonymousClass7HT r2 = new AnonymousClass7HT(imageComposerFragment, 1);
        imageComposerFragment.A0F = r2;
        C144387Hc r1 = new C144387Hc(imageComposerFragment, 1);
        C160888Ai A29 = imageComposerFragment.A29();
        if (A29 != null && (r0 = ((MediaComposerActivity) A29).A0R) != null) {
            r0.A02(r2, r1);
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        Log.i("ImageComposerFragment/onCreateView");
        int i = 2131625570;
        if (A2U()) {
            i = 2131625571;
        }
        return C108955ca.A0G(layoutInflater, viewGroup, i, false);
    }

    public void A1w(int i, int i2, Intent intent) {
        int intExtra;
        Intent intent2 = intent;
        if (i == 1) {
            if (i2 == -1) {
                if (intent != null) {
                    Rect rect = (Rect) intent2.getParcelableExtra("rect");
                    int intExtra2 = intent2.getIntExtra("rotate", 0);
                    int intExtra3 = intent2.getIntExtra("error_message_id", -1);
                    int intExtra4 = intent2.getIntExtra("composerToolToOpenOnComplete", -1);
                    Integer valueOf = Integer.valueOf(intExtra4);
                    RectF rectF = null;
                    if (intExtra4 == -1) {
                        valueOf = null;
                    }
                    AnonymousClass7JF r0 = this.A0J;
                    if (!(r0 == null || rect == null)) {
                        this.A0C = true;
                        C29401cD.A0N(r0.A0V.A04, C1591383j.A00);
                        AnonymousClass7JF r02 = this.A0J;
                        if (r02 != null) {
                            rectF = r02.A0Q.A07;
                        }
                        if (C18020vd.A05(C18040vf.A02, A28(), 8041)) {
                            AnonymousClass3MX.A1Q(new ImageComposerFragment$onActivityResult$1(rect, rectF, this, valueOf, (C30391dr) null, intExtra2, intExtra3), AnonymousClass3MZ.A0H(this));
                        } else {
                            A07(rect, rectF, this, valueOf, intExtra2, intExtra3);
                        }
                    }
                }
            } else if (i2 == 0) {
                if (intent != null) {
                    if (A1B() != null && (intExtra = intent2.getIntExtra("error_message_id", -1)) > 0) {
                        AnonymousClass1KB r1 = this.A07;
                        if (r1 != null) {
                            r1.A0E((AnonymousClass1FU) A1B(), intExtra);
                        } else {
                            AnonymousClass3MW.A1C();
                            throw null;
                        }
                    }
                } else if (this.A0C) {
                    A08(this);
                }
            }
            this.A0A = false;
            return;
        }
        super.A1w(i, i2, intent2);
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        bundle.putBoolean("handle-crop-image-result", this.A0A);
    }

    public void A21(Bundle bundle, View view) {
        C160888Ai A29;
        String str;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        Log.i("ImageComposerFragment/onViewCreated");
        Uri uri = this.A01;
        if (uri != null && (A29 = A29()) != null) {
            C1419377n r10 = new C1419377n(this);
            int A012 = AnonymousClass73D.A00(uri, A29).A01();
            C24771Lp r6 = this.A03;
            if (r6 != null) {
                AnonymousClass10I r12 = this.A0V;
                if (r12 != null) {
                    AnonymousClass2E5 r9 = this.A04;
                    if (r9 != null) {
                        C18000vb r8 = this.A0E;
                        if (r8 != null) {
                            C19830z4 r7 = this.A0D;
                            if (r7 != null) {
                                this.A05 = new AnonymousClass740(uri, view2, A1D(), r6, r7, r8, r9, r10, this.A0J, r12, A012);
                                PhotoView photoView = (PhotoView) view2.findViewById(2131433800);
                                this.A06 = photoView;
                                if (photoView != null) {
                                    C108955ca.A1J(photoView, this, 2131886144);
                                }
                                AnonymousClass7JF r2 = this.A0J;
                                if (r2 != null) {
                                    ((ImagePreviewContentLayout) AnonymousClass3MX.A14(this.A0G)).setDoodleController(r2);
                                }
                                C18100vl r3 = this.A0G;
                                ((ImagePreviewContentLayout) AnonymousClass3MX.A14(r3)).A01 = new AnonymousClass7J9(this);
                                AnonymousClass78K.A00((ImagePreviewContentLayout) AnonymousClass3MX.A14(r3), this, 16);
                                if (bundle == null || !bundle.getBoolean("handle-crop-image-result", false)) {
                                    A08(this);
                                }
                                if (this.A01 == null) {
                                    A09(this);
                                }
                                A2I();
                                AnonymousClass7AT.A01(A1G(), C108945cZ.A0n(this.A0H).A02, new AnonymousClass806(this), 40);
                                return;
                            }
                            str = "waSharedPreferences";
                        } else {
                            AnonymousClass3MW.A1M();
                            throw null;
                        }
                    } else {
                        str = "filterManager";
                    }
                } else {
                    str = "waWorkers";
                }
            } else {
                str = "caches";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public void A2K() {
    }

    public void Bqe(int i, boolean z) {
    }

    public void Byo() {
    }

    public void C0t() {
    }

    public void C0u(boolean z) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        AnonymousClass740 r2 = this.A05;
        if (r2 != null) {
            AnonymousClass793.A00(r2.A0P.getViewTreeObserver(), r2, 14);
        }
    }

    public static final int A03(ImageComposerFragment imageComposerFragment) {
        C160888Ai A29;
        Uri uri = imageComposerFragment.A01;
        int i = 0;
        if (uri == null || (A29 = imageComposerFragment.A29()) == null) {
            return 0;
        }
        String queryParameter = uri.getQueryParameter("rotation");
        if (queryParameter != null) {
            i = Integer.parseInt(queryParameter);
        }
        return (AnonymousClass73D.A00(uri, A29).A02() + i) % 360;
    }

    public static final void A04(Context context, Bitmap bitmap, Uri uri, ImageComposerFragment imageComposerFragment, C160888Ai r18) {
        String str;
        String str2;
        String str3;
        ImageComposerFragment imageComposerFragment2 = imageComposerFragment;
        AnonymousClass7JF r0 = imageComposerFragment2.A0J;
        if (r0 != null && !r0.A0P.A05()) {
            Uri uri2 = imageComposerFragment2.A01;
            C160888Ai r1 = r18;
            if (uri2 != null) {
                str = AnonymousClass73D.A00(uri2, r1).A0F();
            } else {
                str = null;
            }
            Uri uri3 = uri;
            String BR5 = r1.BR5(uri3);
            AnonymousClass72S A002 = AnonymousClass73D.A00(uri3, r1);
            synchronized (A002) {
                str2 = A002.A0H;
            }
            if (str == null) {
                AnonymousClass7JF r02 = imageComposerFragment2.A0J;
                if (r02 != null && !AnonymousClass000.A1a(r02.A0V.A04)) {
                    RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
                    AnonymousClass7JF r12 = imageComposerFragment2.A0J;
                    if (r12 != null) {
                        r12.A0Q.A07 = rectF;
                        r12.A0P.A00 = 0.0f;
                        A0A(imageComposerFragment2, new C156137ts(rectF, r12));
                        C160888Ai A29 = imageComposerFragment2.A29();
                        if (A29 != null) {
                            A29.Bs5();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C139426yp r5 = C1409573s.A06;
            AnonymousClass1KW r9 = imageComposerFragment2.A0F;
            if (r9 != null) {
                C18000vb r8 = imageComposerFragment2.A0E;
                if (r8 != null) {
                    C26631Sw r122 = imageComposerFragment2.A0Q;
                    if (r122 != null) {
                        C18030ve A28 = imageComposerFragment2.A28();
                        AnonymousClass00H r03 = imageComposerFragment2.A0a;
                        if (r03 != null) {
                            C25291Nq r11 = (C25291Nq) C18070vi.A0E(r03);
                            AnonymousClass1T1 r7 = imageComposerFragment2.A06;
                            if (r7 != null) {
                                A0A(imageComposerFragment2, new AnonymousClass7wN(imageComposerFragment2, r5.A02(context, r7, r8, r9, A28, r11, r122, str), BR5, str2));
                                return;
                            }
                            str3 = "doodleFactory";
                        } else {
                            str3 = "mediaUtils";
                        }
                    } else {
                        str3 = "stickerImageFileLoader";
                    }
                } else {
                    AnonymousClass3MW.A1M();
                    throw null;
                }
            } else {
                str3 = "emojiLoader";
            }
            C18070vi.A11(str3);
            throw null;
        }
    }

    public static final void A05(Bitmap bitmap, Bitmap bitmap2, ImageComposerFragment imageComposerFragment, boolean z) {
        Bitmap bitmap3;
        AnonymousClass740 r3 = imageComposerFragment.A05;
        if (!z) {
            Bitmap bitmap4 = null;
            if (r3 != null) {
                bitmap3 = r3.A05;
            } else {
                bitmap3 = null;
            }
            A06(bitmap3, imageComposerFragment);
            ImageView imageView = imageComposerFragment.A03;
            if (imageView != null) {
                AnonymousClass740 r0 = imageComposerFragment.A05;
                if (r0 != null) {
                    bitmap4 = r0.A04;
                }
                imageView.setImageBitmap(bitmap4);
            }
            AnonymousClass1FL A1B = imageComposerFragment.A1B();
            if (A1B != null) {
                A1B.A2Z();
            }
        } else if (r3 != null) {
            if (bitmap != null) {
                r3.A06 = bitmap;
                r3.A02 = bitmap2;
                r3.A0C = false;
            }
            r3.A08((Runnable) null, C108945cZ.A0X(r3, 10), r3.A01);
        }
        AnonymousClass740 r02 = imageComposerFragment.A05;
        if (r02 != null) {
            AnonymousClass740.A03(r02);
            C112135kz r03 = r02.A0B;
            if (r03 != null) {
                r03.notifyDataSetChanged();
            }
        }
        if (imageComposerFragment.A0m) {
            imageComposerFragment.A2J();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void A07(android.graphics.Rect r15, android.graphics.RectF r16, com.whatsapp.mediacomposer.ImageComposerFragment r17, java.lang.Integer r18, int r19, int r20) {
        /*
            r2 = r17
            monitor-enter(r2)
            android.net.Uri r11 = r2.A01     // Catch:{ all -> 0x01ed }
            if (r11 == 0) goto L_0x01eb
            if (r16 == 0) goto L_0x01eb
            X.7JF r0 = r2.A0J     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x01eb
            X.8Ai r12 = r2.A29()     // Catch:{ all -> 0x01ed }
            if (r12 == 0) goto L_0x01eb
            r0 = r12
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0     // Catch:{ all -> 0x01ed }
            X.73D r1 = r0.A1q     // Catch:{ all -> 0x01ed }
            X.72S r0 = r1.A02(r11)     // Catch:{ all -> 0x01ed }
            int r6 = r0.A02()     // Catch:{ all -> 0x01ed }
            X.7mZ r0 = new X.7mZ     // Catch:{ all -> 0x01ed }
            r0.<init>(r2)     // Catch:{ all -> 0x01ed }
            A0A(r2, r0)     // Catch:{ all -> 0x01ed }
            X.740 r4 = r2.A05     // Catch:{ all -> 0x01ed }
            if (r4 == 0) goto L_0x003b
            X.AnonymousClass740.A02(r4)     // Catch:{ all -> 0x01ed }
            X.1Mz r3 = r4.A0T     // Catch:{ all -> 0x01ed }
            java.lang.String r0 = r4.A0b     // Catch:{ all -> 0x01ed }
            r3.A0E(r0)     // Catch:{ all -> 0x01ed }
            java.lang.String r0 = r4.A0a     // Catch:{ all -> 0x01ed }
            r3.A0E(r0)     // Catch:{ all -> 0x01ed }
        L_0x003b:
            X.17r r5 = r2.A02     // Catch:{ all -> 0x01ed }
            if (r5 == 0) goto L_0x01e4
            r4 = 0
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01ed }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x01ed }
            java.lang.String r0 = X.C17970vW.A04(r0)     // Catch:{ all -> 0x01ed }
            r3.append(r0)     // Catch:{ all -> 0x01ed }
            java.lang.String r0 = "-crop"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ all -> 0x01ed }
            java.io.File r13 = r5.A0a(r0)     // Catch:{ all -> 0x01ed }
            android.net.Uri r7 = android.net.Uri.fromFile(r13)     // Catch:{ all -> 0x01ed }
            r3 = r19
            int r6 = r6 + r19
            int r14 = r6 % 360
            X.7wX r9 = new X.7wX     // Catch:{ all -> 0x01ed }
            r10 = r15
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01ed }
            A0A(r2, r9)     // Catch:{ all -> 0x01ed }
            java.lang.String r6 = "flip-h"
            java.lang.String r0 = r11.getQueryParameter(r6)     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x007e
            android.net.Uri$Builder r5 = r7.buildUpon()     // Catch:{ all -> 0x01ed }
            java.lang.String r0 = "1"
            android.net.Uri r7 = X.C17890vO.A0C(r5, r6, r0)     // Catch:{ all -> 0x01ed }
        L_0x007e:
            if (r14 == 0) goto L_0x008e
            android.net.Uri$Builder r6 = r7.buildUpon()     // Catch:{ all -> 0x01ed }
            java.lang.String r5 = "rotation"
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x01ed }
            android.net.Uri r7 = X.C17890vO.A0C(r6, r5, r0)     // Catch:{ all -> 0x01ed }
        L_0x008e:
            X.4rF r6 = X.C98494rF.A00()     // Catch:{ all -> 0x01ed }
            X.4rF r5 = X.C98494rF.A00()     // Catch:{ all -> 0x01ed }
            boolean r0 = r2.A0D     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            X.0ve r9 = r2.A28()     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            r8 = 1576(0x628, float:2.208E-42)
            if (r0 == 0) goto L_0x00a2
            r8 = 2654(0xa5e, float:3.719E-42)
        L_0x00a2:
            X.0vf r0 = X.C18040vf.A02     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            int r8 = X.C18020vd.A00(r0, r9, r8)     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            X.00H r0 = r2.A0a     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r0 = r0.get()     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            X.1Nq r0 = (X.C25291Nq) r0     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            android.graphics.Bitmap r0 = r0.A07(r7, r8, r8)     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            r6.element = r0     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            boolean r0 = r2.A2U()     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r6.element     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            android.graphics.Bitmap r8 = r2.A27(r0)     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
        L_0x00c6:
            X.740 r7 = r2.A05     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            if (r7 == 0) goto L_0x00d4
            java.lang.Object r0 = r6.element     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            goto L_0x00d1
        L_0x00cf:
            r8 = r4
            goto L_0x00c6
        L_0x00d1:
            if (r0 == 0) goto L_0x00dd
            goto L_0x00d6
        L_0x00d4:
            r0 = r4
            goto L_0x00ea
        L_0x00d6:
            r7.A06 = r0     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            r7.A02 = r8     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            r0 = 0
            r7.A0C = r0     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
        L_0x00dd:
            r7.A07()     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            X.7ma r0 = new X.7ma     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            r0.<init>(r7)     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            A0A(r2, r0)     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            android.graphics.Bitmap r0 = r7.A05     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
        L_0x00ea:
            r6.element = r0     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            X.740 r0 = r2.A05     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            if (r0 == 0) goto L_0x00f5
            android.graphics.Bitmap r0 = r0.A04     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
        L_0x00f2:
            r5.element = r0     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            goto L_0x00f7
        L_0x00f5:
            r0 = r4
            goto L_0x00f2
        L_0x00f7:
            java.lang.Object r0 = r6.element     // Catch:{ all -> 0x01ed }
            if (r0 != 0) goto L_0x0102
            java.lang.String r0 = "ImageComposerFragment/cropImage/nullBitmap"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01ed }
            goto L_0x01db
        L_0x0102:
            X.7vz r0 = new X.7vz     // Catch:{ all -> 0x01ed }
            r0.<init>(r2, r6, r5)     // Catch:{ all -> 0x01ed }
            A0A(r2, r0)     // Catch:{ all -> 0x01ed }
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x01b6 }
            r7.<init>()     // Catch:{ IOException -> 0x01b6 }
            r0 = 1
            r7.inJustDecodeBounds = r0     // Catch:{ IOException -> 0x01b6 }
            X.72S r0 = r1.A02(r11)     // Catch:{ IOException -> 0x01b6 }
            java.io.File r0 = r0.A0C()     // Catch:{ IOException -> 0x01b6 }
            if (r0 == 0) goto L_0x01b0
            android.net.Uri r6 = android.net.Uri.fromFile(r0)     // Catch:{ IOException -> 0x01b6 }
            X.00H r0 = r2.A0a     // Catch:{ IOException -> 0x01b6 }
            if (r0 == 0) goto L_0x01aa
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x01b6 }
            X.1Nq r1 = (X.C25291Nq) r1     // Catch:{ IOException -> 0x01b6 }
            r0 = 1
            java.io.InputStream r5 = r1.A0A(r6, r0)     // Catch:{ IOException -> 0x01b6 }
            android.graphics.BitmapFactory.decodeStream(r5, r4, r7)     // Catch:{ all -> 0x01a3 }
            r5.close()     // Catch:{ IOException -> 0x01b6 }
            int r0 = r7.outWidth     // Catch:{ IOException -> 0x01b6 }
            float r1 = (float) r0     // Catch:{ IOException -> 0x01b6 }
            int r0 = r7.outHeight     // Catch:{ IOException -> 0x01b6 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x01b6 }
            android.graphics.RectF r7 = X.C108965cb.A04(r1, r0)     // Catch:{ IOException -> 0x01b6 }
            X.11C r0 = r2.A09     // Catch:{ IOException -> 0x01b6 }
            if (r0 == 0) goto L_0x019f
            X.11B r0 = r0.A0O()     // Catch:{ IOException -> 0x01b6 }
            android.graphics.Matrix r4 = X.C26511Sk.A09(r6, r0)     // Catch:{ IOException -> 0x01b6 }
            if (r4 != 0) goto L_0x0151
            android.graphics.Matrix r4 = X.C108945cZ.A0J()     // Catch:{ IOException -> 0x01b6 }
        L_0x0151:
            java.lang.String r0 = "rotation"
            java.lang.String r0 = r11.getQueryParameter(r0)     // Catch:{ IOException -> 0x01b6 }
            if (r0 == 0) goto L_0x0163
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException -> 0x01b6 }
            if (r0 == 0) goto L_0x0163
            float r0 = (float) r0     // Catch:{ IOException -> 0x01b6 }
            r4.postRotate(r0)     // Catch:{ IOException -> 0x01b6 }
        L_0x0163:
            r4.mapRect(r7)     // Catch:{ IOException -> 0x01b6 }
            float r1 = r7.left     // Catch:{ IOException -> 0x01b6 }
            float r6 = r7.top     // Catch:{ IOException -> 0x01b6 }
            android.graphics.RectF r5 = new android.graphics.RectF     // Catch:{ IOException -> 0x01b6 }
            r5.<init>(r15)     // Catch:{ IOException -> 0x01b6 }
            r4.mapRect(r5)     // Catch:{ IOException -> 0x01b6 }
            float r4 = r16.width()     // Catch:{ IOException -> 0x01b6 }
            float r0 = r7.width()     // Catch:{ IOException -> 0x01b6 }
            float r4 = r4 / r0
            float r1 = -r1
            float r0 = -r6
            r5.offset(r1, r0)     // Catch:{ IOException -> 0x01b6 }
            float r0 = r5.left     // Catch:{ IOException -> 0x01b6 }
            float r0 = r0 * r4
            r5.left = r0     // Catch:{ IOException -> 0x01b6 }
            float r0 = r5.top     // Catch:{ IOException -> 0x01b6 }
            float r0 = r0 * r4
            r5.top = r0     // Catch:{ IOException -> 0x01b6 }
            float r0 = r5.right     // Catch:{ IOException -> 0x01b6 }
            float r0 = r0 * r4
            r5.right = r0     // Catch:{ IOException -> 0x01b6 }
            float r0 = r5.bottom     // Catch:{ IOException -> 0x01b6 }
            float r0 = r0 * r4
            r5.bottom = r0     // Catch:{ IOException -> 0x01b6 }
            X.7wM r0 = new X.7wM     // Catch:{ IOException -> 0x01b6 }
            r1 = r18
            r0.<init>(r5, r2, r1, r3)     // Catch:{ IOException -> 0x01b6 }
            A0A(r2, r0)     // Catch:{ IOException -> 0x01b6 }
            goto L_0x01eb
        L_0x019f:
            X.AnonymousClass3MW.A1N()     // Catch:{ IOException -> 0x01b6 }
            throw r4     // Catch:{ IOException -> 0x01b6 }
        L_0x01a3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a5 }
        L_0x01a5:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ IOException -> 0x01b6 }
            goto L_0x01b5
        L_0x01aa:
            java.lang.String r0 = "mediaUtils"
            X.C18070vi.A11(r0)     // Catch:{ IOException -> 0x01b6 }
            throw r4     // Catch:{ IOException -> 0x01b6 }
        L_0x01b0:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01b6 }
            r0.<init>()     // Catch:{ IOException -> 0x01b6 }
        L_0x01b5:
            throw r0     // Catch:{ IOException -> 0x01b6 }
        L_0x01b6:
            r1 = r20
            if (r20 <= 0) goto L_0x01eb
            X.7tr r0 = new X.7tr     // Catch:{ all -> 0x01ed }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x01ed }
            goto L_0x01e0
        L_0x01c0:
            java.lang.String r0 = "mediaUtils"
            X.C18070vi.A11(r0)     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
            throw r4     // Catch:{ OutOfMemoryError -> 0x01cf, IOException -> 0x01c8, 1iX -> 0x01c6 }
        L_0x01c6:
            r1 = move-exception
            goto L_0x01d6
        L_0x01c8:
            r1 = move-exception
            java.lang.String r0 = "ImageComposerFragment/cropImage"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01ed }
            goto L_0x01db
        L_0x01cf:
            r1 = move-exception
            java.lang.String r0 = "ImageComposerFragment/cropImage"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01ed }
            goto L_0x01db
        L_0x01d6:
            java.lang.String r0 = "ImageComposerFragment/cropImage"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01ed }
        L_0x01db:
            X.7mc r0 = new X.7mc     // Catch:{ all -> 0x01ed }
            r0.<init>(r2)     // Catch:{ all -> 0x01ed }
        L_0x01e0:
            A0A(r2, r0)     // Catch:{ all -> 0x01ed }
            goto L_0x01eb
        L_0x01e4:
            java.lang.String r0 = "fMessageIO"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x01ed }
            r0 = 0
            throw r0     // Catch:{ all -> 0x01ed }
        L_0x01eb:
            monitor-exit(r2)
            return
        L_0x01ed:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.ImageComposerFragment.A07(android.graphics.Rect, android.graphics.RectF, com.whatsapp.mediacomposer.ImageComposerFragment, java.lang.Integer, int, int):void");
    }

    public static final void A08(ImageComposerFragment imageComposerFragment) {
        Uri build;
        PhotoView photoView = imageComposerFragment.A06;
        if (photoView != null) {
            photoView.setTag(imageComposerFragment.A01);
        }
        C160888Ai A29 = imageComposerFragment.A29();
        if (A29 != null) {
            Uri uri = imageComposerFragment.A01;
            if (uri == null) {
                build = Uri.EMPTY;
                C18070vi.A0Z(build);
            } else {
                AnonymousClass73D r1 = ((MediaComposerActivity) A29).A1q;
                File A082 = r1.A02(uri).A08();
                if (A082 == null) {
                    A082 = r1.A02(uri).A0C();
                }
                Uri.Builder A062 = C108965cb.A06(A082);
                int A032 = A03(imageComposerFragment);
                if (A032 != 0) {
                    A062.appendQueryParameter("rotation", String.valueOf(A032));
                }
                String queryParameter = uri.getQueryParameter("flip-h");
                if (queryParameter != null) {
                    A062.appendQueryParameter("flip-h", queryParameter);
                }
                build = A062.build();
                C18070vi.A0X(build);
            }
            AnonymousClass7HV r2 = new AnonymousClass7HV(build, imageComposerFragment, 2);
            imageComposerFragment.A0E = r2;
            C144397Hd r12 = new C144397Hd(imageComposerFragment, A29, 1);
            C136166tN r0 = ((MediaComposerActivity) A29).A0R;
            if (r0 != null) {
                r0.A02(r2, r12);
            }
        }
    }

    public static final void A0B(ImageComposerFragment imageComposerFragment, boolean z, boolean z2) {
        AnonymousClass85C r1;
        AnonymousClass740 r0 = imageComposerFragment.A05;
        if (z) {
            if (r0 != null) {
                r0.A06();
            }
        } else if (r0 != null) {
            r0.A09(z2);
        }
        AnonymousClass1FL A1B = imageComposerFragment.A1B();
        if ((A1B instanceof AnonymousClass85C) && (r1 = (AnonymousClass85C) A1B) != null) {
            boolean z3 = !z;
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) r1;
            AnonymousClass7JN r2 = mediaComposerActivity.A0a;
            boolean A0F2 = mediaComposerActivity.A0X.A0F();
            C127436eM r02 = r2.A08;
            if (z3) {
                if (A0F2) {
                    FilterSwipeView filterSwipeView = r02.A01;
                    TextView textView = filterSwipeView.A00;
                    if (textView.getVisibility() == 0) {
                        C108985cd.A11(textView, C108985cd.A0H());
                        filterSwipeView.setFilterSwipeTextVisibility(4);
                    }
                }
            } else if (A0F2) {
                FilterSwipeView filterSwipeView2 = r02.A01;
                TextView textView2 = filterSwipeView2.A00;
                if (textView2.getVisibility() == 4) {
                    filterSwipeView2.setFilterSwipeTextVisibility(0);
                    C108985cd.A11(textView2, C72463Mc.A0Q());
                }
            }
        }
    }

    public void A1s() {
        C136166tN r0;
        C136166tN r02;
        BottomSheetBehavior bottomSheetBehavior;
        ((ImagePreviewContentLayout) AnonymousClass3MX.A14(this.A0G)).A01();
        AnonymousClass740 r3 = this.A05;
        if (r3 != null) {
            AnonymousClass7JF r03 = r3.A0X;
            if (r03 != null) {
                if (C18020vd.A05(C18040vf.A02, r03.A0Y.A01, 9569)) {
                    Bitmap bitmap = r3.A06;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    Bitmap bitmap2 = r3.A02;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                }
            }
            r3.A06 = null;
            r3.A02 = null;
            AnonymousClass740.A02(r3);
            r3.A03 = null;
            ViewGroup.LayoutParams layoutParams = r3.A0M.getLayoutParams();
            C18070vi.A0z(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((C37891qK) layoutParams).A00((C41501wV) null);
            C6X c6x = r3.A09;
            if (!(c6x == null || (bottomSheetBehavior = r3.A0A) == null)) {
                bottomSheetBehavior.A0s.remove(c6x);
            }
            AnonymousClass740.A01(r3);
        }
        Bitmap bitmap3 = this.A00;
        if (bitmap3 != null) {
            bitmap3.recycle();
        }
        this.A00 = null;
        C160888Ai A29 = A29();
        if (A29 != null) {
            AnonymousClass891 r1 = this.A0E;
            if (!(r1 == null || (r02 = ((MediaComposerActivity) A29).A0R) == null)) {
                r02.A01(r1);
            }
            AnonymousClass891 r12 = this.A0F;
            if (!(r12 == null || (r0 = ((MediaComposerActivity) A29).A0R) == null)) {
                r0.A01(r12);
            }
            super.A1s();
        }
    }

    public boolean A2S() {
        AnonymousClass740 r0 = this.A05;
        if ((r0 == null || !AnonymousClass740.A05(r0)) && !super.A2S()) {
            return false;
        }
        return true;
    }

    public ImageComposerFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(C111125iM.class);
        this.A0H = C99274sY.A00(new C151647md(this), new C151657me(this), new C156147tt(this), A15);
        this.A0C = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r3 != null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(android.graphics.Bitmap r4, com.whatsapp.mediacomposer.ImageComposerFragment r5) {
        /*
            boolean r0 = r5.A2W()
            if (r0 == 0) goto L_0x0074
            android.net.Uri r2 = r5.A01
            if (r2 == 0) goto L_0x0066
            X.8Ai r0 = r5.A29()
            if (r0 == 0) goto L_0x0035
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.73D r0 = r0.A1q
            X.72S r1 = r0.A02(r2)
            X.72S r0 = r0.A02(r2)
            java.io.File r0 = r0.A08()
            if (r0 == 0) goto L_0x0035
            android.net.Uri$Builder r0 = X.C108965cb.A06(r0)
            X.C26521Sl.A0Z(r0, r1)
            android.net.Uri r0 = r0.build()
            if (r0 == 0) goto L_0x0035
            java.lang.String r3 = r0.toString()
            if (r3 != 0) goto L_0x0047
        L_0x0035:
            X.8Ai r0 = r5.A29()
            if (r0 == 0) goto L_0x0072
            X.72S r0 = X.AnonymousClass73D.A00(r2, r0)
            java.io.File r0 = r0.A0C()
        L_0x0043:
            java.lang.String r3 = java.lang.String.valueOf(r0)
        L_0x0047:
            X.C18070vi.A0b(r3)
            X.7JF r2 = r5.A0J
            if (r2 == 0) goto L_0x0066
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            if (r4 == 0) goto L_0x0066
            X.70N r1 = r2.A0V
            X.69K r0 = r1.A01()
            if (r0 != 0) goto L_0x0067
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r2.A0P
            X.69K r0 = new X.69K
            r0.<init>(r4, r3)
            r1.setMainImage(r0)
        L_0x0066:
            return
        L_0x0067:
            X.69K r0 = r1.A01()
            if (r0 == 0) goto L_0x0066
            r0.A01 = r4
            r0.A02 = r3
            return
        L_0x0072:
            r0 = 0
            goto L_0x0043
        L_0x0074:
            com.whatsapp.mediaview.PhotoView r0 = r5.A06
            if (r0 == 0) goto L_0x0066
            r0.A0A(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.ImageComposerFragment.A06(android.graphics.Bitmap, com.whatsapp.mediacomposer.ImageComposerFragment):void");
    }

    public static final void A0A(ImageComposerFragment imageComposerFragment, C18090vk r3) {
        if (C22781De.A03()) {
            r3.invoke();
            return;
        }
        AnonymousClass1KB r2 = imageComposerFragment.A07;
        if (r2 != null) {
            r2.A0J(new AnonymousClass7RA((Object) r3, 40));
        } else {
            AnonymousClass3MW.A1C();
            throw null;
        }
    }

    public void A1r() {
        super.A1r();
        AnonymousClass73N r1 = this.A07;
        if (r1 != null) {
            AnonymousClass73N.A02(r1, 23);
        }
    }

    public void A1t() {
        super.A1t();
        AnonymousClass73N r1 = this.A07;
        if (r1 != null) {
            AnonymousClass73N.A02(r1, 26);
        }
    }

    public void A1u() {
        super.A1u();
        AnonymousClass73N r1 = this.A07;
        if (r1 != null) {
            AnonymousClass73N.A02(r1, 19);
        }
    }

    public Bitmap A26() {
        Bitmap bitmap;
        int i;
        int i2;
        PhotoView photoView;
        if ((!A2U() || (photoView = this.A06) == null || (bitmap = photoView.getPhoto()) == null) && (bitmap = this.A01) == null) {
            return null;
        }
        AnonymousClass740 r0 = this.A05;
        if (r0 != null) {
            i = r0.A01;
        } else {
            i = 0;
        }
        if (A2U()) {
            Bitmap createBitmap = Bitmap.createBitmap(VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT, VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH, Bitmap.Config.ARGB_8888);
            C123906Wh.A00(bitmap, C108955ca.A0E(createBitmap));
            bitmap = createBitmap;
        }
        if (i == 0) {
            return bitmap;
        }
        AnonymousClass740 r02 = this.A05;
        if (r02 != null) {
            i2 = r02.A01;
        } else {
            i2 = 0;
        }
        AnonymousClass2E5 r03 = this.A04;
        if (r03 != null) {
            return FilterUtils.A00(bitmap, r03, i2, true);
        }
        C18070vi.A11("filterManager");
        throw null;
    }

    public void A2C() {
        super.A2C();
        AnonymousClass740 r2 = this.A05;
        if (r2 != null) {
            r2.A0L.removeCallbacks(r2.A0Z);
            r2.A03 = null;
            r2.A0C = false;
            AnonymousClass740.A01(r2);
        }
    }

    public void A2N(Rect rect) {
        AnonymousClass740 r4;
        super.A2N(rect);
        if (this.A0B != null && rect != null && (r4 = this.A05) != null && !rect.equals(r4.A07)) {
            r4.A07 = new Rect(0, rect.top, 0, rect.bottom);
        }
    }

    public void A2P(AnonymousClass7JS r8, AnonymousClass7JN r9, C136986uj r10) {
        ImageView imageView;
        AnonymousClass740 r3;
        C6X c6x;
        String str;
        AnonymousClass7JS r0;
        C18070vi.A0n(r10, r9, r8);
        super.A2P(r8, r9, r10);
        C160888Ai A29 = A29();
        if (A29 == null || (r0 = ((MediaComposerActivity) A29).A0X) == null || r0.A0J) {
            AnonymousClass7JN.A02(r9);
            TitleBarView titleBarView = r10.A0I;
            ImageView imageView2 = titleBarView.A09;
            if (imageView2 == null) {
                str = "penTool";
            } else {
                if (!imageView2.isSelected() && ((imageView = titleBarView.A0A) == null || !imageView.isSelected())) {
                    WaTextView waTextView = titleBarView.A0G;
                    if (waTextView == null) {
                        str = "textTool";
                    } else if (!waTextView.isSelected()) {
                        if (r8.A0F() && (r3 = this.A05) != null && r3.A0A == null) {
                            r3.A0A = new FilterSelectorController$initFilterSheet$1(r3);
                            View view = r3.A0M;
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            C18070vi.A0z(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                            BottomSheetBehavior bottomSheetBehavior = r3.A0A;
                            ((C37891qK) layoutParams).A00(bottomSheetBehavior);
                            C114315qV r02 = new C114315qV(r3, 11);
                            r3.A09 = r02;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.A0Z(r02);
                            }
                            BottomSheetBehavior bottomSheetBehavior2 = r3.A0A;
                            if (!(bottomSheetBehavior2 == null || bottomSheetBehavior2.A0J != 3 || (c6x = r3.A09) == null)) {
                                c6x.A03(view, 3);
                            }
                            AnonymousClass793.A00(r3.A0P.getViewTreeObserver(), r3, 13);
                        }
                        boolean A0F2 = r8.A0F();
                        C127436eM r03 = r9.A08;
                        if (A0F2) {
                            FilterSwipeView filterSwipeView = r03.A01;
                            TextView textView = filterSwipeView.A00;
                            if (textView.getVisibility() != 0) {
                                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                                translateAnimation.setDuration(1);
                                AnimationSet animationSet = new AnimationSet(false);
                                AlphaAnimation A0Q = C72463Mc.A0Q();
                                A0Q.setDuration(300);
                                animationSet.addAnimation(A0Q);
                                animationSet.addAnimation(translateAnimation);
                                textView.startAnimation(animationSet);
                            }
                            filterSwipeView.setFilterSwipeTextVisibility(0);
                        }
                    }
                }
                AnonymousClass740 r1 = this.A05;
                if (r1 != null) {
                    if (!r1.A0C) {
                        AnonymousClass740.A03(r1);
                    }
                    C112135kz r04 = r1.A0B;
                    if (r04 == null) {
                        r1.A0L.postDelayed(r1.A0Z, 500);
                        return;
                    } else {
                        r04.notifyDataSetChanged();
                        return;
                    }
                } else {
                    return;
                }
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public boolean A2W() {
        AnonymousClass7JS r0;
        C160888Ai A29 = A29();
        if (A29 == null || (r0 = ((MediaComposerActivity) A29).A0X) == null) {
            return false;
        }
        return C108975cc.A1B(C72453Mb.A1a(r0.A0F) ? 1 : 0);
    }
}
