package com.cartoonishvillain.incapacitated.capability;

public interface IPlayerCapability {
    boolean getIsIncapacitated();
    void setIsIncapacitated(boolean isIncapacitated);
    int getTicksUntilDeath();
    boolean countTicksUntilDeath();
    void setTicksUntilDeath(int ticks);
    int getDownsUntilDeath();
    void setDownsUntilDeath(int downs);
    boolean giveUpJumpCount();
    void resetGiveUpJumps();
    int getJumpCount();
    void setJumpCount(int jumps);
}
