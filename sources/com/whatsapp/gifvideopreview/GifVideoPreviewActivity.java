package com.whatsapp.gifvideopreview;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11P;
import X.AnonymousClass18K;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1YL;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4P4;
import X.AnonymousClass4VT;
import X.AnonymousClass4aJ;
import X.AnonymousClass620;
import X.AnonymousClass64U;
import X.AnonymousClass66L;
import X.AnonymousClass6L3;
import X.AnonymousClass6ZN;
import X.AnonymousClass736;
import X.AnonymousClass75T;
import X.AnonymousClass7AT;
import X.AnonymousClass801;
import X.C000200d;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C109005cf;
import X.C114645rS;
import X.C123876We;
import X.C127356eD;
import X.C128506gA;
import X.C1408873l;
import X.C1423279a;
import X.C144497Hn;
import X.C151397mE;
import X.C151407mF;
import X.C156057tk;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18180vt;
import X.C222219b;
import X.C22971Dz;
import X.C26421Sb;
import X.C26521Sl;
import X.C29671cg;
import X.C33251iW;
import X.C62572rc;
import X.C63642tS;
import X.C692236j;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C88184Yq;
import X.C99274sY;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.jid.Jid;
import com.whatsapp.videoplayback.VideoSurfaceView;
import com.whatsapp.viewmodel.GifVideoPreviewViewModel;
import java.io.File;
import java.util.List;

public final class GifVideoPreviewActivity extends C114645rS {
    public View A00;
    public C33251iW A01;
    public AnonymousClass18K A02;
    public AnonymousClass736 A03;
    public C26421Sb A04;
    public C127356eD A05;
    public VideoSurfaceView A06;
    public int A07;
    public boolean A08;
    public final C18100vl A09;

