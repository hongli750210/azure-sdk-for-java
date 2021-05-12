// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.handler;

import com.azure.core.util.Configuration;
import com.azure.core.util.logging.LogLevel;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.LogRecord;
import java.util.logging.Level;
import static com.azure.core.util.Configuration.PROPERTY_AZURE_LOG_LEVEL;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for {@link JUL2SLF4JHandler}.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JUL2SLF4JHandler4LogManagerTest {

    private static final Configuration CONFIGURATION = Configuration.getGlobalConfiguration();
    private static Logger julLogger = null;

    @BeforeAll
    public void beforeAll() {
        JUL2SLF4JHandler.removeHandlersForRootLogger();
        LogManager.getLogManager().getLogger("").setLevel(Level.ALL);
        JUL2SLF4JHandler.install();
        julLogger = Logger.getLogger(JUL2SLF4JHandler4Logger.class.getName());
    }

    @AfterAll
    public void afterAll() {
        JUL2SLF4JHandler.uninstall();
    }

    @Test
    public void testDebugWithoutParameters() {
        CONFIGURATION.put(PROPERTY_AZURE_LOG_LEVEL, String.valueOf(LogLevel.VERBOSE.getLogLevel()));
        LogRecord infoLogRecord = new LogRecord(Level.FINEST, "Debug message without parameters and throwable");
        infoLogRecord.setLoggerName(julLogger.getName());
        julLogger.log(infoLogRecord);
        assertEquals(JUL2SLF4JHandler.isInstalled(), true);
    }

    @Test
    public void testDebugWithParameters1() {
        CONFIGURATION.put(PROPERTY_AZURE_LOG_LEVEL, String.valueOf(LogLevel.VERBOSE.getLogLevel()));
        LogRecord infoLogRecord = new LogRecord(Level.FINEST, "Debug message with parameters {0}/{1}/{2}/{3}, and without throwable");
        infoLogRecord.setParameters(new Object[]{"Parameter 1", "Parameter 2", "Parameter 3", "Parameter 4"});
        infoLogRecord.setLoggerName(julLogger.getName());
        julLogger.log(infoLogRecord);
        assertEquals(JUL2SLF4JHandler.isInstalled(), true);
    }

    @Test
    public void testDebugWithParameters2() {
        CONFIGURATION.put(PROPERTY_AZURE_LOG_LEVEL, String.valueOf(LogLevel.VERBOSE.getLogLevel()));
        LogRecord infoLogRecord = new LogRecord(Level.FINEST, "Debug message with parameters {0}/{1}/{2}/{3}, and throwable");
        infoLogRecord.setParameters(new Object[]{"Parameter 1", "Parameter 2", "Parameter 3", "Parameter 4"});
        infoLogRecord.setThrown(new Throwable("Test throwable message"));
        infoLogRecord.setLoggerName(julLogger.getName());
        julLogger.log(infoLogRecord);
        assertEquals(JUL2SLF4JHandler.isInstalled(), true);
    }

    @Test
    public void testInfoWithoutParameters() {
        CONFIGURATION.put(PROPERTY_AZURE_LOG_LEVEL, String.valueOf(LogLevel.INFORMATIONAL.getLogLevel()));
        LogRecord infoLogRecord = new LogRecord(Level.INFO, "Info message without parameters and throwable");
        infoLogRecord.setLoggerName(julLogger.getName());
        julLogger.log(infoLogRecord);
        assertEquals(JUL2SLF4JHandler.isInstalled(), true);
    }

    @Test
    public void testInfoWithParameters() {
        CONFIGURATION.put(PROPERTY_AZURE_LOG_LEVEL, String.valueOf(LogLevel.INFORMATIONAL.getLogLevel()));
        LogRecord infoLogRecord = new LogRecord(Level.INFO, "Info message with parameters {0}/{1}/{2}/{3}, but without throwable");
        infoLogRecord.setLoggerName(julLogger.getName());
        infoLogRecord.setParameters(new Object[]{"Parameter 1", "Parameter 2", "Parameter 3", "Parameter 4"});
        julLogger.log(infoLogRecord);
        assertEquals(JUL2SLF4JHandler.isInstalled(), true);
    }


    @Test
    public void testWarningWithoutParameters() {
        CONFIGURATION.put(PROPERTY_AZURE_LOG_LEVEL, String.valueOf(LogLevel.WARNING.getLogLevel()));
        LogRecord infoLogRecord = new LogRecord(Level.WARNING, "Warning message without parameters and throwable");
        infoLogRecord.setLoggerName(julLogger.getName());
        julLogger.log(infoLogRecord);
        assertEquals(JUL2SLF4JHandler.isInstalled(), true);
    }

    @Test
    public void testWarningWithParameters1() {
        CONFIGURATION.put(PROPERTY_AZURE_LOG_LEVEL, String.valueOf(LogLevel.WARNING.getLogLevel()));
        LogRecord infoLogRecord = new LogRecord(Level.WARNING, "Warning message with parameters {0}/{1}/{2}/{3}, and without throwable");
        infoLogRecord.setParameters(new Object[]{"Parameter 1", "Parameter 2", "Parameter 3", "Parameter 4"});
        infoLogRecord.setLoggerName(julLogger.getName());
        julLogger.log(infoLogRecord);
        assertEquals(JUL2SLF4JHandler.isInstalled(), true);
    }

    @Test
    public void testWarningWithParameters2() {
        CONFIGURATION.put(PROPERTY_AZURE_LOG_LEVEL, String.valueOf(LogLevel.WARNING.getLogLevel()));
        LogRecord infoLogRecord = new LogRecord(Level.WARNING, "Warning message with parameters {0}/{1}/{2}/{3}, and throwable");
        infoLogRecord.setParameters(new Object[]{"Parameter 1", "Parameter 2", "Parameter 3", "Parameter 4", new Throwable("Test throwable message")});
        infoLogRecord.setThrown(new Throwable("Test throwable message"));
        infoLogRecord.setLoggerName(julLogger.getName());
        julLogger.log(infoLogRecord);
        assertEquals(JUL2SLF4JHandler.isInstalled(), true);
    }

    @Test
    public void testErrorWithoutParameters() {
        CONFIGURATION.put(PROPERTY_AZURE_LOG_LEVEL, String.valueOf(LogLevel.ERROR.getLogLevel()));
        LogRecord infoLogRecord = new LogRecord(Level.SEVERE, "Error message without parameters and throwable");
        infoLogRecord.setLoggerName(julLogger.getName());
        julLogger.log(infoLogRecord);
        assertEquals(JUL2SLF4JHandler.isInstalled(), true);
    }

    @Test
    public void testErrorWithParameters1() {
        CONFIGURATION.put(PROPERTY_AZURE_LOG_LEVEL, String.valueOf(LogLevel.ERROR.getLogLevel()));
        LogRecord infoLogRecord = new LogRecord(Level.SEVERE, "Error message with parameters {0}/{1}/{2}/{3}, and without throwable");
        infoLogRecord.setParameters(new Object[]{"Parameter 1", "Parameter 2", "Parameter 3", "Parameter 4"});
        infoLogRecord.setLoggerName(julLogger.getName());
        julLogger.log(infoLogRecord);
        assertEquals(JUL2SLF4JHandler.isInstalled(), true);
    }

    @Test
    public void testErrorWithParameters2() {
        CONFIGURATION.put(PROPERTY_AZURE_LOG_LEVEL, String.valueOf(LogLevel.ERROR.getLogLevel()));
        LogRecord infoLogRecord = new LogRecord(Level.SEVERE, "Error message with parameters {0}/{1}/{2}/{3}, and throwable");
        infoLogRecord.setParameters(new Object[]{"Parameter 1", "Parameter 2", "Parameter 3", "Parameter 4"});
        infoLogRecord.setThrown(new Throwable("Test throwable message"));
        infoLogRecord.setLoggerName(julLogger.getName());
        julLogger.log(infoLogRecord);
        assertEquals(JUL2SLF4JHandler.isInstalled(), true);
    }
}
