public abstract class Exporter {
    /**
     * Exports the given request to a specific format.
     * Contract:
     * - Must accept any valid ExportRequest
     * - Must not throw exceptions for valid input
     * - Must not lose or alter data
     * - Must always return valid ExportResult
     */
    public abstract ExportResult export(ExportRequest req);
}