package X;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.whatsapp.inappsupport.ui.AddScreenshotImageView;

/* renamed from: X.3RY  reason: invalid class name */
public final class AnonymousClass3RY extends RelativeLayout implements AnonymousClass009 {
    public FrameLayout A00;
    public C18030ve A01;
    public AnonymousClass18K A02;
    public C106985Xy A03;
    public C106995Xz A04;
    public AddScreenshotImageView A05;
    public C28931bI A06;
    public C28931bI A07;
    public AnonymousClass031 A08;
    public boolean A09;

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setAddScreenshotImageView(AddScreenshotImageView addScreenshotImageView) {
        C18070vi.A0d(addScreenshotImageView, 0);
        this.A05 = addScreenshotImageView;
    }

    public final void setOnRemoveScreenshotListener(C106985Xy r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setOnRetryListener(C106995Xz r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setRemoveButton(FrameLayout frameLayout) {
        C18070vi.A0d(frameLayout, 0);
        this.A00 = frameLayout;
    }

    public final void setScreenshot(Bitmap bitmap) {
        C18070vi.A0d(bitmap, 0);
        getAddScreenshotImageView().setScreenshot(bitmap);
        setRemoveButtonVisibility(true);
    }

    public final void setWamRuntime(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A08;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AddScreenshotImageView getAddScreenshotImageView() {
        AddScreenshotImageView addScreenshotImageView = this.A05;
        if (addScreenshotImageView != null) {
            return addScreenshotImageView;
        }
        C18070vi.A11("addScreenshotImageView");
        throw null;
    }

    public final FrameLayout getRemoveButton() {
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            return frameLayout;
        }
        C18070vi.A11("removeButton");
        throw null;
    }

    public final AnonymousClass18K getWamRuntime() {
        AnonymousClass18K r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1J();
        throw null;
    }

    public final void setRetryLayoutVisibility(boolean z) {
        C28931bI r1 = this.A07;
        if (r1 == null) {
            C18070vi.A11("mediaUploadRetryViewStubHolder");
            throw null;
        } else {
            r1.A04(C72453Mb.A07(z ? 1 : 0));
        }
    }

    public final void setUploadProgressBarVisibility(boolean z) {
        C28931bI r1 = this.A06;
        if (r1 == null) {
            C18070vi.A11("mediaUploadProgressViewStubHolder");
            throw null;
        } else {
            r1.A04(C72453Mb.A07(z ? 1 : 0));
        }
    }

    public final void setRemoveButtonVisibility(boolean z) {
        getRemoveButton().setVisibility(C72453Mb.A07(z ? 1 : 0));
    }
}