    public int A31() {
        return 78318969;
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r3 = A0A.A00;
            C109005cf.A0d(A0A, r3, this);
            C109005cf.A0e(A0A, r3, this, r3.A5A);
            this.A09 = AnonymousClass3Ma.A0d(A0A);
            this.A0B = C108955ca.A0M(A0A);
            this.A0C = C108985cd.A0T(A0A);
            this.A0M = C000200d.A00(A0A.AAB);
            this.A0O = C000200d.A00(A0A.AC9);
            this.A0N = C000200d.A00(A0A.ABv);
            this.A06 = AnonymousClass10E.A4z(A0A);
            this.A07 = AnonymousClass3MZ.A0g(A0A);
            this.A0I = C108965cb.A0h(A0A);
            this.A0H = (C26521Sl) A0A.A69.get();
            this.A0F = C108965cb.A0Z(A0A);
            this.A0J = C108965cb.A0i(r3);
            this.A0E = AnonymousClass3Ma.A0r(A0A);
            this.A0L = C000200d.A00(r3.A4e);
            this.A0K = C108965cb.A0j(r3);
            this.A0D = AnonymousClass1K1.A1G(A0K);
            this.A08 = (C88184Yq) r3.A15.get();
            this.A05 = (AnonymousClass6ZN) A0K.A2F.get();
            this.A03 = (AnonymousClass736) A0A.AUc.get();
            this.A04 = (C26421Sb) A0A.A67.get();
            this.A05 = (C127356eD) A0K.A4i.get();
            this.A01 = AnonymousClass3MZ.A0U(A0A);
            this.A02 = AnonymousClass3Ma.A0g(A0A);
        }
    }

    public void A4b(File file, boolean z, boolean z2) {
        String path;
        String str;
        Uri parse;
        byte[] bArr;
        File file2 = this.A0P;
        if (file2 == null) {
            path = null;
        } else {
            path = file2.getPath();
        }
        if (this.A0R.size() == 0) {
            A4c(false);
            return;
        }
        VideoSurfaceView videoSurfaceView = this.A06;
        if (videoSurfaceView != null) {
            VideoSurfaceView.A03(videoSurfaceView, false);
        }
        if (z) {
            C62572rc r9 = new C62572rc();
            byte[] bArr2 = null;
            if (path != null) {
                File A17 = C108945cZ.A17(path);
                r9.A0G = A17;
                bArr = C1408873l.A04(A17);
                parse = null;
            } else {
                parse = Uri.parse(getIntent().getStringExtra("media_url"));
                r9.A08 = getIntent().getIntExtra("media_width", -1);
                r9.A06 = getIntent().getIntExtra("media_height", -1);
                String stringExtra = getIntent().getStringExtra("preview_media_url");
                if (stringExtra != null) {
                    AnonymousClass736 r0 = this.A03;
                    if (r0 != null) {
                        bArr2 = r0.A03(stringExtra);
                    } else {
                        C18070vi.A11("gifCache");
                        throw null;
                    }
                }
                bArr = bArr2;
            }
            r9.A05 = this.A07;
            if (A03() != null) {
                r9.A0H = A03();
            }
            C692236j r11 = new C692236j();
            r11.A00(this.A0A);
            C26421Sb r7 = this.A04;
            if (r7 != null) {
                C63642tS A042 = r7.A04(parse, r9, (AnonymousClass206) null, r11, this.A0G.A05.getStringText(), this.A0R, this.A0G.A05.getMentions(), (List) null, 13, 0, 0, getIntent().getBooleanExtra("number_from_url", false));
                A042.A00 = 1;
                C33251iW r72 = this.A01;
                if (r72 != null) {
                    r72.A0n(A042, bArr, this.A0S, !C18070vi.A18(this.A0Q, this.A0R));
                    if (r9.A05 != 0) {
                        AnonymousClass620 r4 = new AnonymousClass620();
                        r4.A00 = Integer.valueOf(C123876We.A00(r9.A05));
                        AnonymousClass18K r02 = this.A02;
                        if (r02 != null) {
                            r02.CC7(r4);
                        } else {
                            C18070vi.A11("wamRuntime");
                            throw null;
                        }
                    }
                    if (this.A0R.size() > 1 || (this.A0R.size() == 1 && C22971Dz.A0a((Jid) this.A0R.get(0)))) {
                        CPW(this.A0R, 1);
                    }
                    setResult(-1);
                } else {
                    C18070vi.A11("userActions");
                    throw null;
                }
            } else {
                str = "mediaFactory";
                C18070vi.A11(str);
                throw null;
            }
        } else {
            Intent A0A = C17880vN.A0A();
            A0A.putExtra("file_path", path);
            C108965cb.A10(A0A, this.A0R);
            C108945cZ.A0u(this.A0L).A03(A0A, this.A0A);
            A0A.putExtra("audience_clicked", this.A0S);
            A0A.putExtra("audience_updated", !C18070vi.A18(this.A0Q, this.A0R));
            if (path == null) {
                A0A.putExtra("media_url", getIntent().getStringExtra("media_url"));
                A0A.putExtra("media_width", getIntent().getIntExtra("media_width", -1));
                A0A.putExtra("media_height", getIntent().getIntExtra("media_height", -1));
                A0A.putExtra("preview_media_url", getIntent().getStringExtra("preview_media_url"));
            }
            A0A.putExtra("provider", getIntent().getIntExtra("provider", 0));
            A0A.putExtra("caption", this.A0G.A05.getStringText());
            A0A.putExtra("mentions", AnonymousClass4aJ.A01(this.A0G.A05.getMentions()));
            A0A.putExtra("clear_message_after_send", getIntent().getBooleanExtra("clear_message_after_send", false));
            if (A03() != null) {
                A0A.putExtra("content_description", A03());
            }
            setResult(-1, A0A);
        }
        int intExtra = getIntent().getIntExtra("origin", 23);
        boolean contains = this.A0R.contains(C29671cg.A00);
        int A022 = AnonymousClass3MX.A02(this.A0R, contains ? 1 : 0);
        C127356eD r5 = this.A05;
        if (r5 != null) {
            boolean z3 = this.A0S;
            boolean z4 = !C18070vi.A18(this.A0Q, this.A0R);
            AnonymousClass64U r3 = new AnonymousClass64U();
            r3.A08 = 11;
            r3.A07 = Integer.valueOf(intExtra);
            r3.A0Z = C17880vN.A0n(contains);
            r3.A0C = C17880vN.A0n(A022);
            Long A0X = C108975cc.A0X();
            r3.A0O = A0X;
            r3.A0P = A0X;
            Long A0L = C17890vO.A0L();
            r3.A0J = A0L;
            r3.A0L = A0L;
            r3.A0K = A0L;
            r3.A0M = A0L;
            r3.A0Q = A0L;
            r3.A0S = A0L;
            r3.A05 = false;
            r3.A04 = false;
            r3.A00 = Boolean.valueOf(z3);
            r3.A01 = Boolean.valueOf(z4);
            r5.A00.CC0(r3, (C18180vt) null, false);
            finish();
            return;
        }
        str = "mediaWamEventHelper";
        C18070vi.A11(str);
        throw null;
    }

    public void Bxj(File file, String str) {
        String path;
        super.Bxj(file, str);
        if (!isFinishing()) {
            File file2 = this.A0P;
            if (file2 == null || (path = file2.getPath()) == null || path.length() == 0) {
                String stringExtra = getIntent().getStringExtra("preview_media_url");
                Bitmap bitmap = null;
                if (stringExtra != null) {
                    AnonymousClass736 r0 = this.A03;
                    if (r0 != null) {
                        byte[] A032 = r0.A03(stringExtra);
                        if (A032 != null) {
                            bitmap = C72473Md.A0E(A032);
                        }
                    } else {
                        C18070vi.A11("gifCache");
                        throw null;
                    }
                }
                if (!isFinishing()) {
                    if (bitmap != null) {
                        this.A04.setImageBitmap(bitmap);
                    } else {
                        String stringExtra2 = getIntent().getStringExtra("static_preview_url");
                        if (stringExtra2 != null) {
                            AnonymousClass736 r1 = this.A03;
                            if (r1 != null) {
                                r1.A02(this.A04, stringExtra2);
                            }
                            C18070vi.A11("gifCache");
                            throw null;
                        }
                    }
                    AnonymousClass736 r2 = this.A03;
                    if (r2 != null) {
                        String stringExtra3 = getIntent().getStringExtra("media_url");
                        C144497Hn r11 = new C144497Hn(this);
                        C17960vV.A02();
                        AnonymousClass6L3 A002 = AnonymousClass736.A00(r2);
                        C128506gA BM6 = A002.BM6(stringExtra3);
                        if (BM6 != null) {
                            String str2 = BM6.A00;
                            if (C108975cc.A1M(str2) && BM6.A02 != null) {
                                r11.BuY(C108945cZ.A17(str2), stringExtra3, BM6.A02);
                            }
                        }
                        AnonymousClass11P r8 = r2.A09;
                        C18030ve r9 = r2.A0B;
                        new AnonymousClass66L(r2.A03, r2.A05, r2.A07, r2.A08, r8, r9, A002, r11, r2.A0D, stringExtra3).A02.executeOnExecutor(AnonymousClass736.A01(r2), new Void[0]);
                        return;
                    }
                    C18070vi.A11("gifCache");
                    throw null;
                }
                return;
            }
            VideoSurfaceView videoSurfaceView = this.A06;
            if (videoSurfaceView != null) {
                videoSurfaceView.setVideoPath(path);
            }
            if (!isFinishing()) {
                VideoSurfaceView videoSurfaceView2 = this.A06;
                if (videoSurfaceView2 != null) {
                    videoSurfaceView2.start();
                }
                C72453Mb.A1D(this.A00);
            }
        }
    }

    public GifVideoPreviewActivity(int i) {
        this.A08 = false;
        C1423279a.A00(this, 0);
    }

    private final String A03() {
        String stringExtra = getIntent().getStringExtra("content_description");
        if (stringExtra == null || stringExtra.length() == 0) {
            return null;
        }
        return stringExtra;
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        C72483Me.A10(A33, this);
        return A33;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131895694);
        AnonymousClass7AT.A01(this, ((GifVideoPreviewViewModel) this.A09.getValue()).A00, new AnonymousClass801(this), 37);
        View view = new View(this);
        view.setId(2131431130);
        AnonymousClass3MX.A1A(this, view, AnonymousClass1YL.A00(this, 2130968798, 2131099872));
        AnonymousClass3MY.A0w(this, view, 2131890772);
        C108965cb.A12(view, -1);
        this.A00 = view;
        this.A03.addView(view, 0);
        VideoSurfaceView videoSurfaceView = new VideoSurfaceView(this);
        videoSurfaceView.setId(2131431131);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        layoutParams.setMargins(0, 0, 0, videoSurfaceView.getResources().getDimensionPixelSize(2131166922));
        videoSurfaceView.setLayoutParams(layoutParams);
        videoSurfaceView.A0A = new AnonymousClass75T(1);
        if (A03() != null) {
            videoSurfaceView.setFocusable(true);
            this.A03.setContentDescription(A03());
            videoSurfaceView.setImportantForAccessibility(1);
        }
        this.A06 = videoSurfaceView;
        this.A03.addView(videoSurfaceView, 0);
        int intExtra = getIntent().getIntExtra("provider", 0);
        int i = 1;
        if (intExtra != 1) {
            i = 2;
            if (intExtra != 2) {
                i = 0;
            }
        }
        this.A07 = i;
        VideoSurfaceView videoSurfaceView2 = this.A06;
        if (videoSurfaceView2 != null) {
            videoSurfaceView2.setImportantForAccessibility(2);
        }
        A39(this.A00, this.A05);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass4P4 r2 = this.A0G;
        if (r2 != null) {
            r2.A00.getViewTreeObserver().removeOnGlobalLayoutListener(r2.A01);
            r2.A05.A0L();
            r2.A03.dismiss();
        }
        this.A0G = null;
        AnonymousClass736 r22 = this.A03;
        if (r22 != null) {
            AnonymousClass4VT r0 = r22.A01;
            if (r0 != null) {
                r0.A02.A04(false);
                r22.A01 = null;
                return;
            }
            return;
        }
        C18070vi.A11("gifCache");
        throw null;
    }

    public void onStop() {
        super.onStop();
        VideoSurfaceView videoSurfaceView = this.A06;
        if (videoSurfaceView != null) {
            videoSurfaceView.A05();
        }
    }

    public GifVideoPreviewActivity() {
        this(0);
        this.A09 = C99274sY.A00(new C151407mF(this), new C151397mE(this), new C156057tk(this), AnonymousClass3MW.A15(GifVideoPreviewViewModel.class));
    }
}
