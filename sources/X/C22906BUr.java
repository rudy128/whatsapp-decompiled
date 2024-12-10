package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BUr  reason: case insensitive filesystem */
public final class C22906BUr extends C25971Cpe implements Cloneable {
    public Rect A00;
    public Rect A01;
    public C26132Csv A02;
    public C26132Csv A03;
    public C26132Csv A04;
    public C26132Csv A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09 = false;
    public Double A0A;
    public Double A0B;
    public Double A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F = 0;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O = 0;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Long A0S;
    public String A0T;
    public List A0U;
    public List A0V;
    public Boolean A0W = false;
    public Boolean A0X = false;
    public Integer A0Y;
    public final C22903BUo A0Z;
    public final Float A0a;
    public final Float A0b;
    public final String A0c;
    public final int[] A0d = C108945cZ.A1W();

    public String A05() {
        String str;
        StringBuilder A0t = BE6.A0t(1000);
        A0t.append("mFocusMode");
        A0t.append('=');
        A0t.append(this.A0H);
        A0t.append(",mAntibanding");
        A0t.append('=');
        A0t.append(this.A0D);
        A0t.append(",mColorEffect");
        A0t.append('=');
        A0t.append(this.A0E);
        A0t.append(",mIsAutoExposureLock");
        A0t.append('=');
        A0t.append(this.A0W);
        A0t.append(",mIsAutoWhiteBalanceLock");
        A0t.append('=');
        A0t.append(this.A0X);
        A0t.append(",mFlashMode");
        A0t.append('=');
        A0t.append(this.A0G);
        A0t.append(",mExposureCompensation");
        A0t.append('=');
        A0t.append(this.A0F);
        A0t.append(",mFocusAreas");
        A0t.append('=');
        A0t.append(C25971Cpe.A03(this.A0U));
        A0t.append(",mHorizontalViewAngle");
        A0t.append('=');
        A0t.append(this.A0a);
        A0t.append(",mVerticalViewAngle");
        A0t.append('=');
        A0t.append(this.A0b);
        A0t.append(",mJpegQuality");
        A0t.append('=');
        A0t.append(this.A0J);
        A0t.append(",mJpegThumbnailQuality");
        A0t.append('=');
        A0t.append(this.A0K);
        A0t.append(",mJpegThumbnailSize");
        A0t.append('=');
        C26132Csv csv = this.A02;
        String str2 = "null";
        if (csv != null) {
            C26132Csv.A01(csv, A0t);
        } else {
            A0t.append(str2);
        }
        A0t.append(",mMeteringAreas");
        A0t.append('=');
        A0t.append(C25971Cpe.A03(this.A0V));
        A0t.append(",mPictureFormat");
        A0t.append('=');
        A0t.append(this.A0M);
        A0t.append(",mPictureSize");
        A0t.append('=');
        C26132Csv csv2 = this.A03;
        if (csv2 != null) {
            C26132Csv.A01(csv2, A0t);
        } else {
            A0t.append(str2);
        }
        A0t.append(",mYuvPictureSize");
        A0t.append('=');
        A0t.append(str2);
        A0t.append(",mPreviewFormat");
        A0t.append('=');
        A0t.append(this.A0N);
        A0t.append(",mPreviewFpsRange");
        A0t.append('=');
        int[] iArr = this.A0d;
        A0t.append(iArr[0]);
        A0t.append('-');
        A0t.append(iArr[1]);
        A0t.append(",mPreviewSize");
        A0t.append('=');
        C26132Csv csv3 = this.A04;
        if (csv3 != null) {
            C26132Csv.A01(csv3, A0t);
        } else {
            A0t.append(str2);
        }
        A0t.append(",mIsoSensitivity");
        A0t.append('=');
        A0t.append(this.A0I);
        A0t.append(",mSceneMode");
        A0t.append('=');
        A0t.append(this.A0P);
        A0t.append(",mIsVideoStabilizationEnabled");
        A0t.append('=');
        A0t.append(this.A08);
        A0t.append(",mIsPreviewStabilizationEnabled");
        A0t.append('=');
        A0t.append(false);
        A0t.append(",mVideoSize");
        A0t.append('=');
        C26132Csv csv4 = this.A05;
        if (csv4 != null) {
            C26132Csv.A01(csv4, A0t);
        } else {
            A0t.append(str2);
        }
        A0t.append(",mWhiteBalance");
        A0t.append('=');
        A0t.append(this.A0Q);
        A0t.append(",mZoom");
        A0t.append('=');
        A0t.append(this.A0R);
        A0t.append(",mPreviewRect");
        A0t.append("=(");
        Rect rect = this.A01;
        if (rect != null) {
            str = rect.flattenToString();
        } else {
            str = str2;
        }
        A0t.append(str);
        A0t.append(')');
        A0t.append(",mPictureRect");
        A0t.append("=(");
        Rect rect2 = this.A00;
        if (rect2 != null) {
            str2 = rect2.flattenToString();
        }
        A0t.append(str2);
        A0t.append(')');
        A0t.append(",mRecordingHint");
        A0t.append('=');
        A0t.append(this.A09);
        A0t.append(",mGpsAltitude");
        A0t.append('=');
        A0t.append(this.A0A);
        A0t.append(",mGpsLongitude");
        A0t.append('=');
        A0t.append(this.A0C);
        A0t.append(",mGpsLatitude");
        A0t.append('=');
        A0t.append(this.A0B);
        A0t.append(",mGpsProcessingMethod");
        A0t.append('=');
        A0t.append(this.A0T);
        A0t.append(",mGpsTimestamp");
        A0t.append('=');
        A0t.append(this.A0S);
        A0t.append(",mPhotoRotation");
        A0t.append('=');
        A0t.append(this.A0L);
        A0t.append(",mVideoRotation");
        A0t.append('=');
        A0t.append(this.A0Y);
        A0t.append(",mIsoSensitivity");
        A0t.append('=');
        A0t.append(this.A0I);
        A0t.append(",mSourceConfig");
        A0t.append('=');
        return AnonymousClass000.A0y(this.A0c, A0t);
    }

