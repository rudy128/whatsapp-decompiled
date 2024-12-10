package X;

public final class BQY extends C24472C5m {
    public static final C25480Cgb A02 = new C25480Cgb(C0M.A0Z, "com.facebook.cameracore.mediapipeline.dataproviders.hairsegmentation.implementation.HairSegmentationDataProviderModule");
    public static final C25480Cgb A03 = new C25480Cgb(C0M.A12, "com.facebook.cameracore.mediapipeline.dataproviders.segmentation.implementation.SegmentationDataProviderModule");
    public final String A00;
    public final String A01;

    public BQY(String str, String str2) {
        C18070vi.A0d(str2, 2);
        if (str.length() == 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Invalid segmentation config, ");
            BE8.A1E(A10, "initNetPath");
            throw AnonymousClass001.A12(str, A10);
        } else if (str2.length() == 0) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Invalid segmentation config, ");
            BE8.A1E(A102, "predictNetPath");
            throw AnonymousClass001.A12(str2, A102);
        } else {
            this.A00 = str;
            this.A01 = str2;
        }
    }
}
