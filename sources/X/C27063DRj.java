package X;

import java.io.Serializable;

/* renamed from: X.DRj  reason: case insensitive filesystem */
public class C27063DRj implements Serializable {
    public static final long serialVersionUID = 8153954923060974396L;
    public final int cellHighWaterMarkDeltaMs = 0;
    public final float cellLowWaterMarkMultiplier = 0.0f;
    public final int cellMaxLowWaterMarkMs = 0;
    public final int cellMinLowWaterMarkMs = 0;
    public final float waterMarkHighMultiplier = 0.0f;
    public final float waterMarkLowMultiplier = 0.0f;
    public final int wifiHighWaterMarkDeltaMs = 0;
    public final float wifiLowWaterMarkMultiplier = 0.0f;
    public final int wifiMaxLowWaterMarkMs = 0;
    public final int wifiMinLowWaterMarkMs = 0;

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WifiMinLowWaterMarkMs=");
        A10.append(this.wifiMinLowWaterMarkMs);
        A10.append(",WifiMaxLowWaterMarkMs=");
        A10.append(this.wifiMaxLowWaterMarkMs);
        A10.append(",WifiLowWaterMarkMultiplier=");
        A10.append(this.wifiLowWaterMarkMultiplier);
        A10.append(",WifiHighWaterMarkDeltaMs=");
        A10.append(this.wifiHighWaterMarkDeltaMs);
        A10.append(",CellMinLowWaterMarkMs=");
        A10.append(this.cellMinLowWaterMarkMs);
        A10.append(",CellMaxLowWaterMarkMs=");
        A10.append(this.cellMaxLowWaterMarkMs);
        A10.append(",CellLowWaterMarkMultiplier=");
        A10.append(this.cellLowWaterMarkMultiplier);
        A10.append(",CellHighWaterMarkDeltaMs=");
        A10.append(this.cellHighWaterMarkDeltaMs);
        A10.append(",WaterMarkLowMultipler=");
        A10.append(this.waterMarkLowMultiplier);
        A10.append(",WaterMarkHighMultipler=");
        A10.append(this.waterMarkHighMultiplier);
        return A10.toString();
    }
}