    public void A06(CKJ ckj, Object obj) {
        int i = ckj.A00;
        if (i == 3) {
            this.A08 = (Boolean) obj;
        } else if (i == 27) {
            this.A0S = (Long) obj;
        } else if (i == 42) {
            this.A0T = (String) obj;
        } else if (i == 45) {
            this.A06 = (Boolean) obj;
        } else if (i == 52) {
        } else {
            if (i == 57) {
                this.A07 = (Boolean) obj;
            } else if (i != 59) {
                switch (i) {
                    case 8:
                        this.A09 = (Boolean) obj;
                        return;
                    case 9:
                        this.A0H = (Integer) obj;
                        return;
                    case 10:
                        this.A0G = (Integer) obj;
                        return;
                    case 11:
                        this.A0D = (Integer) obj;
                        return;
                    case 12:
                        this.A0E = (Integer) obj;
                        return;
                    case 13:
                        this.A0F = (Integer) obj;
                        return;
                    case 14:
                        this.A0J = (Integer) obj;
                        return;
                    case 15:
                        this.A0K = (Integer) obj;
                        return;
                    default:
                        switch (i) {
                            case 17:
                                this.A0M = (Integer) obj;
                                return;
                            case 18:
                                this.A0N = (Integer) obj;
                                return;
                            case 19:
                                this.A0O = (Integer) obj;
                                return;
                            default:
                                switch (i) {
                                    case 21:
                                        this.A0L = (Integer) obj;
                                        return;
                                    case 22:
                                        this.A0I = (Integer) obj;
                                        return;
                                    case 23:
                                        this.A0P = (Integer) obj;
                                        return;
                                    case 24:
                                        this.A0Q = (Integer) obj;
                                        return;
                                    case 25:
                                        this.A0R = (Integer) obj;
                                        return;
                                    default:
                                        Rect rect = null;
                                        switch (i) {
                                            case 30:
                                                this.A0A = (Double) obj;
                                                return;
                                            case 31:
                                                this.A0C = (Double) obj;
                                                return;
                                            case 32:
                                                this.A0B = (Double) obj;
                                                return;
                                            case 33:
                                                C26132Csv csv = (C26132Csv) obj;
                                                this.A04 = csv;
                                                if (csv != null) {
                                                    rect = new Rect(0, 0, csv.A02, csv.A01);
                                                }
                                                this.A01 = rect;
                                                return;
                                            case 34:
                                                C26132Csv csv2 = (C26132Csv) obj;
                                                this.A03 = csv2;
                                                if (csv2 != null) {
                                                    rect = new Rect(0, 0, csv2.A02, csv2.A01);
                                                }
                                                this.A00 = rect;
                                                return;
                                            case 35:
                                                this.A05 = (C26132Csv) obj;
                                                return;
                                            case 36:
                                                this.A02 = (C26132Csv) obj;
                                                return;
                                            case 37:
                                                this.A0U = C25390Cer.A00((List) obj);
                                                return;
                                            case 38:
                                                this.A0V = C25390Cer.A00((List) obj);
                                                return;
                                            case 39:
                                                int[] iArr = (int[]) obj;
                                                if (iArr != null && iArr.length == 2) {
                                                    int[] iArr2 = this.A0d;
                                                    iArr2[0] = iArr[0];
                                                    iArr2[1] = iArr[1];
                                                    return;
                                                }
                                                return;
                                            default:
                                                throw BEA.A0h("Cannot directly set: ", AnonymousClass000.A10(), i);
                                        }
                                }
                        }
                }
            } else {
                this.A0Y = (Integer) obj;
            }
        }
    }

