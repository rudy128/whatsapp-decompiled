package X;

public final class CXL {
    public float A00 = -2.14748365E9f;
    public float A01 = -2.14748365E9f;
    public float A02 = -2.14748365E9f;
    public float A03 = -2.14748365E9f;
    public float A04 = -2.14748365E9f;
    public int A05;
    public C20269AEc A06;
    public C20278AEl A07;

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(this, A10);
        A10.append("{mLatLng=");
        A10.append(this.A06);
        A10.append(", mZoom=");
        A10.append(this.A01);
        A10.append(", mZoomBy=");
        A10.append(this.A02);
        A10.append(", mZoomX=");
        A10.append(this.A03);
        A10.append(", mZoomY=");
        A10.append(this.A04);
        A10.append(", mXPixel=");
        A10.append(-2.14748365E9f);
        A10.append(", mYPixel=");
        A10.append(-2.14748365E9f);
        A10.append(", mRotation = ");
        A10.append(this.A00);
        A10.append(", mRendererBounds=");
        A10.append(this.A07);
        BE8.A1F(A10, ", mWidth=");
        BE8.A1F(A10, ", mHeight=");
        A10.append(", mPadding=");
        A10.append(this.A05);
        return AnonymousClass000.A0y("}", A10);
    }
}
