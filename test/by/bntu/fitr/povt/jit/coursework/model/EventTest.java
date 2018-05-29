/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Swyatoslaw
 */
public class EventTest {

    @Test
    public void testCheckFail1() {
        Activity a = new Event(2018, 4, 21, 1, 1, "", null, 0, 0, Activity.WeekDay.TUESDAY);
        assertFalse(a.check());
    }

    @Test
    public void testCheckFail2() {
        Activity a = new Event(2018, 3, 25, 0, 0, "", null, 0, 0, Activity.WeekDay.TUESDAY);
        assertFalse(a.check());
    }

    @Test
    public void testCheckFail3() {
        Activity a = new Event(2017, 5, 25, 0, 0, "", null, 0, 0, Activity.WeekDay.TUESDAY);
        assertFalse(a.check());
    }

    @Test
    public void testCheckFail4() {
        Activity a = new Event(2017, 5, 30, 0, 0, "", null, 0, 0, Activity.WeekDay.TUESDAY);
        assertFalse(a.check());
    }
    
    @Test
    public void testCheck() {
        Activity a = new Event(2018, 6, 21, 0, 0, "", null, 0, 0, Activity.WeekDay.TUESDAY);
        assertTrue(a.check());
    }

    @Test
    public void testCheck2() {
        Activity a = new Event(2018, 5, 23, 0, 0, "", null, 0, 0, Activity.WeekDay.TUESDAY);
        assertTrue(a.check());
    }

    @Test
    public void testCheck3() {
        Activity a = new Event(2019, 4, 10, 0, 0, "", null, 0, 0, Activity.WeekDay.TUESDAY);
        assertTrue(a.check());
    }
    
}