    public C22906BUr(Camera.Parameters parameters, C22903BUo bUo) {
        List emptyList;
        int i;
        List emptyList2;
        Camera.Size size;
        C26132Csv csv;
        Camera.Size size2;
        Double A0Q2 = AnonymousClass8BV.A0Q();
        this.A0A = A0Q2;
        this.A0C = A0Q2;
        this.A0B = A0Q2;
        this.A0S = C17890vO.A0L();
        this.A0L = 0;
        this.A0I = 0;
        this.A07 = false;
        this.A0Y = 0;
        this.A06 = AnonymousClass000.A0i();
        this.A0c = parameters.flatten();
        this.A0Z = bUo;
        this.A0H = Integer.valueOf(C26160CtY.A02(parameters.getFocusMode()));
        this.A0D = Integer.valueOf(C26160CtY.A00(parameters.getAntibanding()));
        this.A0E = Integer.valueOf(C26160CtY.A01(parameters.getColorEffect()));
        if (BE9.A1T(C25632CjI.A03, bUo)) {
            this.A0W = Boolean.valueOf(parameters.getAutoExposureLock());
        }
        if (BE9.A1T(C25632CjI.A06, bUo)) {
            this.A0X = Boolean.valueOf(parameters.getAutoWhiteBalanceLock());
        }
        this.A0G = Integer.valueOf(C24558C9e.A00(parameters.getFlashMode()));
        if (BE9.A1T(C25632CjI.A0G, bUo)) {
            this.A0F = Integer.valueOf(parameters.getExposureCompensation());
        }
        if (BE9.A1T(C25632CjI.A0U, bUo)) {
            Rect rect = C26170Ctm.A00;
            emptyList = C25390Cer.A00(C26170Ctm.A03(parameters.get("focus-areas")));
        } else {
            emptyList = Collections.emptyList();
        }
        this.A0U = emptyList;
        this.A0a = Float.valueOf(parameters.getHorizontalViewAngle());
        this.A0b = Float.valueOf(parameters.getVerticalViewAngle());
        this.A0J = Integer.valueOf(parameters.getJpegQuality());
        Rect rect2 = C26170Ctm.A00;
        try {
            i = parameters.getJpegThumbnailQuality();
        } catch (NumberFormatException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Invalid jpeg thumbnail quality parameter string=");
            Log.e("ParametersHelper", AnonymousClass000.A0y(parameters.get("jpeg-thumbnail-quality"), A10), e);
            i = 85;
        }
        this.A0K = Integer.valueOf(i);
        try {
            Camera.Size jpegThumbnailSize = parameters.getJpegThumbnailSize();
            this.A02 = new C26132Csv(jpegThumbnailSize.width, jpegThumbnailSize.height);
        } catch (NumberFormatException unused) {
        }
        if (BE9.A1T(C25632CjI.A0V, bUo)) {
            emptyList2 = C25390Cer.A00(C26170Ctm.A03(parameters.get("metering-areas")));
        } else {
            emptyList2 = Collections.emptyList();
        }
        this.A0V = emptyList2;
        this.A0M = Integer.valueOf(parameters.getPictureFormat());
        C26132Csv csv2 = null;
        try {
            size = parameters.getPictureSize();
        } catch (NumberFormatException unused2) {
            size = null;
        }
        CKJ ckj = C25971Cpe.A0k;
        if (size != null) {
            csv = new C26132Csv(size.width, size.height);
        } else {
            csv = null;
        }
        A06(ckj, csv);
        this.A0N = Integer.valueOf(parameters.getPreviewFormat());
        parameters.getPreviewFpsRange(this.A0d);
        if (AnonymousClass000.A1a(bUo.A0Y)) {
            this.A0O = Integer.valueOf(parameters.getPreviewFrameRate());
        }
        this.A0P = Integer.valueOf(C26160CtY.A03(parameters.getSceneMode()));
        this.A08 = Boolean.valueOf(parameters.getVideoStabilization());
        this.A0Q = Integer.valueOf(C26160CtY.A04(parameters.getWhiteBalance()));
        this.A0R = Integer.valueOf(parameters.getZoom());
        try {
            size2 = parameters.getPreviewSize();
        } catch (NumberFormatException unused3) {
            size2 = null;
        }
        A06(C25971Cpe.A0q, size2 != null ? new C26132Csv(size2.width, size2.height) : csv2);
    }

    public Object clone() {
        return super.clone();
    }
}
