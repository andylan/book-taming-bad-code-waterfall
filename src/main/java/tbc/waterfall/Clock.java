package tbc.waterfall;

/**
 * Created by ben on 14-2-24.
 */
public abstract class Clock {
    private static final int UTC_OFFSET = 0;
    private int localTime = 0;

    public abstract void setLocalTime(int localTime);

    public static int toLocalTime(int utcZeroTime) {
        return utcZeroTime + UTC_OFFSET;
    }
}
