package X;

import java.util.List;

/* renamed from: X.725  reason: invalid class name */
public class AnonymousClass725 {
    public int A00;
    public long A01;
    public long A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C1418377d A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final String A0Y;
    public final String A0Z;

    public static String A00(AnonymousClass725 r0) {
        String str = r0.A0H;
        C18070vi.A0X(str);
        return str;
    }

    public boolean A02() {
        String str;
        String str2 = this.A03;
        if (str2 == null || (str = this.A0I) == null || str2.equals(str)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("StickerPack{");
        stringBuffer.append("id='");
        stringBuffer.append(this.A0H);
        stringBuffer.append('\'');
        stringBuffer.append(", name='");
        stringBuffer.append(this.A04);
        stringBuffer.append('\'');
        stringBuffer.append(", publisher='");
        stringBuffer.append(this.A0K);
        stringBuffer.append('\'');
        stringBuffer.append(", description='");
        stringBuffer.append(this.A0D);
        stringBuffer.append('\'');
        stringBuffer.append(", size=");
        stringBuffer.append(this.A02);
        stringBuffer.append(", isDownloading=");
        stringBuffer.append(this.A09);
        stringBuffer.append(", trayImageId='");
        stringBuffer.append(this.A0M);
        stringBuffer.append('\'');
        stringBuffer.append(", trayImagePreviewId='");
        stringBuffer.append(this.A0N);
        stringBuffer.append('\'');
        stringBuffer.append(", previewImageIds=");
        stringBuffer.append(this.A06);
        stringBuffer.append(", stickers=");
        stringBuffer.append(this.A07);
        stringBuffer.append(", order=");
        stringBuffer.append(this.A00);
        stringBuffer.append(", isThirdParty=");
        stringBuffer.append(this.A0W);
        stringBuffer.append(", imageDataHash='");
        stringBuffer.append(this.A0I);
        stringBuffer.append('\'');
        stringBuffer.append(", downloadedSize=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", downloadedImageDataHash='");
        stringBuffer.append(this.A03);
        stringBuffer.append('\'');
        stringBuffer.append(", downloadedTrayImageId='");
        stringBuffer.append(this.A0Y);
        stringBuffer.append('\'');
        stringBuffer.append(", downloadedTrayImagePreviewId='");
        stringBuffer.append(this.A0Z);
        stringBuffer.append('\'');
        stringBuffer.append(", isUnseen=");
        stringBuffer.append(this.A0B);
        stringBuffer.append(", isNew=");
        stringBuffer.append(this.A0A);
        stringBuffer.append(", avoidCaching=");
        stringBuffer.append(this.A0P);
        stringBuffer.append(", playLink='");
        stringBuffer.append(this.A0J);
        stringBuffer.append('\'');
        stringBuffer.append(", iOSLink='");
        stringBuffer.append(this.A0G);
        stringBuffer.append('\'');
        stringBuffer.append(", animatedPack=");
        stringBuffer.append(this.A0O);
        stringBuffer.append(", downloadedAnimatedPack=");
        stringBuffer.append(this.A0Q);
        stringBuffer.append(", isAvatarStickerPack=");
        stringBuffer.append(this.A0S);
        stringBuffer.append(", trayIconAvatarStickerTemplateId=");
        stringBuffer.append(this.A0L);
        stringBuffer.append(", emptyFavoritesAvatarStickerTemplateId=");
        stringBuffer.append(this.A0E);
        stringBuffer.append(", emptyRecentsAvatarStickerTemplateId=");
        stringBuffer.append(this.A0F);
        stringBuffer.append(", avatarStickerPackDynamicIcon=");
        stringBuffer.append(this.A0C);
        stringBuffer.append(", lottieStickerPack=");
        stringBuffer.append(this.A0X);
        stringBuffer.append(", downloadedLottieStickerPack=");
        stringBuffer.append(this.A0R);
        stringBuffer.append(", isInInstalledStickerPacksDB=");
        stringBuffer.append(this.A0U);
        stringBuffer.append(", isStickerPackMessage=");
        stringBuffer.append(this.A0V);
        stringBuffer.append(", isCreatedByMe=");
        stringBuffer.append(this.A0T);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public AnonymousClass725(C133296oW r3) {
        String str = r3.A0E;
        C17960vV.A07(str);
        this.A0H = str;
        String str2 = r3.A0G;
        C17960vV.A07(str2);
        this.A04 = str2;
        this.A0K = r3.A0I;
        this.A0D = r3.A03;
        this.A02 = r3.A01;
        this.A09 = r3.A0V;
        this.A05 = r3.A0K;
        this.A0M = r3.A0L;
        this.A0N = r3.A0M;
        List list = r3.A0N;
        C17960vV.A07(list);
        this.A06 = list;
        this.A0W = r3.A0Z;
        List list2 = r3.A0O;
        C17960vV.A07(list2);
        this.A07 = list2;
        this.A0I = r3.A0F;
        this.A01 = r3.A00;
        this.A03 = r3.A06;
        this.A0Y = r3.A09;
        this.A0Z = r3.A0A;
        this.A0P = r3.A0Q;
        this.A0J = r3.A0H;
        this.A0G = r3.A0D;
        this.A0O = r3.A0P;
        this.A0X = r3.A0X;
        this.A0R = r3.A0U;
        this.A0Q = r3.A0R;
        this.A0S = r3.A0S;
        this.A0L = r3.A0J;
        this.A0E = r3.A0B;
        this.A0F = r3.A0C;
        this.A0C = r3.A02;
        this.A0T = r3.A0T;
        this.A0U = r3.A0W;
        this.A0V = r3.A0Y;
    }

    public static boolean A01(Object obj, List list, int i) {
        return ((AnonymousClass725) list.get(i)).A0H.equals(obj);
    }
}
